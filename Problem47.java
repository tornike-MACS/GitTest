import acm.program.ConsoleProgram;

//47. დაწერეთ პრედიკატ მეთოდი რომელსაც გადაეცემა სტრინგი და რომელიც დაადგენს არის თუ
//არა მოცემული ტექსტი პალინდრომი
public class Problem47 extends ConsoleProgram{
	public void run() {
		String text = readLine("Enter text: ");
		for(int i = 0; i < text.length() / 2; i++) {
			for(int j = text.length() - 1; j > text.length() / 2; j--) {
				if(text.charAt(i) == text.charAt(j)) {
					continue;
				}else {
					println("not palindrom");
					break;
				}
			}
		}
	}
}
