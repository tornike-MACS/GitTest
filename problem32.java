import acm.program.ConsoleProgram;

//დაწერეთ პროგრამა რომელიც იპოვის და დაბეჭდავს 1000000 მდე ყველა მერტივ რიცხვს
public class problem32 extends ConsoleProgram {
	public void run() {
		int k = 0;
		for(int i = 1; i <= 1000000; i++) {
			if(numberOfDivisors(i) == 2) {
				k = i;
			}
		}
		
		println(k);
	}
	private boolean isPrime(int n) {
		if(n == 2) return true;
		if(n % 2 == 0)return false;
		for(int i = 3; i * i < n; i += 2) {
			if(n % i == 0) return false;
		}
		return true;
	}
//	private int numberOfDivisors(int i) {
//		int divisors = 0;
//		for(int j = 1; j <= i; j++) {
//			if(i % j == 0) {
//				divisors++;
//			}
//			if(divisors > 2) {
//				break;
//			}
//		}
//		return divisors;
//	}
}
