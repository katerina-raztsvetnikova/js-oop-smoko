
public class TailSnake {
	
	int x;
	int y;
	boolean wait = true;
	
	public TailSnake(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean getWait() {
		return wait;
	}
	
	public void setWait(boolean wait) {
		this.wait = wait;
	}

}
