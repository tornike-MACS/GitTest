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
		GRect myRect = new GRect (100, 200);
		add(myRect, 100, 100);
	}
}
