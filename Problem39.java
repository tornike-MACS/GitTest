import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram{
	public void run() {
		int x = 1;
		GOval oval = new GOval(x, getHeight() / 2 - 25, 50, 50);
		oval.setFilled(true);
		add(oval);
		while(true) {
			oval.move(x, 0);
			oval.pause(1);
			if(oval.getX() == getWidth() - 50) {
				x *= -1;
			}
			if(oval.getX() == 0) {
				x *= -1;
			}
		}
	}
}
