import acm.program.ConsoleProgram;
//48. კონსოლიდან შეგყვავს ტექსტი პროგრამამ უნდა დაბეჭდოს სტატისტიკა რომელი სიმბოლო
//რამდენჯერ გვხვდება
public class Problem48 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		for(char c = 'a'; c <= 'z'; c++) {
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
