

import java.util.*;
/* This class is used to set up the initial 2D array used for the characters
 * as well as setting the initial values in the grid to "-".
 */
class TextArtGrid 
{

	protected TextArtGrid()
	{
		
	}
	
	int gridWidth = 0;
	int gridHeight = 0;
	
	protected void gridWidthSetup()
	{
		Scanner width = new Scanner(System.in);
		int gridWidthTempStore = 0;
		
		do
		{
			// prompts for width size.
			System.out.print("Enter a width size between 0 and 50000: ");
			
			try
			{
				
				// reads the int value.
				gridWidthTempStore = width.nextInt();
				if(gridWidthTempStore < 0 || gridWidthTempStore >= 50001)
				{
					System.out.println("The number entered is not a Valid Number");
				}
			}
			// end of try.
				
				// catches the mismatch exception.
				catch(java.util.InputMismatchException e)
				{
					System.out.println("The number entered is not a Whole Number");
					width.next();
				}
				// end of catch.	

		}
			while(gridWidthTempStore < 0 || gridWidthTempStore >= 50001);
		
			gridWidth = gridWidthTempStore;
	}
	
	protected void gridHeightSetup()
	{
		Scanner height = new Scanner(System.in);
		int gridHeightTempStore = 0;
		
		do
		{
			// prompts for height size.
			System.out.print("Enter a heigth size between 0 and 50000: ");
			
			try
			{
				
				// reads the int value.
				gridHeightTempStore = height.nextInt();
				if(gridHeightTempStore < 0 || gridHeightTempStore >= 50000)
				{
					System.out.println("The number entered is not a Valid Number");
				}
			}
			// end of try.
				
				// catches the mismatch exception.
				catch(java.util.InputMismatchException e)
				{
					System.out.println("The number entered is not a Whole Number");
					height.next();
				}
				// end of catch.	

		}
			while(gridHeightTempStore < 0 || gridHeightTempStore >= 50001);
		
			gridHeight = gridHeightTempStore;
	}
	
	protected int getWidth()
	{
		return gridWidth;
	}
	
	protected int getHeight()
	{
		return gridHeight;
	}
	
	protected void initializeArray(char[][] grid)
	{
		// initializes the array to be "-".
		for (int gridWidthLocation = 0; gridWidthLocation < grid.length; gridWidthLocation++)
		{
			for(int gridHeightLocation = 0; gridHeightLocation < grid[gridWidthLocation].length; gridHeightLocation++)
			{
				grid[gridWidthLocation][gridHeightLocation] = '-';
				
			}
		}
	}
	
	protected void printArray(char[][] grid)
	{
		int col = 0;
		
		for (int gridRowLocation = 0; gridRowLocation < grid[0].length+1; gridRowLocation++)
		{
			if (col == 0)
			{
				System.out.print("   ");
			}
			else if (col > 9)
			{
				System.out.print(col +" ");
			}
			else
			{
				System.out.print(col +"  ");
			}
			col++;
		}
		System.out.println("");
		//Prints array with row labels
		for (int gridRowLoc = 0; gridRowLoc < grid.length; gridRowLoc++)
		{
			//Prints row labels
			if (gridRowLoc < 9)
			{
				System.out.print (gridRowLoc +1+ "  ");// labels rows
			}
			else
			{
				System.out.print(gridRowLoc +1+ " ");
			}
			//Prints
			for(int gridColumnLocation = 0; gridColumnLocation < grid[gridRowLoc].length; gridColumnLocation++)
			{
					System.out.print (grid [gridRowLoc][gridColumnLocation]+"  ");
			}
			System.out.println("");
		}
	}

}
	
	
	
	

