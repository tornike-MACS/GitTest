//7. კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას მთელი სამყარო თითო ბრილიანტით. ანუ მთელ
//სამყაროში ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყისი
//სამყარო ცარიელი არ არის და გარკვეულ(ჩვენთვის უცნობ) უჯრებში თითო(მხოლოდ ერთი)
//ბრილიანტი დევს. ამასთან გაითვალისწინეთ, რომ სამყაროს ზომები თქვენთვის უცნობია და
//თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის სამყაროსათვის.
import stanford.karel.Karel;
public class Problem01 extends Karel{
	public void run(){
		if (noBeepersPresent()){
			putBeeper();
		}
		while(frontIsClear()){
		while(frontIsClear()){
			move();
			if (noBeepersPresent()){
				putBeeper();
			}
		}
		if (frontIsBlocked()){
			turnLeft();
			}
		if(frontIsClear()){
			move();
			}
			if (noBeepersPresent()){
				putBeeper();
			}
			turnLeft();
			while(frontIsClear()){
				move();
				if (noBeepersPresent()){
					putBeeper();
				}
			}
			if (frontIsBlocked()){
				turnRight();
			}
			if (frontIsClear()){
				move();
			}
			if (noBeepersPresent()){
				putBeeper();
			}
			if(frontIsClear()){
				turnRight();
			}
	}
	}
	private void turnRight(){
		turnLeft();
		turnLeft();
		turnLeft();
	}
}
