
// DrawPanel.java - uses classes MyLine, MyOval and MyRect to draw random shapes
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
    
    static final int MAX = 6; 
    private Random randomNumbers = new Random();   
    private MyShape[] shapes;  	// array of rectangleangles
    private String status;
    int randShape = randomNumbers.nextInt(3);

    public DrawPanel()   // ctor creates a panel with random shapes
    {
        super(new BorderLayout());
        setBackground(Color.WHITE);    
        shapes = new MyShape[MAX];        
    //    status = "Lines: " + lines.length + " Ovals: " + ovals.length + " Rectangles: " + rectangles.length;
            for (int cnt = 0; cnt < shapes.length; cnt++) 
            {  // create lines
                int x1 = randomNumbers.nextInt(450);    // generate random coords
                int y1 = randomNumbers.nextInt(450);
                int x2 = randomNumbers.nextInt(450);
                int y2 = randomNumbers.nextInt(450);
                  // generate random color
                Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));         
                  // add line to the array of lines to be displayed
                boolean filled = randomNumbers.nextBoolean();
                
                if(randShape == 0) 
                {
                    shapes[cnt] = new MyLine(x1, y1, x2, y2, color, filled);
                }
                
                else if(randShape == 1) 
                {
                    shapes[cnt] = new MyRect(x1, y1, x2, y2, color, filled);
                }
                
                else 
                {
                    shapes[cnt] = new MyOval(x1, y1, x2, y2, color, filled);
                }
            } // endfor Lines
            
        
            
            
    }//DrawPanel()



    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        for (MyShape shape : shapes)
            shape.draw(g)
    }      //end paintComponent
    
    public String getStatus()
    {
        return status;
    }      //end getStatus  
    
} // end class DrawPanel


