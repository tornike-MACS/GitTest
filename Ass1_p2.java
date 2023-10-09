import stanford.karel.SuperKarel;

public class Ass1_p2 extends SuperKarel {

	
	public void run() {
		fixColumn();
		returnToFirstPos();
//		moveToNextColumn();
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
