import acm.program.ConsoleProgram;

public class midProblem extends ConsoleProgram {
	public void run() {
		String s = readLine();
		String ans = getTransformed(s);
		println(ans);
	}
	
	private String getTransformed(String s) {
		int count;
		String ans = "";
		for(int i = 0; i < s.length() - 1; i++) {
			 char ch = s.charAt(i);
			 count = getCount(s, ch, i);
			 ans += "" + count + ch;
			 i += count - 1;
		}
		return ans;
	}
	
	private int getCount(String s, char ch, int i ) {
		int count = 0;
		for(int j = 0; j < s.length(); j++) {
			if(s.charAt(j) == ch) {
				count++;
			}else {
				break;
			}
		}
		return count;
	}
}
