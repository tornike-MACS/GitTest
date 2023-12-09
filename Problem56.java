import java.util.Arrays;

import acm.program.ConsoleProgram;
//56. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, დაალაგეთ რიცხვები
//ზრდადობით და დაბეჭდეთ
public class Problem56 extends ConsoleProgram{
	public void run() {
		int n = readInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = readInt();
		}
		Arrays.sort(arr);
		for(int i : arr) {
			println(arr[i - 1]);
		}
	}
}	
