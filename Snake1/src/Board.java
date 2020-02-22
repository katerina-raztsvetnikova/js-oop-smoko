import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class Board extends JPanel {
	
	public void paint (Graphics g) {
		super.paint(g);
		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 800, 600);
		
		g.setColor(Color.BLACK);
		for(int i = 0; i < 16; i++) {
			for(int j = 0; j < 16; j++) {
				g.drawRect(i*32 + 130, j*32 + 20, 32, 32);
			}
		}
			
		g.setColor(Color.BLACK);
		g.drawRect(130, 20, 512, 512);
		repaint();
		
		

	}
}
