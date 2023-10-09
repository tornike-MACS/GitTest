import stanford.karel.SuperKarel;

public class Ass1_p2 extends SuperKarel {

	
	public void run() {
		while(frontIsClear()){
			fixColumn();
			returnToFirstPos();
			moveToNextColumn();
		}
		fillLastColumn();
		returnToFirstPos();
	}

	private void fillLastColumn() {
		turnLeft();
		if(noBeepersPresent()){
			putBeeper();
		}
		while(frontIsClear()){
			move();
			if(noBeepersPresent()){
				putBeeper();
			}
		}
	}

	private void moveToNextColumn() {
		move();
		move();
		move();
		move();
	}

	private void returnToFirstPos() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnLeft();
	}

	private void fixColumn() {
		turnLeft();
		if(noBeepersPresent()){
			putBeeper();
		}
		while(frontIsClear()){
			move();
			if(noBeepersPresent()){
				putBeeper();
			}
		}
	}
}
