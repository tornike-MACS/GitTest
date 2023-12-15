import java.util.HashMap;

import acm.program.ConsoleProgram;

public class hashMapPractice extends ConsoleProgram{
	public void run() {
		HashMap <String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("abc", 2000);
		int y = hashMap.get("abc");
		
		for(String x : hashMap.keySet()) {
			println(x + " " + hashMap.get(x));
		}
		
		
	}
}
