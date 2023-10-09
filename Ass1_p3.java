import stanford.karel.SuperKarel;

public class Ass1_p3 extends SuperKarel {

	
	public void run() {
		turnLeft();
		while(frontIsClear()){
			fillLine1();
			moveToNextLine1();
			if(frontIsClear()){
				fillLine2();
				moveToNextLine1();
			}
		}
		fillTheLastLine();
	}

	private void fillTheLastLine() {
		checkPreviusLine();
		if(beepersPresent()){
			returnToCurrentLine();
			fillLine2();
		}else{
			returnToCurrentLine();
			fillLine1();
		}
		
	}

	private void returnToCurrentLine() {
		turnAround();
		move();
	}

	private void checkPreviusLine() {
		turnAround();
		move();
	}

	private void fillLine2() {
		turnRight();
		if(frontIsClear()){
			move();
			putBeeper();
		}
		if(frontIsClear()){
			move();
		}
		while(frontIsClear()){
			move();
			putBeeper();
			if(frontIsClear()){
				move();
			}
		}
		turnLeft();
	}

	private void moveToNextLine1() {
			move();
			turnLeft();
			while(frontIsClear()){
				move();
			}
			turnRight();
		}
	

	private void fillLine1() {
		turnRight();
		putBeeper();
		if(frontIsClear()){
			move();
		}
		while(frontIsClear()){
			move();
			putBeeper();
			if(frontIsClear()){
				move();
			}
		}
		turnLeft();
	}
}