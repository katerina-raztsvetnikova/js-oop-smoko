import javax.swing.JFrame;

public class GameJF {
	
	public void createBoard() {
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		 Board drawBoard= new Board();
		drawBoard.setBounds(0,0,800,600);
		drawBoard.setVisible(true);
		
		frame.add(drawBoard);		
		frame.setVisible(true);
		
	}
	
}
