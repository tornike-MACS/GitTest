import acm.program.ConsoleProgram;

public class midProblem extends ConsoleProgram {
	public void run() {
		String s = readLine();
		String ans = getTransformed(s);
		println(ans);
	}
	
	private String getTransformed(String s) {
		int count = 1;
		String ans = "";
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) == s.charAt(i + 1)) {
				count++;
			}else {
				ans += "" + count + s.charAt(i);
				count = 1;
			}
		}
		return ans;
	}
}
