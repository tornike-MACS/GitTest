import stanford.karel.SuperKarel;

public class Ass1_p3 extends SuperKarel {

	
	public void run() {
		fillLine1();
	//	moveToNextLine();
	}

	private void fillLine1() {
		putBeeper();
		move();
		while(frontIsClear()){
			move();
			putBeeper();
			if(frontIsClear()){
				move();
			}
		}
	}
}