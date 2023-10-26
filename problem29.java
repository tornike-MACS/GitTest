import acm.program.ConsoleProgram;
//ოხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს ფიბონაჩის მიმდევრობის
//მე n წევრი
public class problem29 extends ConsoleProgram {
	public void run() {
		int n = readInt();
		int a = 1;
		int b = 2;
		b = a + b;
		if(n == 1) {
			println("1");
		}
		if(n == 2) {
			println("2");
		}
		for(int i = 3; i < n; i++) {
			a = b - a;
			b = a + b;
		}
		if(n != 1 || n != 2) {
			println(b);
		}
	}
}
