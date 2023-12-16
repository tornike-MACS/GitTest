import java.util.HashMap;

import acm.program.ConsoleProgram;
//65. 63-ე ამოცანის გაგრძელება. დაბეჭდეთ ადამიანი რომელსაც ყველაზე მეტი ადამიანი
//ემეგობრება
public class Problem65 extends ConsoleProgram{
	public void run() {
		HashMap<String, String> map = new HashMap<String,String>();
		int count = 0;
		int max = 0;
		String ans = "";
		while(true) {
			String a = readLine("A: ");
			if(a.length() == 0)break;
			String b = readLine("B: ");
			map.put(a, b);
			count = countFriends(map, b);
			if(count > max) {
				max = count;
				ans = b;
			}
		}
		println(ans);
	}
	private int countFriends(HashMap<String,String> map, String s) {
		int count = 0;
		for(String x : map.keySet()) {
			if(map.get(x).equals(s)) {
				count++;
			}
		}
		return count;
	}
}
