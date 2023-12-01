import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
//ტაბლო

public class mid2017 extends GraphicsProgram{
	
	private static final double FRAME_SIZE = 300;
	
	private GRect frame; 
	private GLabel points;
	private int intPoints = 0;
	double x1;
	double x2;
	
	public void run() {
		frame = new GRect(FRAME_SIZE, FRAME_SIZE);
		add(frame, getWidth() / 2 - FRAME_SIZE / 2, getHeight() / 2 - FRAME_SIZE / 2);
		Gpoints();

	}
	
	public void mouseClicked(MouseEvent e) {
		x1 = e.getX();
	}
//	public void mouseReleased(MouseEvent e) {
//		x2 = e.getX();
//	}
	
	public void mouseDragged(MouseEvent e) {
		System.out.println("sd");
		x2 = e.getX();
		
		if(x1 < x2) {
			intPoints++;
			System.out.println("sd");
			remove(points);
			Gpoints();
		}else {
			intPoints--;
			remove(points);
			Gpoints();
		}
	}
	
	
	
	private void Gpoints () {
		points = new GLabel(intPoints + "");
		add(points, getWidth() / 2 - points.getWidth() / 2, getHeight() / 2);
	}
 	
}
