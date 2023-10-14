import acm.program.*;

public class problem17 extends ConsoleProgram {
	public void run(){
		double n1 = readDouble("Enter your number: ");
		double n2 = n1 + 1; 
		
		println(n1%n2 + "and" + n1 - n1%n2);
	}
}
