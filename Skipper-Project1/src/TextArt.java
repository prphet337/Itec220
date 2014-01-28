
/*
 * Driver program used to ask the user for grid size input and lists the menu
 * for user input to create Text Art.
 */
public class TextArt 
{
 protected TextArt()
 {
	 
 }
 public static void main(String[] args)
 {
	 // Driver Method.
	 TextArtGrid setupGrid = new TextArtGrid();
	 TextArtMenu createMenu = new TextArtMenu();
	 
	 // Grid Setup.
	 setupGrid.gridWidthSetup();
	 setupGrid.gridHeightSetup();
	 int width = setupGrid.getWidth();
	 int height = setupGrid.getHeight();
	 
	 char[][] grid = new char[height][width];
	 
	 // sets the array to "-".
	 setupGrid.initializeArray(grid);
	 
	 System.out.println(" ");
	 
	 // prints array
	 setupGrid.printArray(grid);
	 
	 // prints the menu.
	 createMenu.Menu(grid, width, height);
	 
 }
}
