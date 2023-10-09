import stanford.karel.SuperKarel;

public class Ass1_p2 extends SuperKarel {

	
	public void run() {
		fixColumn();
//		moveToNextColumn();
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
