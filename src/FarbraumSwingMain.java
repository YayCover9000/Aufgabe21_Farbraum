import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FarbraumSwingMain {
	
	  public static void createAndShowGui() {
	        JFrame f = new JFrame("Farbraum");
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        Container panel = new Farbraum();
	        f.getContentPane().add(panel, BorderLayout.CENTER);
	    
	        f.pack();
	        f.setLocationRelativeTo(null);
	    	f.setSize(800, 600);
	        f.setVisible(true);
	    }

	    public static void main(final String[] args) {
	        Runnable gui = new Runnable() {

	            @Override
	            public void run() {
	                createAndShowGui();
	            }
	        };
	        //GUI must start on EventDispatchThread:
	        SwingUtilities.invokeLater(gui);
	    }

}
