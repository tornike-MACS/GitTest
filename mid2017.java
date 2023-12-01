import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
//ტაბლო

public class mid2017 extends GraphicsProgram{
	
	private static final double FRAME_SIZE = 200;
	
	GRect frame; 
	GLabel points;
	public void run() {
		frame = new GRect(FRAME_SIZE, FRAME_SIZE);
		add(frame, getWidth() / 2 - FRAME_SIZE / 2, getHeight() / 2 - FRAME_SIZE / 2);
	}
	
	public void mouseDragged(MouseEvent e) {
		
	}
}
