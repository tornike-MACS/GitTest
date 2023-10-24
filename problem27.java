import acm.program.ConsoleProgram;

//ომხმარებელს შეყავს n და m დაბეჭდეთ n^m
public class problem27 extends ConsoleProgram {
	public void run() {
		int answer = 1;
		int n = readInt("Enter first number: ");
		int m = readInt("Enter second number: ");
		for(int i = 0; i < m; i++) {
			answer *= n;
		}
		println(answer);
	}
}
//for(int i = 0; i < m; i++) {
//answer *= n;
//}
//if(m % 2 == 0) {
//for(int i = 0; i < m / 2; i++) {
//	answer *= n*n;
//}
//}else {
//	for(int i = 0; i < m / 2; i++) {
//		answer *= n*n;
//		answer *= n;
//	}
//}