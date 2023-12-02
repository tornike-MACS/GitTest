import acm.program.ConsoleProgram;

public class PrepForMid2 extends ConsoleProgram{
	public void run() {
		int n = readInt();
		if(oddEven(n)) {
			println("true");
		}else {
			println("false");
		}
	}

	private boolean oddEven(int n) {
		int lastDig;;
		int nextDig;
		while(n > 0) {
			lastDig = n % 10;
			n /= 10;
			nextDig = n % 10;
			if(lastDig % 2 == nextDig % 2) {
				return false;
			}
			n /= 10;
		}
		return true;
	}
}
//18181838 eseti unda iyos