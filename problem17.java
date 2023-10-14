import acm.program.*;

public class problem17 extends ConsoleProgram {
	public void run(){
		double n1 = readDouble("Enter your number: ");
		int n2 = (int) n1;
		double n3 = n1 - n2; 
		println(n2 +  " and " + n3);
	}
}
