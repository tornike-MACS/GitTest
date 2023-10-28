import acm.program.ConsoleProgram;

//დაწერეთ პროგრამა რომელიც იპოვის და დაბეჭდავს 1000000 მდე ყველა მერტივ რიცხვს
public class problem32 extends ConsoleProgram {
	public void run() {
		for(int i = 2; i <= 1000; i++) {
			if(primeOrNot(i)) {
				println(i);
			}
		}
	}
	private boolean primeOrNot(int i) {
		int divisors = 0;
		for(int j = 0; j * j < i; j++) {
			if(i % j == 0) {
				divisors++;
			}
			if(divisors > 2) {
				break;
			}
		}
		return divisors == 3;
	}
}
