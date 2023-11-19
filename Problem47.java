import acm.program.ConsoleProgram;

//47. დაწერეთ პრედიკატ მეთოდი რომელსაც გადაეცემა სტრინგი და რომელიც დაადგენს არის თუ
//არა მოცემული ტექსტი პალინდრომი
public class Problem47 extends ConsoleProgram{
	public void run() {
		int count = 0;
		String text = readLine("Enter text: ");
		for(int i = 0; i < text.length() / 2; i++) {
			if(text.charAt(i) == text.charAt(text.length() - 1 - i)) {
				count++;
				continue;
			}
		}
		if(count == text.length() / 2) {
			println("palindrom");
		}else {
			println("not palindom");
		}
	}
}

