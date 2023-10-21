import acm.program.*;

//მომხმარებელს შეჰყავს ორი რიცხვი თქვენმა პროგრამამ უნდა დაბეჭდოს ამ ორი რიცხვის
//უდიდესი საერთო გამყოფი
public class problem26 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter first number: ");
		int b = readInt("Enter second number: ");
		for(int i = a; i > 0; i--) {
			if(b % i == 0 && a % i == 0) {
				println(i);
				break;
			}
		}
	}
}
