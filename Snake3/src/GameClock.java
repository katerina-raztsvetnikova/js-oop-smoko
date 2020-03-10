import javax.swing.JOptionPane;

public class GameClock extends Thread {
	
	public static boolean running = true;
	
	public void run() {
		while(running) {
			try {
				sleep(200);
				Snake.moveSnake();
				Snake.waitToMove = false;
				Encounter.encounterNormalFood();
				Encounter.encounterRunningFood();
				Encounter.runningFood();
				if(Encounter.encounterSelf()) {
					JOptionPane.showMessageDialog(null, "GAME OVER! \n SCORE: " + Snake.score);
					Snake.score = 0;
					break;
				}
				if(Encounter.encounterObstacles()) {
					JOptionPane.showMessageDialog(null, "GAME OVER! \n SCORE: " + Snake.score);
					Snake.score =0;
					break;
				}
				
					if(Snake.headSnake.getX()>15){
                        Snake.headSnake.setX(0);
                    }else if(Snake.headSnake.getX()<0){
                        Snake.headSnake.setX(15);
                    }else if(Snake.headSnake.getY()>15){
                        Snake.headSnake.setY(0);
                    }else if(Snake.headSnake.getY()<0){
                        Snake.headSnake.setY(15);
                    }
					if(Encounter.winGame()) {
						JOptionPane.showMessageDialog(null, "YOU WIN!");
		                Snake.score = 0;
		    
					}
				
				}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	

}
