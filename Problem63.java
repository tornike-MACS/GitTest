import java.util.HashMap;

import acm.program.ConsoleProgram;
//63. კონსოლიდან შეგვყავს წყვილ-წყვილად მეგობრების სახელები, მანამ სანამ არ შევიყვანთ
//ცარიელ სტრინგს. დაბეჭდეთ იმ ადამიანის სახელი ვისაც ჰყავს ყველაზე მეტი მეგობარი.
//მეგობრობა შეიძლება იყოს ცალმხრივი. თუკი შევიყვანთ A-ს და B-ს, ეს ნიშნავს, რომ A არის
//B-ს მეგობარი, მაგრამ B შეიძლება არ იყოს A-ს მეგობარი.
public class Problem63 extends ConsoleProgram{
	public void run() {
		HashMap<String, String> map = new HashMap<String, String>();
		int count = 0;
		int max = 0;
		String ans = "";
		while(true) {
			String a = readLine("A: ");
			if(a.length() == 0)break;
			String b = readLine("B: ");
			map.put(a, b);
			count = countFriends(map, a);
			if(count > max) {
				max = count;
				ans = a;
			}
		}
		println(ans);
	}
	
	private int countFriends(HashMap<String, String> map, String s) {
		int count = 0;
		for(String x : map.keySet()) {
			if(x == s) {
				count++;
			}
		}
		return count;
	}
}
