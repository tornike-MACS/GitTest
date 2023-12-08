import java.util.Arrays;

import acm.program.ConsoleProgram;

//54. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, იპოვეთ და დაბეჭდეთ ამ
//რიცხვებს შორის ორი მაქსიმალური რიცხვი.
public class Problem54 extends ConsoleProgram{
	public void run() {
		int n = readInt();
		int[] numbers = new int[n];
		for(int i = 0; i < n; i++) {
			int a = readInt();
			numbers[i] = a;
		}
		Arrays.sort(numbers);
		println("" + numbers[n - 2] + " " + numbers[n - 1]);
	}
}
