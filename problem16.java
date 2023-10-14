import acm.program.*;

public class problem16 extends ConsoleProgram{
	public void run(){
		double n1 = readDouble("first number: ");
		double n2 = readDouble("second number: ");
		double n3 = readDouble("third number: ");
		println("The answer is: " + 1/(1/n1 + 1/n2 + 1/n3));
	}
}
