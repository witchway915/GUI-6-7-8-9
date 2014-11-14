
// MyLine.java
import java.awt.Color;
import java.awt.Graphics;
    
public class MyLine extends MyShape
{
    
    public MyLine()  
    {     
        super();
    } // end ctor
    
    public MyLine(int x1, int y1, int x2, int y2, Color MyColor, boolean filled)
    {    
        super(x1, y1, x2, y2, MyColor, filled);
        
    } // end ctor
    
  
    public void draw(Graphics g)    
    {
        g.drawLine(getX1(), getY1(), getX2(), getY2());
    } // end draw()
} // end class MyLine

