import acm.program.ConsoleProgram;

//46. დაწერეთ მეთოდი რომელსაც გადაეცემა სტიგნი და რომელიც აბრუნებს ამ სტრინგში
//ყველაზე ხშირ სიმბოლოს.
public class Problem46 extends ConsoleProgram{
	public void run() {
		char maxChar = 'a';
		int maxCount = 0;
		String text = readLine("Enter text: ");
		for(char c = 'a'; c <= 'z'; c++) {
			int count = countChar(text, c);
			if(count > maxCount) {
				maxCount = count;
				maxChar = c;
			}
		}
		println(maxChar);
	}

	private int countChar(String text, char c) {
		int count = 0;
		for(int i = 0; i < text.length(); i ++) {
			if(c == text.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
