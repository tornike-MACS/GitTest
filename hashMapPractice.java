import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class hashMapPractice extends ConsoleProgram{
	public void run() {
		HashMap <String, ArrayList<Integer>> hashMap = new HashMap<String, Integer>();
		ArrayList <Integer> arrList = new ArrayList<Integer>();
		
//		hashMap.put("abc", 2000);
//		int y = hashMap.get("abc");
		
		hashMap.put("abcd", arrList);
		
		for(String x : hashMap.keySet()) {
			println(x + " " + hashMap.get(x));
		}
		
		hashMap.putIfAbsent(key, value);
		hashMap.getOrDefault(key, null);// null is magivrad sxva ramec sheidzleba
		
	}
}
