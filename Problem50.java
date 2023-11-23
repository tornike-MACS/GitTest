import acm.program.ConsoleProgram;
import java.util.StringTokenizer;

//50. შეყვანილ ტექსტში დათვალეთ სიტვყების რაოდენობა, ტოკენაიზერის საშუალებით
public class Problem50 extends ConsoleProgram{
	public void run() {
//		String text = readLine("enter text: ");
//		int wordCount = countWords(text);
//		println("there are " + wordCount + " words in the text.");
		StringTokenizer tokenizer = new StringTokenizer("sefef wef wef ", " ");
		println(tokenizer);
	}
	
	private int countWords(String text) {
//		StringTokenizer tokenizer = new StringTokenizer(text, " ");
		
	}
}
