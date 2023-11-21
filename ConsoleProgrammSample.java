

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
//	public void run() {
////		String number = readLine("enter number: ");
////		if(isDivisibleByThree(number)) {
////			println("divisible");
////		}else {
////			println("not");
////		}
//	}
//	
//	private boolean isDivisibleByThree(String number) {
//		int sumOfDigits = 0;
//		for(int i = 0; i < number.length(); i++) {
//			sumOfDigits += number.charAt(i) - '0';
//		}
//		if(sumOfDigits % 3 ==0) {
//			return true;
//		}
//		return false;
//	}
	public void run() {
		String number = readLine("enter number: ");
		if(isDivisibleByFive(number)) {
			println("divisible");
		}else { 
			println("not");
		}
	}
	
	private boolean isDivisibleByFive(String number) {
		int lastDig = number.charAt(number.length() - 1) - '0';
		if(lastDig % 5 == 0) {
			return true;
		}
		return false;
	}

//	private boolean isDivisibleByFour(String number) {
//		int num1 = number.charAt(number.length() - 2) - '0';
//		int num2 = number.charAt(number.length() - 1) - '0';
//		int lastTwo = num1 * 10 + num2;
//		if(lastTwo % 4 ==0) {
//			return true;
//		}
//		return false;
//	}
}
