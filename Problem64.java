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
		map.put(a, b);
		}
		
		for(int i = 0; i < list.size(); i++) {
			println(list.get(i) + " " + friendsList(list.get(i), map));
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
