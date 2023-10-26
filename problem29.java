import acm.program.ConsoleProgram;
//ოხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს ფიბონაჩის მიმდევრობის
//მე n წევრი
public class problem29 extends ConsoleProgram {
	public void run() {
		int n = readInt();
		int a = 1;
		int b = 2;
		b = a + b;
		for(int i = 3; i < n; i++) {
			b = a + b;
			a = b - a;
		}
		println(b);
	}
}
