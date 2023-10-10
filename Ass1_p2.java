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
		safePut();
		while(frontIsClear()){
			move();
			safePut();
		}
	}
	
//karel goes to next column
	private void moveToNextColumn() {
		for(int i = 0; i < 3; i++){
			move();
		}
	}

	private void returnToFirstPos() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnLeft();
	}

   //  karel puts beepers on empty places in column 
	private void fixColumn() {
		turnLeft();
		safePut();
		while(frontIsClear()){
			move();
			safePut();
		}
	}
	
	// karel puts beeper only if the beeper is not present
	private void safePut(){
		if(noBeepersPresent()){
			putBeeper();
		}
	}
}
