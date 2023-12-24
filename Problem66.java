import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

//66. 63-ე ამოცანის გაგრძელება. დაბეჭდეთ ორი ადამინი რომელთაც არ ჰყავთ საერთო მეგობრები
public class Problem66 extends ConsoleProgram{
	public void run() {
		String a  = "";
		String b = "";
		HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
		while(true) {
			String line = readLine();
			if(line.isEmpty())break;
			StringTokenizer tk = new StringTokenizer(line);
			a = tk.nextToken();
			b = tk.nextToken();
			if(map.containsKey(a) == false) {
				map.put(a, new HashSet<String>());
			}
			if(map.containsKey(b) == false) {
				map.put(b, new HashSet<String>());
			}
			map.get(a).add(b);
			map.get(b).add(a);
		}
		
		String ans1 = "";
		String ans2 = "";
		boolean doNotHaveMutual = true;
		for(String x : map.keySet()) {
			for(String z : map.keySet()) {
				Iterator it = map.get(x).iterator();
				while(it.hasNext()) {
					if(map.get(z).contains(it.next())) {
						doNotHaveMutual = false;
						break;
					}
				}
				if(doNotHaveMutual) {
					ans1 = x;
					ans2 = z;
					break;
				}
			}
			if(doNotHaveMutual) {
				println(ans1 + " " + ans2);
				break;
			}
		}
	}
}
//martiviaa


// mamashvilebis sia
//da adamiani da magis bidzashvilebis sia unda gamoitano