import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class spinning extends GraphicsProgram {
	public void run() {
		GOval sun = new GOval(getWidth() / 2 - 50, getheight() / 2 - 50, 100, 100);
		sun.setFilled(true);
		sun.setColor(Color.YELLOW);
		add(sun);
	}
}
