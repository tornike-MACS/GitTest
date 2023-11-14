import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem43 extends GraphicsProgram{
	GLine line;
	GOval circle;
	public void run() {
		addMouseListeners();
		circle = new GOval(20,20);
		circle.setFilled(true);
		add(circle);
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(line);
	}
	
	public void mouseDragged(MouseEvent e) {
		circle.setLocation(e.getX() - 10, e.getY() - 10);
	}
}
