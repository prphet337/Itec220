import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map.Entry;



public class Login 
{
	String tempJSON, name, cKarma, lKarma, id, mail;
	// Some of the following code was recieved from http://stackoverflow.com/questions/8116825/
	// i-am-unable-to-use-reddits-apis-to-log-in and slightly modified
	public void login(String user) throws Exception
    {
 
		
		String url = new String("https://ssl.reddit.com/api/login/"+user);
		URL x = new URL(url);
		

        String data = "api_type=json&user=" + user;
        HttpURLConnection ycConnection = null;
        ycConnection = ( HttpURLConnection ) x.openConnection();
        ycConnection.setRequestMethod( "POST" );
        ycConnection.setDoOutput( true );
        ycConnection.setUseCaches( false );
        ycConnection.setRequestProperty( "Content-Type",
            "application/x-www-form-urlencoded; charset=UTF-8" );
        ycConnection.setRequestProperty( "Content-Length", String.valueOf( data.length() ) );

        DataOutputStream wr = new DataOutputStream(
                ycConnection.getOutputStream() );
            wr.writeBytes( data );
            wr.flush();
            wr.close();
            InputStream is = ycConnection.getInputStream();
            BufferedReader rd = new BufferedReader( new InputStreamReader( is ) );
            String line;
            StringBuffer response = new StringBuffer();
            while ( ( line = rd.readLine() ) != null )
            {
                response.append( line );
                response.append( '\r' );
            }
            for ( Entry< String, List< String >> r : ycConnection.getHeaderFields().entrySet() )
            {
                System.out.println( r.getKey() + ": " + r.getValue());
            }
            rd.close(); 
            //System.out.println( response.toString() );
            
            this.tempJSON = response.toString();
            
            	if(testVal(response.toString())==true)
            	{
            	
                getJSONCode(user);
            	}
            }
	public void getJSONCode(String userName) throws Exception
	{
    	String jsonCode = "";
    	
		String x = "http://www.reddit.com/user/"+userName+"/about.json";
		try{
		readURL(x);
		}
		catch(FileNotFoundException e){
			System.out.println("Invalid entry, user does not exist");
			System.exit(0);
			
		}
		
		jsonCode = readURL(x);
		getInformation(jsonCode);

     }
	
	public void getInformation(String json)
	{
		JSONObject info = JSONObject.fromObject(json);
		JSONObject redd = (JSONObject)(info.getJSONObject("DATA"));
		
		System.out.println("Link Karma: " +redd.get("Link_karma"));
		System.out.println("Comment Karma: " +redd.get("Comment_Karma"));
		
		setdata(redd.get("Link_Karma").toString(), redd.get("Comment_Karma").toString(),
				redd.get("mail").toString(), redd.get("ID").toString());
	}
	
	//setter for local variables from json Strings
		public void setdata(String lKarma, String cKarma, String mail, String id)
		{
			this.lKarma = lKarma;
			this.cKarma = cKarma;
			this.mail = mail;
			this.id = id;
			
			if(this.mail.equals(null))
			{
				this.mail = "0";
			}
		}
		
		public boolean testVal(String resp)
		{
			JSONObject obj = JSONObject.fromObject(tempJSON);
			JSONObject reddit = (JSONObject)(obj.getJSONObject("json"));
			
			boolean isValid = false;
			String error;
			
			error = reddit.getString("errors").toString();
			
			
			if(error.substring(3, 12).equals("RATELIMIT"))
			{
				System.out.println("Overflow on Server. Try Again Later.");
				System.exit(0);
			}
			
			else if(error.equals("[]"))
			{
				System.out.println("Login Successful.");
				isValid = true;
			}
			
			return isValid;
		}	
		
		//getters for local variables
		public String getLKarma()
		{
			return this.lKarma;
			
		}
		public String getCKarma()
		{
			return this.cKarma;
			
		}
		public String getMail()
		{
			return this.mail;
			
		}
		public String getID()
		{
			return this.id;
			
		}
	
	//readURL given in lab5
    public static String readURL(String webservice) throws Exception {
    	URL oracle = new URL(webservice);
    	BufferedReader in = new BufferedReader(
        new InputStreamReader(
        oracle.openStream()));

    	String inputLine;
    	String result = "";

    	while ((inputLine = in.readLine()) != null)
    		result = result + inputLine;

    	in.close();
    	return result;
    }
	
}

