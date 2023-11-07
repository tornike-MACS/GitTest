import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class spinning extends GraphicsProgram {
	public void run() {
		int x = getWidth() / 2 - 350;
		int y = getHeight() / 2 - 25;
		GOval sun = new GOval(getWidth() / 2 - 50, getHeight() / 2 - 50, 100, 100);
		sun.setFilled(true);
		sun.setColor(Color.YELLOW);
		add(sun);
		GOval earth = new GOval(x, y, 50, 50);
		earth.setFilled(true);
		earth.setColor(Color.GREEN);
		add(earth);
		while(true) {
			
		}
	}
}
