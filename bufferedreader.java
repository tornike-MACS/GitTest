import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class bufferedreader extends ConsoleProgram{
	public void run() {
		try{
			BufferedReader reader = new BufferedReader(new FileReader(""));
			while(true) {
				String line = reader.readLine();
				if(line == null) {
					break;
				}
			}
		}catch(FileNotFoundException e) {
			println("File not found");
		}catch(IOException e) {
			println("not opened");
		}
	}
}
