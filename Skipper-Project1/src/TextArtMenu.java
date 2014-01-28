

import java.util.Scanner;
import java.util.Locale;
/*
 * This class creates a menu of options that can be used while 
 * the program is running
 */
public class TextArtMenu 
{

	protected TextArtMenu()
	{
		
	}
	
	// initializes objects of outside classes.
	private ChangeCharacter CCObject = new ChangeCharacter();
	private TextArtGrid setupGrid = new TextArtGrid();
	private CountOccurances countCharacter = new CountOccurances();
	
	// initializes strings used for menu selection.
	private String changeCharacter = "cc";
	private String changeAll = "ca";
	private String countOccurance = "co";
	private String quit = "q";
	private String yes = "yes";
	private String no = "no";
	
	protected void Menu(char[][] grid, int width, int height)
	{
		Scanner menuSelectionStore = new Scanner(System.in);
		Scanner Quit = new Scanner(System.in);
		
		// prints the user menu.
		System.out.println("");
		System.out.println(" ");
		System.out.println("Choose an option.");
		System.out.println("");
		System.out.println("Use CC or cc for Change Character.");
		System.out.println("Use CA or ca for Change All.");
		System.out.println("Use CO or co for Count Occurances.");
		System.out.println("Use Q or q for quit.");
		System.out.println("");
		
		// prompts for menu selection.
		System.out.print("Menu Selection: ");
		// reads the users input.
		String menuSelection = menuSelectionStore.nextLine();
		menuSelection = menuSelection.toLowerCase();
		
		if(menuSelection.equals(changeCharacter) || menuSelection.equals(changeAll)||
				menuSelection.equals(countOccurance)|| menuSelection.equals(quit));
		{
			if(menuSelection.equals(changeCharacter))
			{
				CCObject.changeCharacter(grid, width, height);
				menuSelection = "";
				setupGrid.printArray(grid);
				Menu(grid, width, height);
			}
			
			else if(menuSelection.equals(changeAll))
			{
				CCObject.changeOccurences(grid);
				menuSelection = "";
				setupGrid.printArray(grid);
				Menu(grid, width, height);
			}
			
			else if(menuSelection.equals(countOccurance))
			{
				countCharacter.countOccurance(grid);
				menuSelection = "";
				setupGrid.printArray(grid);
				Menu(grid, width, height);
			}
			
			else if(menuSelection.equals(quit))
			{
				// prompts user if they are sure if they want to quit.
				System.out.print("Are you sure you want to quit? Type yes " +
						"or no to confirm.");
				// reads the users input.
				 String confirmQuit = Quit.nextLine();
				{
					if(confirmQuit.equals(yes))
					{
						System.exit(0);
					}
					
					else if(confirmQuit.equals(no))
					{
						Menu(grid, width, height);
					}
				}
			}
		}
	}

}
