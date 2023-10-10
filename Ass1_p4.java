import stanford.karel.SuperKarel;

public class Ass1_p4 extends SuperKarel {

	public void run() {
		putBeeper();
		turnLeft();
		putTwoAndOne();
//		returnToFirstPos();
//		goToAnswer();
//		deleteOthers();
	}

	private void putTwoAndOne() {
		while(frontIsClear()){
			putTwo();
//			returnToFirstPos();
//			putOne();
//			continueCycle();
		}
	}

	private void putTwo() {
		while(frontIsClear()){
			safeMove();
			safePut();
			safeMove();
			safePut();
		}
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