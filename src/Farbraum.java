import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Farbraum extends JPanel {
	

	private static final long serialVersionUID = 5155028253437899188L;

	/**Zeichnet den Farbraums.
	 * 
	 * @param g Grafikkontext auf dem der farbraum gezeichnet wird.
	 */
	  @Override
      protected void paintComponent(final Graphics g) {
        super.paintComponent(g); //bitte nicht ändern
		  int x = 10;
		  int y = 10;
		  final int width = 30;
		  final int height = 50;
		  int rot = 0;
		  int gruen = 0;
		  int blau = 0;
		  int farbAendern = 40;

		  while (blau <= 255 ) {
			  g.setColor(new Color(rot, gruen, blau));
			  g.drawRect(x, y, width, height);
			  g.fillRect(x, y, width, height);
			  x = x + width;
			  blau = blau + farbAendern;
		  }
		  blau = 0;
		  while ( gruen <= 255 ) {
			  g.setColor(new Color(rot, gruen, blau));
			  g.drawRect(x, y, width, height);
			  g.fillRect(x, y, width, height);
			  x = x + width;
			  gruen = gruen + farbAendern;
		  }
		  gruen = 0;
		  while (rot <= 255) {
			  g.setColor(new Color(rot, gruen, blau));
			  g.drawRect(x, y, width, height);
			  g.fillRect(x, y, width, height);
			  x = x + width;
			  rot = rot + farbAendern;
		  }
	}

}