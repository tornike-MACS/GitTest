import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Graphics extends GraphicsProgram {
	public void run() {
		GRect Rect = new GRect(0, 0, SQUARE_SIZE, SQUARE_SIZE);
		Rect.setFilled(true);
		add(Rect);
		double dx = (getWidth() - SQUARE_SIZE)/N_STEPS;
		double dy = (getHeight() - SQUARE_SIZE)/N_STEPS;
		for(int i = 0; i < N_STEPS; i++){
			Rect.move(dx, dy);
			pause(PAUSE_TIME);
		}
	}
	private static final int SQUARE_SIZE = 50;
	private static final int N_STEPS = 1000;
	private static final int PAUSE_TIME = 20;
}
