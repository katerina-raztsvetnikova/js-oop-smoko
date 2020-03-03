import java.awt.Point;
import java.util.ArrayList;

public class Snake {
public static int score = 0;
	
	public static boolean waitToMove = false;
	
	public static HeadSnake headSnake = new HeadSnake(7,7);
	public static ArrayList<TailSnake> tail = new ArrayList<>();
	public static PickUpFood pickup = new PickUpFood();
	public static Obstacles obstacle1 = new Obstacles();
	public static Obstacles obstacle2 = new Obstacles();
	public static Obstacles obstacle3 = new Obstacles();
	
	public static void addTailToSnake() {
		if(tail.size() < 1) {
			tail.add(new TailSnake(headSnake.getX(), headSnake.getY()));
		}else {
			tail.add(new TailSnake(tail.get(tail.size() - 1).x, tail.get(tail.size() - 1).y));
			
		}
		
	}
	
	public static void moveSnake() {
		
		if(tail.size() >= 2) {
			for(int i = tail.size() - 1; i >= 1; i--) {
				if(tail.get(i).getWait()) {
					tail.get(i).setWait(false);
					
				}else {
					tail.get(i).setX(tail.get(i-1).getX());
					tail.get(i).setY(tail.get(i-1).getY());
				}
			}
			
		}
	
		if(tail.size() >= 1) {
			if(tail.get(0).getWait()) {
				tail.get(0).setWait(false);
			}else {
				tail.get(0).setX(headSnake.getX());
				tail.get(0).setY(headSnake.getY());
			}
		}
	
		switch (headSnake.getDirection()) {
		case RIGHT:
			headSnake.setX(headSnake.getX() + 1);
			break;

		case UP:
			headSnake.setY(headSnake.getY() - 1);		
			break;
			
		case LEFT:
			headSnake.setX(headSnake.getX() - 1);		
			break;
			
		case DOWN:
			headSnake.setY(headSnake.getY() + 1);		
			break;
		}
		
	}
	

  public static Point ptc(int x, int y) {
	  Point p = new Point(0, 0);
	  p.x = x * 32 + GameJF.xCoordinate;
	  p.y = y * 32 + GameJF.yCoordinate;
	  
	return p;	  
  }
}
