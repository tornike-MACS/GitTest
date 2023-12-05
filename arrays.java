import acm.program.ConsoleProgram;

public class arrays extends ConsoleProgram{
	public void run() {
		int[] numbers = new int[10];
		go(numbers);
		println(numbers[0]);
		int n = numbers.length;
		println(n);
	}
	private void go(int[] numbers) {
		numbers[0] = 15;
	}
}
