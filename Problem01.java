//10. კარელმა უნდა გაყოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m
//ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n / m ბრილიანტი. ჩათვალეთ, რომ n
//ზუსტად იყოფა m-ზე და კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
import stanford.karel.SuperKarel;
public class Problem01 extends SuperKarel{
	public void run(){
		move();
		while(beepersPresent()){
			pickBeeper();
			move();
			subtract();
			count();
			recover();
			returnToSecond();
		}
	}
	private void recover() {
		move();
		while(beepersPresent()){
			pickBeeper();
			turnAround();
			moveTwice();
			putBeeper();
			turnAround();
		}
	}
	private void returnToSecond() {
		turnAround();
		move();
		turnAround();
	}
	private void count() {
		move();
		putBeeper();
	}
	private void subtract() {
		while(beepersPresent()){
			pickBeeper();
			moveTwice();
			putBeeper();
			turnAround();
			moveTwice();
			turnAround();
		}
	}
	private void moveTwice() {
		move();
		move();
	}
}


