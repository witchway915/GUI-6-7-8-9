// DrawTst.java - application to display a DrawPanel
import javax.swing.*;
import java.awt.*;

public class DrawTst
{
    public static void main(String[] args)
    {
        DrawPanel panel = new DrawPanel();
		JLabel label = new JLabel(panel.getStatus());		
		JFrame application = new JFrame();
                
      
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      panel.add( label, BorderLayout.SOUTH );    
      application.add( panel );
      application.setSize( 500, 500 );
		
      application.setVisible( true );
    } // end main


} // end class DrawTst
