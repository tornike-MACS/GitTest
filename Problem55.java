import acm.program.ConsoleProgram;

public class Problem55 extends ConsoleProgram{
	public void run() {
		private boolean yes = true;
		int n  = readInt();
		int[] number = new int[n];
		for(int i = 0; i < n - 1; i ++) {
			number[i] = readInt();
			if (number[i] > number[i + 1]) {
				yes = false;
			}
		}
		println(yes);
	}
}
