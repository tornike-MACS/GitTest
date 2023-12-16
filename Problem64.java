import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

//64. 63-ე ამოცანის გაგრძელება, დაბეჭდეთ თითოეული შეყვანილი სახელი და მის გასწვრივ
//მძიმით გამოყოფილი მეგობრების სია.
public class Problem64 extends ConsoleProgram{
	public void run() {
		HashMap<String, String> map = new HashMap<String, String>();
		ArrayList<String> list = new ArrayList<String>();
		while(true) {
			String a = readLine("A: ");
			if(a.length() == 0)break;
			if(list.contains(a) == false) {
				list.add(a);
			}
			String b = readLine("B: ");
			if(list.contains(b) == false) {
				list.add(b);
			}
			if(map.containsKey(a) == false) {
				map.put(b, a);
			}else {
				map.put(b, map.get(b) + " , " + a);
			}
		}
		
		for(String x : map.keySet()) {
			println(x + " " + map.get(x));
		}
	}
}		
