import acm.program.ConsoleProgram;

public class bonusprob8_3 extends ConsoleProgram {
	public void run() {
		int n = readInt();
		println(fibonachi(n));
	}
	private int fibonachi(int n) {
		int a = 1;
		int b = 1;
		if(n == 1) {
			return 1;
		}
		int answer = 0;
		for(int i = 2; i <= n; i++) {
			answer = a + b;
			a = b;
			b = answer;
		}
		return answer;
	}
}
