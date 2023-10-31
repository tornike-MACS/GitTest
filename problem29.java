import acm.program.ConsoleProgram;
//ოხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს ფიბონაჩის მიმდევრობის
//მე n წევრი
public class problem29 extends ConsoleProgram {
	public void run() {
		int n = readInt();
		println(fibonacci(n));
//		int n = readInt();
//		int a = 1;
//		int b = 2;
//		if(n == 1) {
//			println("1");
//		}
//		if(n == 2) {
//			println("2");
//		}
//		b = a + b;
//		for(int i = 3; i < n; i++) {
//			a = b - a;
//			b = a + b;
//		}
//		if(n != 1 && n != 2) {
//			println(b);
//		}
	}
	//0 1 2 3 4 
	//0 1 1 2 3
	private int fibonacci(int n) {
		if(n == 0 || n ==1) {
			return n;
		}
		int prev2 = 0;
		int prev1 = 1;
		int curr = 0;
		for(int i = 2; i <= n; i++) {
			curr = prev2 + prev1;
			prev2 = prev1;
			prev1 = curr;
		}
		return curr;
	}	
}
