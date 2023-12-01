import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

// gaferadeba ujrebis
public class mid2022 extends GraphicsProgram{
	GRect first, second;
	
	public void run() {
		addMouseListeners();
		double a = getWidth() / 8;
		double b = getHeight() / 8;
		for(int i = 0; i < 8; i ++) {
			for(int j = 0; j < 8; j++) {
				GRect rect = new GRect(a, b);
				add(rect, a * i, b * j);
			}
		}
	}
	public void mouseClicked(MouseEvent e) {
		GRect rect = (GRect)getElementAt(e.getX(), e.getY());
		if(rect == null) { // rorame
			return;
		}
		if(rect == first) {
			first.setFilled(false);
			first = second;
			second = null;
			return;
		}
		if(rect == second) {
			second.setFilled(false);
			second = null;
			return;
		}
		if(rect)
	}
}
//or cvladshi vinaxavt gashavebulebs