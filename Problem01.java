//8. კარელმა უნდა გამოაკლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n-m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს და ჩათვალეთ, რომ n>=m.
import stanford.karel.SuperKarel;
public class Problem01 extends SuperKarel{
	public void run(){
		move();
		meoredanGadatana();
		move();
		gamokleba();
	}
	private void meoredanGadatana(){
		while(beepersPresent()){
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
	}
	private void gamokleba(){
		while(beepersPresent()){
			satitaodGadatana();
		}
	}
	private void satitaodGadatana(){
		pickBeeper();
		move();
		pickBeeper();
		turnAround();
		move();
		turnAround();
	}
}


