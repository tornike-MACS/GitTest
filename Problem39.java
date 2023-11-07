import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem39 extends GraphicsProgram{
	public void run() {
		int x = rgen.nextInt(1,2);
		int y = rgen.nextInt(1, 2);
		GOval oval = new GOval(x, getHeight() / 2 - 25, 50, 50);
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval);
		while(true) {
			oval.move(x, y);
			oval.pause(2);
			if(oval.getX() == getWidth() - 50) {
				x *= -1;
			}
			if(oval.getX() == 0) {
				x *= -1;
			}
			if(oval.getY() == getHeight() - 50) {
				y *= -1;
			}
			if(oval.getY() == 0) {
				y *= -1;
			}
		}
	}
	RandomGenerator rgen = new RandomGenerator();
	
}