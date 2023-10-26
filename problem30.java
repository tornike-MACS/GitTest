import acm.program.*;

//მომხმარებელს შეყავს მთელი რიცხვი, დაბეჭდეთ რიცხვი რომელიც მიიღება ციფრების
//შებრუნებით, 1256 -> 6521
public class problem30 extends ConsoleProgram {
	public void run() {
		int answer = 0;
		int digits = 0;
		int n = readInt();
		int s = n;
		while(n > 0) {
			n = n / 10;
			digits++;
		}
		println(digits);
		println(s);
		for(int i = digits; i > 0; i--) {
			int a = s % 10;
			answer += (int)Math.pow(10,digits - 1) * a;
			s = s / 10;
		}
		println(answer);
	}
}
