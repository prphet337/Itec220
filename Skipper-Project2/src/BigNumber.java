/* Class to create the two stacks used for the user's input.
 ** Numbers are pushed into the stacks via the setupGUI class.
 */
 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;

public class BigNumber 
{
		Stack number1 = new Stack();
		
		public void push(int x)
		{
			number1.push(x);
		}
		
		public int pop()
		{
			return (Integer)number1.pop();
		}
		
		public boolean isEmpty()
		{
			return number1.isEmpty();
		}

}
