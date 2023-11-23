import acm.program.ConsoleProgram;
import java.util.StringTokenizer;

//50. შეყვანილ ტექსტში დათვალეთ სიტვყების რაოდენობა, ტოკენაიზერის საშუალებით
public class Problem50 extends ConsoleProgram{
	public void run() {
		String text  = readLine("Enter text: ");
		int wordCount = countWords(text);
		println(wordCount);
	}
	
	private int countWords(String text) {
		int count = 0;
		StringTokenizer str = new StringTokenizer(text, " ");
		while(str.hasMoreTokens()) {
			str.nextToken();
			count++;
		}
		return count;
	}
}
