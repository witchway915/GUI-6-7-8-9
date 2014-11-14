
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
    private MyLine[] lines; 	// array of lines
    private MyOval[] ovals;  	// array of ovals
    private MyRect[] rectangles;  	// array of rectangleangles
    private String status;

    public DrawPanel()   // ctor creates a panel with random shapes
    {
        super(new BorderLayout());
        setBackground(Color.WHITE);    
        lines = new MyLine[1 + randomNumbers.nextInt(MAX)];
        ovals = new MyOval[1 + randomNumbers.nextInt(MAX)];
        rectangles = new MyRect[1 + randomNumbers.nextInt(MAX)];        
        status = "Lines: " + lines.length + " Ovals: " + ovals.length + " Rectangles: " + rectangles.length;
            for (int cnt = 0; cnt < lines.length; cnt++) 
            {  // create lines
                int x1 = randomNumbers.nextInt(450);    // generate random coords
                int y1 = randomNumbers.nextInt(450);
                int x2 = randomNumbers.nextInt(450);
                int y2 = randomNumbers.nextInt(450);
                  // generate random color
                Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));         
                  // add line to the array of lines to be displayed
                lines[cnt] = new MyLine();
            } // endfor Lines
            
            for (int count = 0; count < ovals.length; count++)
            {
                int x1 = randomNumbers.nextInt(450);
                int y1 = randomNumbers.nextInt(450);
                int x2 = randomNumbers.nextInt(450);
                int y2 = randomNumbers.nextInt(450);
                
                Color color = new Color (randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));
                
                boolean filled = randomNumbers.nextBoolean();
                
                ovals[ count ] = new MyOval( );
            }    //end for Ovals
            
            for (int count = 0; count < rectangles.length; count++)
            {
                int x1 = randomNumbers.nextInt(450);
                int y1 = randomNumbers.nextInt(450);
                int x2 = randomNumbers.nextInt(450);
                int y2 = randomNumbers.nextInt(450);
                
                Color color = new Color (randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));
                
                boolean filled = randomNumbers.nextBoolean();
                
                rectangles[ count ] = new MyRect( );
            }    //end for rectangles
            
            
    }//DrawPanel()



    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        for (MyLine line : lines)
            line.draw(g);
        
        for (MyOval oval : ovals)
            oval.draw(g);
        
        for (MyRect rectangle : rectangles)
            rectangle.draw(g);
    }      //end paintComponent
    
    public String getStatus()
    {
        return status;
    }      //end getStatus  
    
} // end class DrawPanel


