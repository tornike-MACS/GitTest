//10. კარელმა უნდა გაყოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m
//ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n / m ბრილიანტი. ჩათვალეთ, რომ n
//ზუსტად იყოფა m-ზე და კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
import stanford.karel.SuperKarel;
public class Problem01 extends SuperKarel{
	public void run(){
		move();
		while(beepersPresent()){
			minus();
//			count();
		}
	}

	private void minus() {
			pickBeeper();
			move();
			pickBeeper();
			move();
			putBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			move();
			turnAround();
	}
}


