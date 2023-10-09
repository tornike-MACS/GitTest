import stanford.karel.Karel;

public class Assignment1 extends Karel {
	public void run() {
		goOut();
		pickBeeper();
//		goIn();
	}

	private void goOut() {
		moveThreeTimes();
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

	private void moveThreeTimes() {
		move();
		move();
		move();
	}
}
