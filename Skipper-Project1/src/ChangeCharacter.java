

import java.util.*;
/* This Class is used when the user selects the option for either 
 * "Change Character" or "Replace All"from the menu.
 */
class ChangeCharacter 
{
	
	protected ChangeCharacter()
	{
		
	}
	
	protected void changeCharacter(char[][] grid, int gridWidth, int gridHeight)
	{
		Scanner tempStore = new Scanner(System.in);
		int rowPos = 0;
		int colPos = 0;
		
		do
		{
			// asking for a row position in the grid.
			System.out.print("Enter a row position: ");
			
			try
			{
				// reads in the int value.
				rowPos = tempStore.nextInt();
				
				if(rowPos <= 0 || rowPos > gridWidth)
				{
					System.out.println("You have entered an invalid row position.");
				}
			}
			// end of try.
			
			// catches mismatch exception and re-prompts.
			catch(java.util.InputMismatchException e)
			{
				System.out.println("The number entered is not a Whole Number");
				tempStore.next();
				rowPos = 900;
			}
			// end of catch.
		}
		
		while(rowPos <= 0 || rowPos > gridWidth);
			
			do
			{
				System.out.print("Enter a column position: ");
				
				try
				{
					// reads in the int value.
					colPos = tempStore.nextInt();
					
					if(colPos <= 0 || colPos > gridHeight)
					{
						System.out.println("You have entered an invalid column position.");
					}
				}
				// end of try.
				
				// catches mismatch exception and re-prompts.
				catch(java.util.InputMismatchException e)
				{
					System.out.println("The number entered is not a Whole Number");
					tempStore.next();
					colPos = 900;
				}
				// end of catch.
			}
			
			while(colPos <= 0 || colPos > gridHeight);
			
			
			// asks the user for the character to change.
			Scanner scan = new Scanner(System.in);
			char charReplacement = 0;
			String character;
			
			System.out.print("Choose either /, \\, |, ^, V, -, or + to replace with: ");
			character = scan.nextLine();
			charReplacement = character.charAt(0);
			
			//loop used for checking for the valid character.
			do
			{
				if(charReplacement != '-' && charReplacement != '+' &&
						charReplacement != 'V' && charReplacement != '/' && 
							charReplacement != '\\' && charReplacement != '|' && charReplacement != '^')
					// end of loop.
				{
					// re-prompts user for character.
					System.out.println("Invalid Character.");
					System.out.print("Re-enter: ");
					character = scan.nextLine();
					System.out.print("Replace with: ");
					charReplacement = character.charAt(0);
				}
			}
			
			while(charReplacement != '-' && charReplacement != '+' &&
					charReplacement != 'V' && charReplacement != '/' && 
					charReplacement != '\\' && charReplacement != '|' && charReplacement != '^');
			// end of loop.
			
				grid[rowPos-1][colPos-1] = charReplacement;
			
	}
	
	protected void changeOccurences(char[][] grid)
	{
		Scanner scan = new Scanner(System.in);
		char characterToCount = 0;
		char charReplacement = 0;
		String character;
		
		// prompts the user for a character change.
		System.out.print("Find: ");
		character = scan.nextLine();
		characterToCount = character.charAt(0);
		
		// loop checking for valid char.
		do
		{
			// checks grid for valid characters.
			if(characterToCount != '-' && characterToCount != '+' &&
					characterToCount != 'V' && characterToCount != '/' && 
						characterToCount != '\\' && characterToCount != '|' && characterToCount != '^')
			{
				// re-prompts user for valid character input.
				System.out.println("Invalid Character.");
				System.out.print("Re-enter: ");
				character = scan.nextLine();
				characterToCount = character.charAt(0);
			}
			
		
		}
		
		while(characterToCount != '-' && characterToCount != '+' &&
				characterToCount != 'V' && characterToCount != '/' && 
					characterToCount != '\\' && characterToCount != '|' && characterToCount != '^');
		
		// prompt user for character to replace with.
		System.out.print("Choose either /, \\, |, ^, V, -, or + to replace with: ");
		character = scan.nextLine();
		charReplacement = character.charAt(0);
		
		// loop checking for valid character.
		do
		{
			// checks grid for valid characters.
			if(charReplacement != '-' && charReplacement != '+' &&
					charReplacement != 'V' && charReplacement != '/' && 
						charReplacement != '\\' && charReplacement != '|' && charReplacement != '^')
			{
				// re-prompts user for valid character input.
				System.out.println("Invalid Character.");
				System.out.print("Re-enter: ");
				character = scan.nextLine();
				charReplacement = character.charAt(0);
			}
		}
		
		while(charReplacement != '-' && charReplacement != '+' &&
				charReplacement != 'V' && charReplacement != '/' && 
					charReplacement != '\\' && charReplacement != '|' && charReplacement != '^');
		
		for(int gridRowLocation = 0; gridRowLocation < grid.length; gridRowLocation++)
		{
			for(int gridColLocation = 0; gridColLocation < grid[gridRowLocation].length; gridColLocation++)
			{
				if(characterToCount == (grid[gridRowLocation][gridColLocation]))
				{
					grid[gridRowLocation][gridColLocation] = charReplacement;
				}
			}
		}
	}
}
