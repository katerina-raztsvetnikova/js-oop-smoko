
public class Encounter {
	public static boolean encounterSelf() {
		for(int i = 0; i <Snake.tail.size(); i++) {
			if(Snake.headSnake.getX() == Snake.tail.get(i).getX()
					&& Snake.headSnake.getY() == Snake.tail.get(i).getY() 
					&& !Snake.tail.get(i).getWait()) {
				
			return true;
			}
		}
		return false;
	}
	
	public static boolean encounterWall() {
		
		 return(Snake.headSnake.getX() < 0 || Snake.headSnake.getX() > 15 || Snake.headSnake.getY() < 0 || Snake.headSnake.getY() > 15);
	}
	
	public static void encountPickUp() {
		if(Snake.headSnake.getX() == Snake.pickup.getX() && Snake.headSnake.getY() == Snake.pickup.getY()){
			Snake.pickup.reset();
			Snake.addTailToSnake();
			Snake.score += 15;
			
		}	
	}
	

}
