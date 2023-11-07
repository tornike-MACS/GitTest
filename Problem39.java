import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram{
	public void run() {
		int x = 0;
		GRect rect = new GRect(x, getHeight() / 2 - 25, 50, 50);
		rect.setFilled(true);
		add(rect);
		while(rect.getX() < getWidth() - 50) {
			rect.move(1, 0);
			rect.pause(1);
		}
	}
}
