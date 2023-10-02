
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
		pickBeeper();
		turnLeft();
		move();
		putBeeper();
		putBeeper();
	}
}
