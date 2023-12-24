import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;
//arasworiaa
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
		boolean found = false;
		for(String x : map.keySet()) {
			for(String y : map.keySet()) {
				if(map.get(x).equals(map.get(y)))continue;;
				String dad1 = map.get(x);
				String dad2 = map.get(y);
				if(map.get(dad1).equals(map.get(dad2))) {
					println(x + " " + y);
					found = true;
					break;
				}
			}
			if(found)break;
		}
	}
}	
