
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public abstract class MyShape 
{
    private int x1, x2, y1, y2;
    private Color myColor;  // color of this shape
    private boolean filled;
    private Random randomNumbers = new Random();
    
    public MyShape()
    {
        setX1(0);
        setX2(0);
        setY1(0);
        setY2(0);
        setColor(Color.BLACK);
   
        
        
    }  //end MyShape()
    
    public MyShape( int x1, int y1, int x2, int y2, Color MyColor, boolean isfilled)
    {
        setX1(x1);
        setX2(x2);
        setY1(y1);
        setY2(y2);
        setColor(MyColor);
        
     
       
    }   //end MyShape( int x1, int x2, int y1, int y2)  
    
    public void setX1(int x)
    {
        x1 = (x >= 0 ? x : 0);
    }   ///end setX1  
    
    public void setX2(int x)
    {
        x2 = (x >= 0 ? x : 0);
    }   ///end setX2
    
    public void setY1(int y)
    {
        y1 = (y >= 0 ? y : 0);
    }   ///end setY1
    
    public void setY2(int y)
    {
        y2 = (y >= 0 ? y : 0);
    }   ///end setY2
    
    public int getX1()
    {
        return x1;
    }        //end getX1
    
    public int getX2()
    {
        return x2;
    }        //end getX2
    
    public int getY1()
    {
        return y1;
    }        //end getY1
    
    public int getY2()
    {
        return y2;
    }        //end getY2
    
        public void setFilled(boolean isFilled)
    {
    isFilled = filled;
    }//end setfilled
    
    public boolean getFilled()
    {
    return filled;
    }//end getFilled
    
     public void setColor(Color color) 
    {
           myColor = color;
    }//end setcolor
    
    public Color getColor() 
    {
        return myColor;
    }//end getcolor

    public abstract void draw (Graphics g);            

    
}//end class MyShape