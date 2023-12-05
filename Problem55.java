import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem55 extends ConsoleProgram{
	public void run() {
		int n  = readInt();
		int[] number = new int[n];
		for(int i = 1; i <= n; i ++) {
			number[i] = readInt();
		}
		int[] copy = Arrays.copyOf(number, n);
		if(Arrays.equals(Arrays.sort(number), copy)) {
			println("yes");
		}else {
			println("no");
		}
	}
}
