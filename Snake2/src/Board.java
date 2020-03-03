import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class Board extends JPanel {
java.awt.Point p;
	
	public void paint (Graphics g) {
		super.paint(g);
		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
		
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, 800, 600);
		
		g.setColor(new Color(51, 204, 51));
		for(int i = 0; i < Snake.tail.size(); i++) {
			p = Snake.ptc(Snake.tail.get(i).getX(), Snake.tail.get(i).getY());
			g.fillRect(p.x, p.y, 32, 32);
		}
		
		g.setColor(new Color(0, 153, 0));
		p = Snake.ptc(Snake.headSnake.getX(), Snake.headSnake.getY());
		g.fillRect(p.x, p.y, 32, 32);
		
	
		g.setColor(Color.BLUE);
		p = Snake.ptc(Snake.pickup.getX(), Snake.pickup.getY());
		g.fillRect(p.x, p.y, 32, 32);
		
	
		g.setColor(Color.BLACK);
		p=Snake.ptc(Snake.obstacle1.getX(), Snake.obstacle1.getY());
		g.fillRect(p.x, p.y, 32, 32);
		
		g.setColor(Color.BLACK);
		p=Snake.ptc(Snake.obstacle2.getX(), Snake.obstacle2.getY());
		g.fillRect(p.x, p.y, 32, 32);
		
		g.setColor(Color.BLACK);
		p=Snake.ptc(Snake.obstacle3.getX(), Snake.obstacle3.getY());
		g.fillRect(p.x, p.y, 32, 32);
			
	
		g.setColor(Color.GRAY);
		for(int i = 0; i < 16; i++) {
			for(int j = 0; j < 16; j++) {
				g.drawRect(i * 32 + GameJF.xCoordinate, j * 32 + GameJF.yCoordinate, 32, 32);
			}
		}
		
		g.setColor(Color.BLACK);
		g.drawRect(GameJF.xCoordinate, GameJF.yCoordinate, 512, 512);
		
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.drawString("Score:" + Snake.score, 5, 25);
		repaint();
		
		
		
	}
}
