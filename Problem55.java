import acm.program.ConsoleProgram;

public class Problem55 extends ConsoleProgram{
	public void run() {
		int n  = readInt();
		int[] number = new int[n];
		for(int i = 1; i <= n; i ++) {
			number[i] = readInt();
		}
		println(yes);
	}
}
