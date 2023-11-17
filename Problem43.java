import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//43. წრეწირის drag ით გადაადგილება

public class Problem43 extends GraphicsProgram{
	GLine line;
	GOval circle;
	double x;
	double y;
	public void run() {
		circle = new GOval(100,100);
		circle.setFilled(true);
		add(circle);
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		if(getElementAt(e.getX(), e.getY()) == circle) {
			x= e.getX() - circle.getX();
			y = e.getX() - circle.getX();
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		if(getElementAt(e.getX(), e.getY()) == circle) {
		circle.setLocation(e.getX() - x, e.getY() - y);
		}
	}
}
