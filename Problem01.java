
import stanford.karel.SuperKarel;
public class Problem01 extends SuperKarel{
	public void run(){
		move();
		while (beepersPresent()){
			oneFromEach();
		}
	}
	private void oneFromEach(){
		pickBeeper();
		move();
		if(beepersPresent()){
			pickBeeper();
		}else {turnAround();
		move();
		while(beepersPresent()){
			pickBeeper();
		}turnAround();
		move();
		move();
		while(beepersInBag()){
			putBeeper();
		}
		}
		
		if(beepersInBag()){
		turnLeft();
		move();
		putBeeper();
		putBeeper();
		turnAround();
		move();
		turnRight();
		move();
		turnAround();
		}
		
	}
}
