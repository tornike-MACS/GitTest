//9. კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
import stanford.karel.SuperKarel;

public class problem02 extends SuperKarel{
	public void run() {
		move();
		while(beepersPresent()){
			pickBeeper();
			move();
			double2();
			recoverSecond();
			turnAround();
			move();
			move();
			turnAround();
		}
		deletSecond();
		bringToFour();
	}

	private void bringToFour() {
		move();
		move();
		while(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			putBeeper();
			turnAround();
			move();
		}
		
	}

	private void deletSecond() {
		move();
		while(beepersPresent()){
			pickBeeper();
		}
	}

	private void recoverSecond() {
		move();
		while(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			putBeeper();
			turnAround();
			move();
		}
		
	}

	private void double2() {
		while(beepersPresent()){
			pickBeeper();
			move();
			putBeeper();
			move();
			putBeeper();
			goBack();
		}
	}

	private void goBack() {
		turnAround();
		move();
		move();	
		turnAround();
	}
}

