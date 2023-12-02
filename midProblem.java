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
		for(int i = 0; i < s.length(); i++) {
			 char ch = s.charAt(i);
			 count = getCount(s, ch, i);
			 if(count == 1) {
				 ans += ch;
			 }else {
				 ans += "" + count + ch;
				 i += count - 1;
			 }ww
		}
		return ans;
	}
	
	private int getCount(String s, char ch, int i ) {
		int count = 0;
		for(int j = i; j < s.length(); j++) {
			if(s.charAt(j) == ch) {
				count++;
			}else {
				break;
			}
		}
		return count;
	}
}
