import java.util.concurrent.ThreadLocalRandom;

public class Obstacles {
	int x;
	int y;
	
	public Obstacles() {
		this.x = ThreadLocalRandom.current().nextInt(0,16);
		this.y = ThreadLocalRandom.current().nextInt(0,16);
		
	}
	public void reset () {
		this.x = ThreadLocalRandom.current().nextInt(0,16);
		this.y = ThreadLocalRandom.current().nextInt(0,16);
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
