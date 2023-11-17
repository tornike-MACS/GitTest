import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

//45. მომხმარებელს კონსოლიდან შეჰყავს ტექსტი და სიმბოლო, თქვენმა პროგრამამ უნდა იპოვოს
//რამდენჯერ გვხვდება მოცემულ ტექსტში მოცემული სიმბოლო
public class Problem45 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter the text: ");
		String sSymbol = readLine("Enter the symbol: ");
		char symbol = sSymbol.charAt(0);
		println(symbol);
	}
}
