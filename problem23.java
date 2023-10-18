import acm.program.*;

public class problem23 extends ConsoleProgram{
	public void run() {
		int total = 0;
		int n = readInt("Enter the number of integers: ");
		for(int i =0; i < n; i++) {
			total += i;
		}
		println("The sum is: " + total);
	}
}
