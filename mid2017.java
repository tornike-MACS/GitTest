import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
//ტაბლო

public class mid2017 extends GraphicsProgram{
	
	private static final double FRAME_SIZE = 300;
	
	GRect frame; 
	GLabel points;
	int intPoints = 0;
	
	public void run() {
		frame = new GRect(FRAME_SIZE, FRAME_SIZE);
		add(frame, getWidth() / 2 - FRAME_SIZE / 2, getHeight() / 2 - FRAME_SIZE / 2);
		points = new GLabel(intPoints + "");
		add(points, getWidth() / 2 - points.getWidth() / 2, getHeight() / 2);
	}
	
	public void mouseDragged(MouseEvent e) {
		
	}
}
