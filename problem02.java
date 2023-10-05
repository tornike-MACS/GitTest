//9. კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
//პროგრამის დასაწყისში კარელი დგას უჯრაზე 3x1. თუ მის წინ კედელია უნდა დატრიალდეს და გადავიდეს 
//უჯრაზე 2x1, თუ არა და გადავიდეს წინ 4x1-ზე. თქვენი ამოხსნა უნდა მუშაობდეს ორ სხვადასხვა სამყაროზე.
//ერთი ზომებით 4x4 მეორე - 3x3.
import stanford.karel.SuperKarel;

public class problem02 extends SuperKarel{
	public void run() {
		while(frontIsClear()){
			asheneba();
			if(frontIsClear()){
				move();
			}
			if(frontIsClear()){
				move();
			}
		}
	}

	private void asheneba() {
		turnLeft();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		turnAround();
		move();
		move();
		turnLeft();
	}
}

