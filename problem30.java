import acm.program.*;

//მომხმარებელს შეყავს მთელი რიცხვი, დაბეჭდეთ რიცხვი რომელიც მიიღება ციფრების
//შებრუნებით, 1256 -> 6521
public class problem30 extends ConsoleProgram {
	public void run() {
		int digits = 0;
		int a = 1;
		int n = readInt();
		while(a > 0) {
			a = n / 10;
			digits++;
		}
		println(a);
//		for(int i = 0; i < digits; i++) {
//			
//		}
	}
}
