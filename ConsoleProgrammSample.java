

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
	public void run() {
		String number = readLine("enter number: ");
		if(isDivisibleBySix(number)) {
			println("divisible");
		}else { 
			println("not");
		}
	}
	
	private boolean isDivisibleBySix(String number) {
		if(isDivisibleByTwo(number) && isDivisibleByThree(number)) {
			return true;
		}
		return false;
	}
	
	private boolean isDivisibleByTwo(String number) {
		if(number.charAt(number.length() - 1) % 2 == 0) {
			return true;
		}
		return false;

	}

//	private boolean isDivisibleByEleven(String number) {
//		int count = 0;
//		for(int i = 0; i < number.length(); i++) {
//			if(i % 2 == 0) {
//				count += number.charAt(i) - '0';
//			}else {
//				count -= number.charAt(i) - '0';
//			}
//		}
//		if(count == 0) {
//			return true;
//		}
//		return false;
//	}
	
//	private boolean isDivisibleByFive(String number) {
//		int lastDig = number.charAt(number.length() - 1) - '0';
//		if(lastDig % 5 == 0) {
//			return true;
//		}
//		return false;
//	}

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
