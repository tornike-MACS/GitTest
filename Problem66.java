import java.util.HashMap;

import acm.program.ConsoleProgram;

//66. 63-ე ამოცანის გაგრძელება. დაბეჭდეთ ორი ადამინი რომელთაც არ ჰყავთ საერთო მეგობრები
public class Problem66 extends ConsoleProgram{
	public void run() {
		HashMap<String, String> map = new HashMap<String, String>();
		while(true) {
			String ans1 = "";
			String ans2 = "";
			String a = readLine("A: ");
			if(a.length() == 0)break;
			String b = readLine("B: ");
			if(map.containsKey(a) == false) {
				map.put(a, b);
			}else {
				
			}
			
		}
	}
}
