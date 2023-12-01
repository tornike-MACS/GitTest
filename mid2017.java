import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
//ტაბლო

public class mid2017 extends GraphicsProgram{
	
	private static final double FRAME_SIZE = 300;
	
	GRect frame; 
	GLabel points;
	int intPoints = 0;
	double x1;
	double x2;
	
	public void run() {
		GRect frame = new GRect(FRAME_SIZE, FRAME_SIZE);
		add(frame, getWidth() / 2 - FRAME_SIZE / 2, getHeight() / 2 - FRAME_SIZE / 2);

	}
	public void mouseDragged(MouseEvent e) {
		x2 = e.getY();
	}
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
	}
	public void mouseReleased(MouseEvent e) {
		if(x1 < x2 && getElementAt(e.getX(), e.getY()) != null) {
			intPoints++;
		}else {
			intPoints--;
		}
		remove(points);
		points = new GLabel("" + intPoints);
		add(points);
	}
	
 	
}
