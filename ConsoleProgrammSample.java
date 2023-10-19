

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	public void run() {
		println(celsiousToFahrenheit(2) + "fahrenheit");
		
	}
	private double celsiousToFahrenheit(double c){
		return 9.0 / 5 * c + 32;
	}
}
