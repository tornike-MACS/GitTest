//7. კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას მთელი სამყარო თითო ბრილიანტით. ანუ მთელ
//სამყაროში ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყისი
//სამყარო ცარიელი არ არის და გარკვეულ(ჩვენთვის უცნობ) უჯრებში თითო(მხოლოდ ერთი)
//ბრილიანტი დევს. ამასთან გაითვალისწინეთ, რომ სამყაროს ზომები თქვენთვის უცნობია და
//თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის სამყაროსათვის.
import stanford.karel.SuperKarel;
public class Problem01 extends SuperKarel{
	public void run(){
		while(frontIsClear()){
			xazisShevseba();
			if(leftIsClear()){
				asvla1();
				}
			}
			xazisShevseba();
			if(rightIsClear()){
				asvla2();
				}
		}
	

	private void xazisShevseba(){
		if(noBeepersPresent()){
			putBeeper();
		}
		while(frontIsClear()){
			move();
			if(noBeepersPresent()){
				putBeeper();
			}
		}
	}
	private void asvla1(){
		turnLeft();
		move();
		if(noBeepersPresent()){
			putBeeper();
		}
		turnLeft();
	}
	private void asvla2(){
		turnRight();
		move();
		if(noBeepersPresent()){
			putBeeper();
		}
		turnRight();
	}
}


