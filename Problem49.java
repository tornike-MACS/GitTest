import acm.program.ConsoleProgram;

//49. დაწერეთ stringToInteger მეთოდი, რომელსაც გადაეცემა სტრინგი და აბრუნებს მთელ რიცხვს.
//ჩათვალეთ, რომ გადაცემული სტრინგი მხოლოდ ციფრებისგან შედგება და არ იწყება 0-ით.
//მაგალითად “234” გადაცემის შემთხვევაში მეთოდმა უნდა დააბრუნოს 234. ასევე ჩათვალეთ,
//რომ დაბრუნებული მნიშვნელობა დადებითია და ეტევა int-ში
public class Problem49 extends ConsoleProgram {
	public void run() {
		String text = readLine("enter number: ");
		int answer = stringToInteger(text);
		println(answer);
		
	
//		int n = stringToInteger(text);
//		println(n);
	}
	
	private int stringToInteger(String text) {
		int answer = 0;
		for(int i = 0; i < text.length(); i++) {
			answer += answer * 10 + (text.charAt(i) - '0');
		}
		return answer;
	}
	
//	private int stringToInteger(String text) {
//		int number = 0;
//		for(int i = 0; i < text.length(); i++) {
//			int digit = text.charAt(i) - '0';
//			number = number * 10 + digit;
//		}
//		return number;
//	}
}
