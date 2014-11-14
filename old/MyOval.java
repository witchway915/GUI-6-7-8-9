import java.awt.Color;
import java.awt.Graphics;
    
public class MyOval extends MyShape
{
    public MyOval()   // initialize fields with default values
    {     
        super();
    } // end ctor
    
    public MyOval(int x1, int y1, int x2, int y2, Color MyColor, boolean filled)
    {    
        super(x1, y1, x2, y2, MyColor, filled);
    } // end ctor

    public void draw(Graphics g)    // draw the line
    {
        g.drawOval(Math.min(getX1(), getX2()), Math.min(getY1(), getY2()), Math.abs(getX2() - getX1()), Math.abs(getY2()-getY2()));
    } // end draw()
} // end class MyLine


