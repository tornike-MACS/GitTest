import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Problem52 extends ConsoleProgram {
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Problem52.java"));
			while(true) {
				String s = reader.readLine();
				if(s == null) {
					break;
				}
				println(s);
			}
			reader.close();
		}catch(IOException e) {
			println("not found");
		}
		
	}
}
