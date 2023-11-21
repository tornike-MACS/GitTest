

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	public void run() {
		String number = readLine("enter number");
		if(isDivisibleByThree(number)) {
			println("divisible");
		}else {
			println("not");
		}
	}
	
	private boolean isDivisibleByThree(String number) {
		int sumOfDigits = 0;
		for(int i = 0; i < number.length(); i++) {
			sumOfDigits += number.charAt(i) - '0';
		}
		if(sumOfDigits % 3 ==0) {
			return true;
		}
		return false;
	}
}
