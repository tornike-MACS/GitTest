/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {
		println("This program adds several integers ");
		println("add numbers and inorder to stop add " + SENTINEL);
		int total = 0;
		int number = readInt();
		while(number != 0){
			total += number;
			number = readInt();
		}
		println(total);
	}
	
	private static final int SENTINEL = 0;
}
