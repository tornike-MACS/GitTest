import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem43 extends GraphicsProgram{
	GLine line;
	GOval circle;
	public void run() {
		circle = new GOval(100,100);
		circle.setFilled(true);
		add(circle);
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		circle.setLocation(e.getX()- 50, e.getY() - 50);
	}
	
	public void mouseDragged(MouseEvent e) {
		if(getElementAt(e.getX(), e.getY()) == circle) {
		circle.setLocation(e.getX() - 50, e.getY() - 50);
		}
	}
}
