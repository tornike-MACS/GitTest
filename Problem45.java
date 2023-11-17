import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

//45. მომხმარებელს კონსოლიდან შეჰყავს ტექსტი და სიმბოლო, თქვენმა პროგრამამ უნდა იპოვოს
//რამდენჯერ გვხვდება მოცემულ ტექსტში მოცემული სიმბოლო
public class Problem45 extends ConsoleProgram {
	public void run() {
		int count = 0;
		String text = readLine("Enter the text: ");
		String sSymbol = readLine("Enter the symbol: ");
		char symbol = sSymbol.charAt(0);
		count = countChar(text, symbol);
		println(count);
	}
	
	private int countChar(String text, char symbol) {
		int count = 0;
		for(int i = 0; i < text.length() - 1; i++) {
			if(symbol == text.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
