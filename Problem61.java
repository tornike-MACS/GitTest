import acm.program.ConsoleProgram;

//61. კონსოლიდან შეგვყავს რიცხვი m და n, შემდეგ n ცალი რიცხვი. პროგრამამ უნდა იპოვოს
//შეყვანილი რიცხვებიდან წყვილი რომელთა ჯამი არის m.
public class Problem61 extends ConsoleProgram{
	public void run() {
		int m = readInt();
		int n = readInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = readInt();
		}
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n - i; j++) {
				if(arr[i] + arr[j] == m) {
					println(arr[i] + " " + arr[j]);
				}
			}
		}
	}
}
