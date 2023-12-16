import java.util.HashMap;

import acm.program.ConsoleProgram;

//61. კონსოლიდან შეგვყავს რიცხვი m და n, შემდეგ n ცალი რიცხვი. პროგრამამ უნდა იპოვოს
//შეყვანილი რიცხვებიდან წყვილი რომელთა ჯამი არის m.
public class Problem61 extends ConsoleProgram{
	public void run() {
		int m = readInt();
		int n = readInt();
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int key = 0;
		int first = 0;
		int second = 0;
		for(int i = 0; i < n; i++) {
			key = readInt();
			hashMap.put(key, i);
			if(hashMap.get(m - key) != null) {
				first = hashMap.get(m - key);
				second = hashMap.get(key);
			}
		}
		println(first + " " + second);
		
		
		
		
		
		
		
//		int[] arr = new int[n];
//		for(int i = 0; i < n; i++) {
//			arr[i] = readInt();
//		}
//		for(int i = 0; i < n; i++) {
//			for(int j = i + 1; j < n - i; j++) {
//				if(arr[i] + arr[j] == m) {
//					println(arr[i] + " " + arr[j]);
//				}
//			}
//		}
	}
}
