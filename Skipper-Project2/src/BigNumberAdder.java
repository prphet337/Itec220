// Class used to add the two stacks together.

public class BigNumberAdder 
{
	public String add(BigNumber number1, BigNumber number2)
	{
		int a;
		int b;
		int c = 0;
		String d = "";
		String e = "";
		
		while(!number1.isEmpty() || !number2.isEmpty())
		{
			if(!number1.isEmpty())
			{
				a = number1.pop();
			}
			else 
			{
				a = 0;
			}
			if(!number2.isEmpty())
			{
				b = number2.pop();
		
			}
			else 
			{
				b = 0;
			}
			
			c = a + b + c;
			d = d + (c % 10);
			c = c / 10;
		}
		if(c > 0)
		{
			d += c;
		}
		
		for(int i = 1; i <= d.length(); i++)
		{
			e += d.charAt(d.length()-i);
		}
		
		return e;
	}
}
