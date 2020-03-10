import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Game extends JFrame {
	
	Board drawBoard;
	public static int xCoordinate = 130;
	public static int yCoordinate = 20;
	public JButton startGame = new JButton("start");
	public JButton restartGame = new JButton("restart");
	public JButton pauseGame = new JButton("pause");
	
	public void createBoard() {
		JFrame frame = new JFrame();
		frame.setTitle("Snake");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.addKeyListener(new KeyHandler());
		
		startGame.setBounds(10,50, 100, 30);
		startGame.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));
		startGame.setVisible(true);
	
		startGame.addActionListener(new startGameAction());
		startGame.addKeyListener(new KeyHandler());
		
		restartGame.setBounds(10,100,100,30);
		restartGame.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));
		restartGame.setVisible(true);
		
		restartGame.addActionListener(new restartGameAction());
		restartGame.addKeyListener(new KeyHandler());
		
		pauseGame.setBounds(10,150,100,30);
		pauseGame.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));
		pauseGame.setVisible(true);
		
		pauseGame.addActionListener(new pauseGameAction());
		pauseGame.addKeyListener(new KeyHandler());
		
		drawBoard= new Board();
		drawBoard.setBounds(0,0,800,600);
		drawBoard.setVisible(true);
		
		frame.add(startGame);
		frame.add(restartGame);
		frame.add(pauseGame);
		frame.add(drawBoard);
	    
	    frame.setVisible(true);
	}

public class startGameAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		GameClock clock = new GameClock();
		clock.start();
		if(GameClock.running == false) {
			GameClock.running = true;
		}	
	}
	
}

public class restartGameAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Snake.tail.clear();
		Snake.score = 0;
		startGame.addActionListener(new startGameAction());
		
	}
	
}

public class pauseGameAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
			GameClock.running = false;
		
	}
	
}
	

}
