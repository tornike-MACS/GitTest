//მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს n ის გამყოფების
//რაოდენობა
import acm.program.*;

public class problem24 extends ConsoleProgram{
	public void run() {
		int a = readInt("Enter number ");
		int answer = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				answer += 1;
			}
		}
		println(answer);
	}
}
