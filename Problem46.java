import acm.program.ConsoleProgram;

//46. დაწერეთ მეთოდი რომელსაც გადაეცემა სტიგნი და რომელიც აბრუნებს ამ სტრინგში
//ყველაზე ხშირ სიმბოლოს.
public class Problem46 extends ConsoleProgram{
	public void run() {
		String text = readLine("Enter text: ");
		
		for (char c = 'a'; c <= 'z'; c++) {
			println(c);
		}
	}
}
