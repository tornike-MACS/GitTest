import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem60 extends ConsoleProgram{
	public void run() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			int n = readInt();
			if(n == -1) {
				break;
			}
			list.add(n);
		}
		for(int i = list.size() - 1; i > 0; i --) {
			println(list.get(i));
		}
	}
}
