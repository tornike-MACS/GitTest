import acm.program.ConsoleProgram;

//49. დაწერეთ stringToInteger მეთოდი, რომელსაც გადაეცემა სტრინგი და აბრუნებს მთელ რიცხვს.
//ჩათვალეთ, რომ გადაცემული სტრინგი მხოლოდ ციფრებისგან შედგება და არ იწყება 0-ით.
//მაგალითად “234” გადაცემის შემთხვევაში მეთოდმა უნდა დააბრუნოს 234. ასევე ჩათვალეთ,
//რომ დაბრუნებული მნიშვნელობა დადებითია და ეტევა int-ში
public class Problem49 extends ConsoleProgram {
	public void run() {
		String text = readLine("enter number: ");
		int n = text.charAt(3);
//		double n = stringToInteger(text);
		println(n);
	}
	private double stringToInteger(String text) {
		double answer = 0;
		for(int i = 0; i < text.length(); i++) {
			int n = text.charAt(i);
			answer += n * Math.pow(10, text.length() - 1 - i);
		}
		return answer;
	}
}
