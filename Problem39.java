import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram{
	public void run() {
		GRect rect = new GRect(0, getHeight() / 2 - 25, 50, 50);
		rect.setFilled(true);
		add(rect);
		while(true) {
			rect.move(1, 0);
			rect.pause(0.5);
		}
	}
}
