import acm.program.ConsoleProgram;

public class Problem55 extends ConsoleProgram{
	public void run() {
		boolean yes = true;
		int n  = readInt();
		int[] number = new int[n];
		for(int i = 1; i <= n; i ++) {
			number[i] = readInt();
			if (number[i - 1] > number[i]) {
				yes = false;
			}
		}
		println(yes);
	}
}
