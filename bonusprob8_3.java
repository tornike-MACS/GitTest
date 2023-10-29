import acm.program.ConsoleProgram;

public class bonusprob8_3 extends ConsoleProgram {
	public void run() {
		int n = readInt();
		println(fibonachi(n));
	}
	private int fibonachi(int n) {
		int a = 0;
		int b = 1;
		if(n == 1) {
			return 0;
		}
		int answer = 0;
		for(int i = 1; i < n; i++) {
			answer = a + b;
			a = b;
			b = answer;
		}
		return answer;
	}
}
