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
		println(maxCount);
//		String text = readLine("enter text: ");
//		int maxCount = 0;
//		char maxCharacter = 0;
//		for (char c = 'a'; c <= 'z'; c++) {
//			int count = countChar(text,c);
//			if(count > maxCount) {
//				maxCount = count;
//				maxCharacter = c;
//			}
//		}
//		println(maxCharacter);
//	}
//	
//	private int countChar(String text, char symbol) {
//		int count = 0;
//		for(int i = 0; i < text.length(); i++) {
//			if(symbol == text.charAt(i)) {
//				count++;
//			}
//		}
//		return count;
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
//49