import acm.program.*;
//31. დაწერეთ პროგრამა რომელიც დაადგენს შეყვანილი რიცხვი მარტივია თუ არა
public class problem31 extends ConsoleProgram {	
	public void run() {
		int n = readInt();
		if(primeOrNot(n)) {
			println("This number is prime");
		}else {
			println("This number is not prime");
		}
	}
	private boolean primeOrNot(int n) {
		int divisors = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				divisors++;
			}
			if(divisors > 2){
				return false;
			}
		}
		return divisors == 2;
	}
}
