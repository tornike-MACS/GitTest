/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {
		int n1 = readInt("your number ");
		int total = 0;
		while(n1>0){
			int remainder = n1%10;
			total += remainder;
			n1 = n1/10;
		}
		println("Digit sum is " + total);
	}
}
