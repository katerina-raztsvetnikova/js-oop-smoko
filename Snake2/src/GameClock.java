
public class GameClock extends Thread {
public static boolean running = true;
	
	public void run() {
		while(running) {
			try {
				sleep(200);
				Snake.moveSnake();
				Snake.waitToMove = false;
				Encounter.encountPickUp();
				if(Encounter.encounterSelf()) {
					Snake.tail.clear();
					Snake.score = 0;
				}
				if(Encounter.encounterWall()) {
					for(int i=17; i>0; i--) {
						if(Direction.RIGHT != null) {
							Snake.headSnake.setX(i-1);						
						}
					}  
					
				} 
				
				}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		

}
