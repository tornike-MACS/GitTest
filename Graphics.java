import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Graphics extends GraphicsProgram {
	public void run() {
		GRect Rect = new GRect(0, 0, SQUARE_SIZE, SQUARE_SIZE);
		Rect.setFilled(true);
		add(Rect);
	}
	private static final int SQUARE_SIZE = 50;
}
