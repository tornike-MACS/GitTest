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
				map.put(a, b);
			}else {
				map.put(a, map.get(a) + " , " + b);
			}
		}
		
		for(String x : map.keySet()) {
			println(x + map.get(x));
		}
	}
	
	private ArrayList<String> friendsList(String s, HashMap<String, String> map) {
		ArrayList<String> ans = new ArrayList<String>();
		for(String x : map.keySet()) {
			if(map.get(x).equals(s)) {
				ans.add(x);
			}
		}
		return ans;
	}
}		
