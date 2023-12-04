import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class evalMid extends ConsoleProgram{
	
	private boolean plus = true;
	
	public void run() {
		int ans = 0;
		String s = readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		while(st.hasMoreTokens()) {
			if(st.nextToken().equals("+")) {
				plus = true;
			}else if(st.nextToken().equals("-")) {
				plus = false;
			}else{
				if(plus) {
					ans += Integer.parseInt(st.nextToken());
				}else {
					ans -= Integer.parseInt(st.nextToken());
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
