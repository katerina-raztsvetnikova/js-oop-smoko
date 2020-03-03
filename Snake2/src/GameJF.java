import javax.swing.JFrame;

public class GameJF {
	
	Board drawBoard;
	public static int xCoordinate = 130;
	public static int yCoordinate = 20;
	
	public void createBoard() {
		JFrame frame = new JFrame();
		frame.setTitle("Snake");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.addKeyListener(new KeyHandler());
		
		
		drawBoard= new Board();
		drawBoard.setBounds(0,0,800,600);
		drawBoard.setVisible(true);
		frame.add(drawBoard);
		
		frame.requestFocus();
		frame.setVisible(true);
		
	}
	
}
