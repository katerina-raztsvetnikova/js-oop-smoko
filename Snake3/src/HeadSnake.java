
public class HeadSnake {
	int x;
	int y;
	
	Direction direction = Direction.RIGHT;
	
	public HeadSnake(int x, int y) {
		this.x = x;
		this.y = y;			
	}
	
	public Direction getDirection() {
		return direction;
		
	}
	
	public void SetDirection(Direction direction) {
		this.direction = direction;
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
