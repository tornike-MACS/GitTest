import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class evalMid extends ConsoleProgram{
	
	private boolean plus = true;
	
	public void run() {
		int ans = 0;
		String s = readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		while(st.hasMoreTokens()) {
			String a = st.nextToken();
			if(a.equals("+")) {
				plus = true;
				continue;
			}else if(a.equals("-")) {
				plus = false;
				continue;
			}else{
				if(plus) {
					ans += Integer.parseInt(a);
					continue;
				}else {
					ans -= Integer.parseInt(a);
					continue;
				}
			}
		}
		println(ans);
	}
	
//	private int eval(String s) {
//		
//		return 01;
//	}
}
