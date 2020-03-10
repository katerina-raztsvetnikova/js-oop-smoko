
public class Encounter{
	
	final static int scoreRunningFood = 15;
	final static int scoreFood = 10;
	
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

	public static void runningFood() {
	if((Snake.headSnake.getX() <= Snake.runningFood.getX()+1 && Snake.headSnake.getY() <= Snake.runningFood.getY()+1)){	
			Snake.runningFood.reset();
		}		
	}
	public static void encounterRunningFood() {
		if(Snake.headSnake.getX() == Snake.runningFood.getX() && Snake.headSnake.getY() == Snake.runningFood.getY()) {
			Snake.runningFood.reset();
			Snake.addTailToSnake();
			Snake.score += scoreRunningFood;
		}
	}
	
	public static void encounterNormalFood() {
		if(Snake.headSnake.getX() == Snake.normalFood.getX() && Snake.headSnake.getY() == Snake.normalFood.getY()){
			Snake.normalFood.reset();
			Snake.addTailToSnake();
			Snake.score +=scoreFood;
			
		}	
	}
	public static boolean winGame() {
		if(Snake.score == 300) {
			return true;
		}
		return false;
	}
	public static boolean encounterObstacles() {
		if((Snake.headSnake.getX()==Snake.obstacle1.getX() && Snake.headSnake.getY()==Snake.obstacle1.getY())
				|| (Snake.headSnake.getX()==Snake.obstacle2.getX()&& Snake.headSnake.getY()==Snake.obstacle2.getY())
				||(Snake.headSnake.getX()==Snake.obstacle3.getX()&& Snake.headSnake.getY()==Snake.obstacle3.getY())) {
			return true;
		}
		return false;
	}
	
}
