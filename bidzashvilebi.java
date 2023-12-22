import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;
//arasworiaa
// rogor amovshalot a ti dawyebuli vtqvat hashsetidan
public class bidzashvilebi extends ConsoleProgram{
	public void run() {
		HashMap<String, ArrayList<String>> cousins = new HashMap<String, ArrayList<String>>();
		HashMap<String, String> map = new HashMap<String, String>();
		while(true) {
			String line = readLine();
			if(line.isEmpty()) {
				break;
			}
			StringTokenizer tokenizer = new StringTokenizer(line);
			String a = tokenizer.nextToken();
			String b = tokenizer.nextToken();
			map.put(b, a);
		}
		
		for(String n : map.keySet()) {
			for(String m : map.keySet()) {
				if(map.get(n).equals(map.get(m))) {
					System.out.println("asc");
					continue;
				}
				String dad1 = map.get(n);
				String dad2 = map.get(m);
				if(map.containsKey(dad1) && map.containsKey(dad2)) {
					System.out.println("asc");
					if(map.get(dad1).equals(map.get(dad2))) {
						cousins.putIfAbsent(n, new ArrayList<String>());
						cousins.putIfAbsent(m, new ArrayList<String>());
						cousins.get(n).add(m);
						cousins.get(m).add(n);
					}
				
			}
		}
		println(cousins);
	}
}	
