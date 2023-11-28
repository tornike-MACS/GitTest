import acm.program.ConsoleProgram;

public class PrepForMid1 extends ConsoleProgram{
	public void run() {
		while(true) {
			int diffLetters = 0;
			int maxLetters = 0;
			String max = "";
			String s = readLine();
			diffLetters = countDiffLetters(s);
			if(diffLetters >= maxLetters) {
				max = s;
			}
			if(s.equals("END")) {
				break;
			}
		}
	}

	private int countDiffLetters(String s) {
		String letters = "";
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(letters.contains(s.charAt(i) + "")) {
				letters += s.charAt(i);
				count++;
			}
			return count;
		}
	}
}
