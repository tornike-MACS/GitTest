import acm.program.*;

//მომხმარებელს შეყავს მთელი რიცხვი, დაბეჭდეთ რიცხვი რომელიც მიიღება ციფრების
//შებრუნებით, 1256 -> 6521
public class problem30 extends ConsoleProgram {
	public void run() {
		int digits = 0;
		int n = readInt();
		int s = n;
		while(n > 0) {
			n = n / 10;
			digits++;
		}
		println(digits);
		println(s);
		for(int i = 0; i < digits; i++) {
			
		}
	}
}
