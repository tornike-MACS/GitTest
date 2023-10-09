import stanford.karel.SuperKarel;

public class Ass1_p3 extends SuperKarel {

	
	public void run() {
		turnLeft();
		while(frontIsClear()){
			fillLine1();
			moveToNextLine1();
			fillLine2();
			moveToNextLine1();
		}
	}

	private void fillLine2() {
		turnRight();
		move();
		putBeeper();
		move();
		while(frontIsClear()){
			move();
			putBeeper();
			if(frontIsClear()){
				move();
			}
		}
		turnLeft();
	}

	private void moveToNextLine1() {
			move();
			turnLeft();
			while(frontIsClear()){
				move();
			}
			turnRight();
		}
	

	private void fillLine1() {
		turnRight();
		putBeeper();
		move();
		while(frontIsClear()){
			move();
			putBeeper();
			if(frontIsClear()){
				move();
			}
		}
		turnLeft();
	}
}