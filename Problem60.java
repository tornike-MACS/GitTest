import java.util.ArrayList;

import acm.program.ConsoleProgram;
//60. კონსოლიდან შეგვყავს რიცხვები მანამ სანამ არ შეიყვანთ -1-ს, დაბეჭდეთ შეყვანილი
//რიცხვები შებრუნებული მიმდევრობით.
public class Problem60 extends ConsoleProgram{
	public void run() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			int n = readInt();
			if(n == -1) break;
			list.add(0, n);
		}
		println(list);
		
		
		
		
		
		
		
		
		
		
		
//		while(list.remove((Integer)1));//1 ianebs shlis
//		println(list);
		
//		--------------
//		while(true) {
//			int n = readInt();
//			if(n == -1) {
//				break;
//			}
//			list.add(0, n);
//		}
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i) == 1) {
//				list.remove(i);
//				i--;
//			}
//		}
//		println(list);
//		---------------
////		for(int i = list.size() - 1; i >= 0; i --) {
////			println(list.get(i));
////		}
//		println(list);
	}
}
