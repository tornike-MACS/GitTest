import java.util.HashSet;
import java.util.Iterator;

import acm.program.ConsoleProgram;

public class atiDawyebulebisAmoshla extends ConsoleProgram{
	public void run() {
		HashSet<String> set = new HashSet<String>();
		while(true) {
			String line = readLine();
			if(line.isEmpty())break;
			set.add(line);
		}
		HashSet<String> ansSet = new HashSet<String>();
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String a = it.next();
			if(a.charAt(0) != 'a') {
				ansSet.add(a);
			}
		}
		println(ansSet);
	}
}
