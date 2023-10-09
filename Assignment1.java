import stanford.karel.Karel;

public class Assignment1 extends Karel {
	public void run() {
		goToBeeper();
		pickBeeper();
		returnToFirstPos();
	}

	private void returnToFirstPos() {
		turnAround();
		move();
		turnRight();
		move();
		turnLeft();
		moveTwice();
		turnAround();
	}

	private void turnAround() {
		turnLeft();
		turnLeft();
	}
karel goes to beeper
	private void goToBeeper() {
		moveTwice();
		turnRight();
		move();
		turnLeft();
		move();
	}

	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

	private void moveTwice() {
		move();
		move();
	}
}
