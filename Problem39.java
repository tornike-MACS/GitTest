import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem39 extends GraphicsProgram{
	public void run() {
		GOval oval = new GOval(0, getHeight() / 2 - 25, 50, 50);
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval);
		while(true) {
			oval.move(1, 0);
			oval.pause(1);
			if(oval.getX() == getWidth() - 50) {
				break;
			}
		}
	}
}