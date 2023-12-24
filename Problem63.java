import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;
//63. კონსოლიდან შეგვყავს წყვილ-წყვილად მეგობრების სახელები, მანამ სანამ არ შევიყვანთ
//ცარიელ სტრინგს. დაბეჭდეთ იმ ადამიანის სახელი ვისაც ჰყავს ყველაზე მეტი მეგობარი.
//მეგობრობა შეიძლება იყოს ცალმხრივი. თუკი შევიყვანთ A-ს და B-ს, ეს ნიშნავს, რომ A არის
//B-ს მეგობარი, მაგრამ B შეიძლება არ იყოს A-ს მეგობარი.
public class Problem63 extends ConsoleProgram{
	public void run() {
		HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
		String a = "";
		String b = "";
		while(true) {
			String line = readLine();
			if(line.isEmpty())break;
			StringTokenizer tk = new StringTokenizer(line);
			a = tk.nextToken();
			b = tk.nextToken();
			map.putIfAbsent(a, new HashSet<String>());
			map.get(a).add(b);
		}
		int max = 0;
		String ans = "";
		for(String x : map.keySet()) {
			if(map.get(x).size() > max) {
				max = map.get(x).size();
				ans = x;
			}
		}
		println(ans);
	}
}
