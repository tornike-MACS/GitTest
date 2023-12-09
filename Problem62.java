import java.util.ArrayList;
import java.util.Arrays;

import acm.program.ConsoleProgram;
//62. კონსოლიდან შეგვყავს სახელები, მანამ სანამ არ შევიყვანთ ცარიელ სტრინგს. დაბეჭდეთ
//სახელი და მის გასწვრივ რაოდენობა რამდენჯერ შევიყვანეთ ეს სახელი.
public class Problem62 extends ConsoleProgram{
	public void run() {
		ArrayList<String> list = new ArrayList<String>();
		while(true) {
			String s = readLine();
			if(s == " ")break;
			list.add(s);
		}
		for(int i = 0; i < list.size(); i++) {
			println(list.get(i) + countReapetedWords(list, list.get(i)));
		}
	}
	
	private int countReapetedWords(ArrayList<String> list, String s) {
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			if(s.equals(list.get(i))) {
				count++;
			}
		}
		return count;
	}
}
