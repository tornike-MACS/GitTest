import acm.program.ConsoleProgram;
//palindrom
public class mid2019 extends ConsoleProgram{
	public void run() {
		int n = readInt();
		println(isPalindrom(n));
	}
	
	private boolean isPalindrom(int n) {
		if(reversedN(n) == n) {
			return true;
		}
		return false;
	}
	private int reversedN(int n ) {
		int lastDigit;
		int revN = n % 10;
		while(n > 0) {
			revN = revN * 10;
			n /= 10;
			revN += n % 10;
			n /= 10;
		}
		return revN;
	}
}
