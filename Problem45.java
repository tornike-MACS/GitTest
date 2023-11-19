import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

//45. მომხმარებელს კონსოლიდან შეჰყავს ტექსტი და სიმბოლო, თქვენმა პროგრამამ უნდა იპოვოს
//რამდენჯერ გვხვდება მოცემულ ტექსტში მოცემული სიმბოლო
public class Problem45 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		char symbol = readChar();
		int count = countChar(text, symbol);
		println(count);
	}
	
	private int countChar(String text, char symbol) {
		int count = 0;
		for(int i = 0; i < text.length(); i++) {
			if(symbol == text.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	
	private char readChar () {
		String Ssymbol = "";
		while(Ssymbol.length() != 1) {
			Ssymbol = readLine("Enter symbol: ");
		}
		char symbol = Ssymbol.charAt(0);
		return symbol;
	}
}
