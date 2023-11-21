import acm.program.ConsoleProgram;

public class StringTokenizer extends ConsoleProgram{
	public void run() {
		StringTokenizer tokenizer = new StringTokenizer("sdevsd");
		int countWords = 0;
		while (tokenizer.hasMoreTokens()) {
			countWords++;
			String token = tokenizer.nextToken();
		}
		println(countWords)
	}
}
