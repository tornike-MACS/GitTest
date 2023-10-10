import stanford.karel.SuperKarel;
public class Assignment1 extends SuperKarel {
	public void run() {
		goToBeeper();
		pickBeeper();
		returnToFirstPos();
	}
	
// karel goes to its first position
	private void returnToFirstPos() {
		turnAround();
		move();
		turnRight();
		move();
		turnLeft();
		moveTwice();
		turnAround();
	}
	
// karel goes to beeper
	private void goToBeeper() {
		moveTwice();
		turnRight();
		move();
		turnLeft();
		move();
	}
	
	private void moveTwice() {
		move();
		move();
	}
}
