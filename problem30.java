import acm.program.*;

//მომხმარებელს შეყავს მთელი რიცხვი, დაბეჭდეთ რიცხვი რომელიც მიიღება ციფრების
//შებრუნებით, 1256 -> 6521
public class problem30 extends ConsoleProgram {
	public void run() {
//		int answer = 0;
		int digit;
		int n = readInt();
		while(n > 0) {
			digit = n % 10;
			n /= 10;
			print(digit);
		}
//		int digits = countDigits(n);
//		for(int i = digits; i > 0; i--) {
//			int a = n % 10;
//			answer += (int)Math.pow(10,i - 1) * a;
//			n = n / 10;
		}
//		println(answer);
	}
	
//	private int countDigits(int n) {
//		int digits = 0;
//		while(n > 0) {
//			n = n / 10;
//			digits++;
//		}
//		return digits;
	

