import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyCode()) {
			case KeyEvent.VK_UP:
				if(!(Snake.headSnake.getDirection() == Direction.DOWN) && !Snake.waitToMove) {
					Snake.headSnake.SetDirection(Direction.UP);
					Snake.waitToMove = true;
				}
				break;
			case KeyEvent.VK_LEFT:
				if(!(Snake.headSnake.getDirection() == Direction.RIGHT) && !Snake.waitToMove) {
					Snake.headSnake.SetDirection(Direction.LEFT);
					Snake.waitToMove = true;
				}
				break;
			case KeyEvent.VK_DOWN:
				if(!(Snake.headSnake.getDirection() == Direction.UP) && !Snake.waitToMove) {
					Snake.headSnake.SetDirection(Direction.DOWN);
					Snake.waitToMove = true;
				}
				break;
			case KeyEvent.VK_RIGHT:
				if(!(Snake.headSnake.getDirection() == Direction.LEFT) && !Snake.waitToMove) {
					Snake.headSnake.SetDirection(Direction.RIGHT);
					Snake.waitToMove = true;
				}
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
