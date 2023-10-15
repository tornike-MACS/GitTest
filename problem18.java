import acm.program.*;

public class problem18 extends ConsoleProgram {
	public void run(){
		int n1 = readInt("first number: ");
		int n2 = readInt("Second number: ");
		int max = (n1>n2) ? n1 : n2;
			println(max + " is the biggest");
	}
}
