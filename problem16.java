import acm.program.*;

public class problem16 extends ConsoleProgram{
	public void run(){
		double n1 = readInt("first number: ");
		double n2 = readInt("second number: ");
		double n3 = readInt("third number: ");
		println("The answer is: " + 1/(1/n1 + 1/n2 + 1/n3));
	}
}
