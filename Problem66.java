import java.util.HashMap;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

//66. 63-ე ამოცანის გაგრძელება. დაბეჭდეთ ორი ადამინი რომელთაც არ ჰყავთ საერთო მეგობრები
public class Problem66 extends ConsoleProgram{
	public void run() {
		String a  = "";
		String b = "";
		HashMap<String, String> map = new HashMap<String, String>();
		while(true) {
			String line = readLine();
			if(line.isEmpty())break;
			StringTokenizer tk = new StringTokenizer(line);
			a = tk.nextToken();
			b = tk.nextToken();
			
		}
		println(a + b);
	}
}
//martiviaa


// mamashvilebis sia
//da adamiani da magis bidzashvilebis sia unda gamoitano