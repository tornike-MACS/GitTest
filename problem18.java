import acm.program.*;

public class problem18 extends ConsoleProgram {
	public void run(){
		int n1 = readInt("first number: ");
		int n2 = readInt("Second number: ");
		if(n1>n2){
			println(n1 + " is the biggest");
		}else{
			println(n2 + " is the biggest");
		}
	}
}
