

import java.util.Scanner;

class CountOccurances 
{

	protected void countOccurance(char[][] grid)
	{
		
		Scanner scan = new Scanner(System.in);
		int occurance = 0;
		char characterToCount = 0;
		
		// prompts user for a character to count.
		System.out.print("Count which character? ");
		String character = scan.nextLine();
		
		characterToCount = character.charAt(0);
		
		do
		{
			if(characterToCount !='-' && characterToCount != '+' && characterToCount != 'V'
					&& characterToCount != '^' && characterToCount != '/' && characterToCount != '\\' 
						&& characterToCount != '|')
			{
				System.out.println("You have entered an invalid character.");
				System.out.print("Count which character? ");
				character = scan.nextLine();
				
				characterToCount = character.charAt(0);
			}
		}
		
		while(characterToCount !='-' && characterToCount != '+' && characterToCount != 'V'
				&& characterToCount != '^' && characterToCount != '/' && characterToCount != '\\' 
					&& characterToCount != '|');
		
		for (int gridRowLocation = 0; gridRowLocation < grid.length; gridRowLocation++)
		{
			for(int gridColLocation = 0; gridColLocation < grid[gridRowLocation].length; gridColLocation++)
			{
				if (characterToCount == (grid [gridRowLocation][gridColLocation]))
				{
					occurance++;
				}
			}
		}
		
		System.out.println("There are " +occurance+ " occurances of " +characterToCount);
			
	}
}
