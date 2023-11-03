import acm.program.*;

//მომხმარებელს შეჰყავს ორი რიცხვი თქვენმა პროგრამამ უნდა დაბეჭდოს ამ ორი რიცხვის
//უდიდესი საერთო გამყოფი
public class problem26 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter first number: ");
		int b = readInt("Enter second number: ");
		while(true) {
			if(a > b) {
				a = a % b;
			}else {
				b = b % a;
			}
			if(a == 0) {
				println(b);
				break;
			}
			if(b == 0) {
				println(a);
				break;
			}
		}
	}
}

	
