import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram{
	public void run() {
		int x = 1;
		GRect rect = new GRect(x, getHeight() / 2 - 25, 50, 50);
		rect.setFilled(true);
		add(rect);
		while(true) {
			rect.move(x, 0);
			rect.pause(1);
			if(rect.getX() == getWidth() - 50) {
				x *= -1;
			}
			if(rect.getX() == 0) {
				x *= -1;
			}
		}
	}
}
