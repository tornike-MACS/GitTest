import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;
//essaa bidzashvilebi
// rogor amovshalot a ti dawyebuli vtqvat hashsetidan
public class bidzashvilebi extends ConsoleProgram{
	public void run() {
		HashMap<String, String> map = new HashMap<String, String>();
		String son = "";
		String dad = "";
		while(true) {
			String line = readLine();
			if(line.isEmpty())break;
			StringTokenizer tk = new StringTokenizer(line);
			son = tk.nextToken();
			dad = tk.nextToken();
			map.put(son, dad);
		}
		HashMap<String, HashSet<String>> cousins = new HashMap<String, HashSet<String>>();
		
		for(String x : map.keySet()) {
			for(String y : map.keySet()) {
				if(map.get(x).equals(map.get(y)))continue;;
				String dad1 = map.get(x);
				String dad2 = map.get(y);
				if(map.get(dad1) != null && map.get(dad2) != null) {
					if(map.get(dad1).equals(map.get(dad2))) {
						cousins.putIfAbsent(x, new HashSet<String>());
						cousins.putIfAbsent(y, new HashSet<String>());
						cousins.get(x).add(y);
						cousins.get(y).add(x);
					}
				}
			}
		}
		println(cousins);
	}
}	
