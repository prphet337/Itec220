/*
* For my live data project I made a small application that will show 
 * information from the website www.reddit.com.
 * 
 * The API allows you to get a JSON file of any user without a password
 * and shows the users acount information that is public to other users.
 * 
 * Driver.java creates new Gui object and starts program
 */ 
 
public class Driver 
{
	

	public static void main(String[] args) 
	{
		
		Display frame = new Display();
		frame.setVisible(true);
	}
}
