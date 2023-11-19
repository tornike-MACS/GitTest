import acm.program.ConsoleProgram;
//48. კონსოლიდან შეგყვავს ტექსტი პროგრამამ უნდა დაბეჭდოს სტატისტიკა რომელი სიმბოლო
//რამდენჯერ გვხვდება
public class Problem48 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			int count = countChar(text, c);
			println(c + " : " + count);
		}
	}

	private int countChar(String text, char c) {
		int count = 0;
		for(int i = 0; i < text.length(); i++) {
			if(c == text.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
