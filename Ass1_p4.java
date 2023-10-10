import stanford.karel.SuperKarel;

public class Ass1_p4 extends SuperKarel {

	public void run() {
		putBeeper();
		turnLeft();
		putTwoAndOne();
		returnToFirstPos();
		goToAnswer();
		deleteOthers();
		goToFinalDest();
	}
	
	private void goToFinalDest() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnLeft();
		while(noBeepersPresent()){
			move();
		}
	}

	private void deleteOthers() {
		while(frontIsClear()){
			move();
			pickBeeper();
		}
		turnRight();
		while(frontIsClear()){
			move();
			safePick();
		}
	}

	private void goToAnswer() {
		returnToFirstPos();
		turnRight();
		while(beepersPresent()){
			move();
		}
		turnAround();
		move();
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
			if(frontIsClear()){
				move();
			}else{
				safePick();
			}
		}
	}

	private void safePick() {
		if(beepersPresent()){
			pickBeeper();
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