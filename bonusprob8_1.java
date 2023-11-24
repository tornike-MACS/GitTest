import java.awt.*;

import acm.graphics.*;
import acm.program.*;

public class bonusprob8_1 extends ConsoleProgram {
	public void run() {
		
	}
	private boolean contains(String a, String b) {
		int prevIndex = 0;
		for(int i = 0; i < b.length(); i++) {
			int index = a.indexOf(b.charAt(i), prevIndex);
			if(index == -1) {
				return false;
			}
		}
		return true;
	}
//თავიდააან