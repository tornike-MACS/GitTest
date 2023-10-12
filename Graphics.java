import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Graphics extends GraphicsProgram {
	public void run() {
//		GOval myOval = new GOval(100, 200);
//		add(myOval, 100, 100);
//		GOval newOval = new GOval(100, 200);
//		add(newOval, 200, 200);
//		newOval.setFilled(true);
//		newOval.setColor(Color.RED);
		GRect myRect = new GRect (400, 200);
		add(myRect, 180, 200);
		GLine myLine = new GLine (180, 200, 380, 100);
		add(myLine);
		myLine = new GLine (380, 100, 580, 200);
		add(myLine);
		GRect window = new GRect(80, 80);
		add(window, 220, 240);
		window = new GRect(80, 80);
		add(window, 540, 240);
	}
}
