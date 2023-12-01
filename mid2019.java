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
		int revN = 0;
		while(n > 0) {
			revN = revN * 10 + n % 10;
			n /= 10;
		}
		return revN;
	}
}
