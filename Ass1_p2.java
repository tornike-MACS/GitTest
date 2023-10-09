import stanford.karel.SuperKarel;

public class Ass1_p2 extends SuperKarel {

	public void run() {
		while(frontIsClear()){
			fixColumn();
			returnToFirstPos();
			moveToNextColumn();
		}
		fixLastColumn();
		returnToFirstPos();
	}
// we need this to fix last column
	private void fixLastColumn() {
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
//karel goes to next column
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
/*
 *    karel puts beepers on empty places in column
 *   
 */

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
