import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import acm.program.ConsoleProgram;
//62. კონსოლიდან შეგვყავს სახელები, მანამ სანამ არ შევიყვანთ ცარიელ სტრინგს. დაბეჭდეთ
//სახელი და მის გასწვრივ რაოდენობა რამდენჯერ შევიყვანეთ ეს სახელი.
public class Problem62 extends ConsoleProgram{
	public void run() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		while(true) {
			String name = readLine();
			if(name.isEmpty())break;
			map.putIfAbsent(name, 0);
			map.put(name, map.get(name) + 1);
		}
		
		
		
		
//		while(true) {
//			String name = readLine("enter names: ");
//			if(name.length() == 0)break;
//			if(map.containsKey(name)) {
//				map.put(name, map.get(name) + 1);
//			}else {
//				map.put(name, 1);
//			}
//		}
		println(map);
	}
}








//მასივებით
//public void run() {
//	ArrayList<String> list = new ArrayList<String>();
//	while(true) {
//		String s = readLine();
//		if(s.equals(""))break;
//		list.add(s);
//	}
//	ArrayList<String> filteredList = new ArrayList<String>();
//	filteredList = filteredList(list);
//	for(int i = 0; i < filteredList.size(); i++) {
//		println(filteredList.get(i) + ": " + countReapetedWords(list, filteredList.get(i)));
//	}
//}
//
//private int countReapetedWords(ArrayList<String> list, String s) {
//	int count = 0;
//	for(int i = 0; i < list.size(); i++) {
//		if(s.equals(list.get(i))) {
//			count++;
//		}
//	}
//	return count;
//}
//private ArrayList<String> filteredList(ArrayList<String> list) {
//	ArrayList<String> filtered = new ArrayList<String>();
//	for(int i = 0; i < list.size(); i++) {
//		if(filtered.contains(list.get(i)) == false) {
//			filtered.add(list.get(i));
//		}
//	}
//	return filtered;
//}