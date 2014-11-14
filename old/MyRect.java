
import java.awt.Color;
import java.awt.Graphics;
    
public class MyRect extends MyShape
{
    public MyRect()  
    {
        super();
    } // end ctor
    
    public MyRect(int x1, int y1, int x2, int y2, Color MyColor, boolean filled)
    {    
        super(x1, y1, x2, y2, MyColor, filled);
    } // end ctor
    
    public void draw(Graphics g)    // draw the line
    {
        g.drawRect(Math.min(getX1(), getX2()), Math.min(getY1(), getY2()), Math.abs(getX2() - getX1()), Math.abs(getY2() - getY1()));
    } // end draw()
} // end class MyLine


