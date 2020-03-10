

public class RunningFood {
	int x;
	int y;

	public RunningFood() {
		this.x = (int)(Math.random() * 16);
		this.y= (int)(Math.random() * 16);
	}
	
	public void reset() {
		this.x = (int)(Math.random() * 16);
		this.y= (int)(Math.random() * 16);
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

}
