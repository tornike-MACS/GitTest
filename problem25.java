import acm.program.*;

//მომხმარებელს შეჰყავს ორი რიცხვი თქვენმა პროგრამამ უნდა დაბეჭდოს ამ ორი რიცხვის
//უმცირესი საერთო ჯერადი.
public class problem25 extends ConsoleProgram {
	public void run() {
		int a = readInt ("Enter first number:" );
		int b = readInt ("Enter second number: ");
		for(int i = a; true; i += a){
			if(i % b == 0){
				println(i);
				break;
			}
		}
	}
}
