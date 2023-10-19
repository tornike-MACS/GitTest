

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	public void run() {
		println("This program creates the table of celsious to fahrenheit convention ");
		for(double c = FROM; c<= TO; c += STEP) {
			println(c + "C = " + celsiousToFahrenheit(c) + "F");
		}
	}
	private double celsiousToFahrenheit(double c){
		return 9.0 / 5.0 * c + 32;
	}
	private static final int FROM = 0;
	private static final int TO = 100;
	private static final int STEP = 5;
}
