import acm.program.*;

//მომხმარებელს შეჰყავს ორი რიცხვი თქვენმა პროგრამამ უნდა დაბეჭდოს ამ ორი რიცხვის
//უდიდესი საერთო გამყოფი
public class problem26 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter first number: ");
		int b = readInt("Enter second number: ");
		if(a > b) {
			a -= b;
		}else {
			b -= a;
		}
	}
}

	
