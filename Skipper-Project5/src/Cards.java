import java.awt.*;
import javax.swing.*;

public class Cards
{
	// fields
    ImageIcon _image;
    int       _x;
    int       _y;
    String card_value;
   // String suit;
    
    // constructor
    public Cards(char card_value, int suit) 
    {
    	this.card_value = String.valueOf(card_value);
    	//this.suit = String.valueOf(suit);
       // _image = image;
    }
    
    // moveTo
    public void moveTo(int x, int y) 
    {
        _x = x;
        _y = y;
    }
    
    // contains
    public boolean contains(int x, int y) 
    {
        return (x > _x && x < (_x + getWidth()) && 
                y > _y && y < (_y + getHeight()));
    }
    
    // getWidth
    public int getWidth() 
    {
        return _image.getIconWidth();
    }
    
    // getHeight
    public int getHeight() 
    {
        return _image.getIconHeight();
    }
    
    // getX
    public int getX() 
    {
        return _x;
    }
    
    // getY
    public int getY() 
    {
        return _x;
    }
    
    // draw
    public void draw(Graphics g, Component c) 
    {
        _image.paintIcon(c, g, _x, _y);
    }
}

