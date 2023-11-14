import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem43 extends GraphicsProgram{
	GLine line;
	GOval circle;
	public void run() {
		addMouseListeners();
		circle = new GOval(100,100);
		circle.setFilled(true);
		add(circle);
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
//		line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
//		add(line);
	}
	
	public void mouseDragged(MouseEvent e) {
		if(getElementAt(e.getX(), e.getY()) == circle) {
		circle.setLocation(e.getX(), e.getY());
		}
	}
}
