import stanford.karel.Karel;

public class Assignment1 extends Karel {
	public void run() {
		goOut();
		pickBeeper();
		goIn();
	}

	private void goIn() {
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

	private void goOut() {
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
