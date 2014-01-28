

class AllowedCharacters 
{
	
	protected AllowedCharacters()
	{
		
	}
	
	protected boolean charCheck(char input)
	{
		boolean charCheck = false;
		
		// checks the input to see if it is one of the allowed 
		// characters (-, +, V, ^, /, \, and |)
		if(input == '-')
		{
			charCheck = true;
		}
		
		else if(input == '+')
		{
			charCheck = true;
		}
		
		else if(input == 'V')
		{
			charCheck = true;
		}
		
		else if(input == '^')
		{
			charCheck = true;
		}
		
		else if(input == '/')
		{
			charCheck = true;
		}
		
		else if(input == '\\')
		{
			charCheck = true;
		}
		
		else if(input == '|')
		{
			charCheck = true;
		}
		
		return charCheck;
		
	}
}
