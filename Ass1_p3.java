import stanford.karel.SuperKarel;

public class Ass1_p3 extends SuperKarel {

	public void run() {
		turnLeft();
		while(frontIsClear()){
			fillLine1();
			moveToNextLine();
			if(frontIsClear()){
				fillLine2();
				moveToNextLine();
			}
		}
		fillTheLastLine();
	}

// fills the last line and it depends one the previous line
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
		safeMove();
	}

// karel checks whether the previous line has the beeper on the first space or not
	private void checkPreviusLine() {
		turnAround();
		safeMove();
	}

// karel puts beepers by omitting one space
	private void fillLine2() {
		turnRight();
		if(frontIsClear()){
			move();
			putBeeper();
		}
		safeMove();
		while(frontIsClear()){
			move();
			putBeeper();
			safeMove();
		}
		turnLeft();
	}
	
// Karel goes to next line's west-end
	private void moveToNextLine() {
			move();
			turnLeft();
			while(frontIsClear()){
				move();
			}
			turnRight();
		}
	
//  puts beepers by omitting one space
	private void fillLine1() {
		turnRight();
		putBeeper();
		safeMove();
		while(frontIsClear()){
			move();
			putBeeper();
			safeMove();
		}
		turnLeft();
	}
	
// Karel moves forward only if front is clear
	private void safeMove(){
		if(frontIsClear()){
			move();
		}
	}
}