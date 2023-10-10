import stanford.karel.SuperKarel;

public class Ass1_p4 extends SuperKarel {

	public void run() {
		putBeeper();
		turnLeft();
		putTwoAndOne();
		returnToFirstPos();
//		goToAnswer();
//		deleteOthers();
	}
	
//final position: 1*1 facing north
	private void returnToFirstPos() {
		turnAround();
		moveToWall();
		turnAround();
	}

	private void moveToWall() {
		while(frontIsClear()){
			move();
		}
	}

	private void putTwoAndOne() {
		while(frontIsClear()){
			putTwo();
			returnToFirstPos();
			putOne();
			continueCycle();
		}
	}

	private void continueCycle() {
		returnToFirstPos();
		turnLeft();
		while(beepersPresent()){
			safeMove();
		}
	}

	private void putOne() {
		turnRight();
		while(beepersPresent()){
			move();
		}
		putBeeper();
	}

	private void putTwo() {
		while(beepersPresent()){
			move();
		}
			safePut();
			safeMove();
			safePut();
	}

	private void safeMove() {
		if(frontIsClear()){
			move();
		}
	}

	private void safePut() {
		if(noBeepersPresent()){
			putBeeper();
		}
	}
}