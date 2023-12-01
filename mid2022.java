import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

// gaferadeba ujrebis
public class mid2022 extends GraphicsProgram{
	
	public void run() {
		addMouseListeners();
		double a = getWidth() / 8;
		double b = getHeight() / 8;
		for(int i = 0; i < 8; i ++) {
			for(int j = 0; j < 8; j++) {
				GRect rect = new GRect(a, b);
				add(rect, a * i; b * j);
			}
		}
	}
	public void mouseClicked(MouseEvent e) {
		
	}
}
//or cvladshi vinaxavt gashavebulebs