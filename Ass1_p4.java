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

// goes to answer
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

// deletes everything except the answer
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

// karel goes to the answer destination
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

// karel puts two beepers on the first vertical line and one on the first horizontal line
	private void putTwoAndOne() {
		while(frontIsClear()){
			putTwo();
			returnToFirstPos();
			putOne();
			returnToFirstPos();
			turnLeft();
	//		continueCycle();
		}
	}

// this helps cycle to work correctly 
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
	
// karel picks a beeper only if it is present
	private void safePick() {
		if(beepersPresent()){
			pickBeeper();
		}
	}

// puts one beeper on the first horizontal line
	private void putOne() {
		turnRight();
		while(beepersPresent()){
			move();
		}
		putBeeper();
	}

//puts two beepers on the  first vertical line
	private void putTwo() {
		while(beepersPresent()){
			move();
		}
			safePut();
			safeMove();
			safePut();
	}

// karel makes a move only when front is clear
	private void safeMove() {
		if(frontIsClear()){
			move();
		}
	}

// karel puts a beeper only when no beepers present
	private void safePut() {
		if(noBeepersPresent()){
			putBeeper();
		}
	}
}