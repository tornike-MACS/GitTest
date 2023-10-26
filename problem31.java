import acm.program.*;
//31. დაწერეთ პროგრამა რომელიც დაადგენს შეყვანილი რიცხვი მარტივია თუ არა
public class problem31 extends ConsoleProgram {
	public void run() {
		int n = readInt();
		for(int i = 2; i < n / 2; i++) {
			if(n % i == 0) {
				println("This number is not prime.");
				break;
			}else {
				println("This numbes is prime.");
			}
		}
	}
}
