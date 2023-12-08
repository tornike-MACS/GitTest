import java.util.Arrays;

import acm.program.ConsoleProgram;
//55. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, გაარკვიეთ შეყვანილი რიცხვები
//არის თუ არა ზრდადობით დალაგებული. თუკი არის დაბეჭდეთ “sorted” თუ არა მაშინ
//დაბეჭდეთ “not sorted”.
public class Problem55 extends ConsoleProgram{
	public void run() {
		int n  = readInt();
		int[] number = new int[n];
		for(int i = 0; i < n; i ++) {
			number[i] = readInt();
		}
		int[] copy = Arrays.copyOf(number, n);
		Arrays.sort(number);
		if(Arrays.equals(number, copy)) {
			println("yes");
		}else {
			println("no");
		}
	}
}
