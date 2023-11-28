import acm.program.ConsoleProgram;

public class PrepForMid1 extends ConsoleProgram{
	public void run() {
		
		
		int diffLetters = 0;
		int maxLetters = 0;
		String max = "";
		while(true) {
			String s = readLine();
			if(s.equals("END")) {
				println(max);
				break;
			}
			diffLetters = countDiffLetters(s);
			if(diffLetters >= maxLetters) {
				max = s;
			}
		}
	}

	private int countDiffLetters(String s) {
		String letters = "";
		for(int i = 0; i < s.length(); i++) {
			if(letters.contains(s.charAt(i) + "") == false) {
				letters += s.charAt(i);
			}
		}
		return letters.length();
	}

