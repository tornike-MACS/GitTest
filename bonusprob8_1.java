import java.awt.*;

import acm.graphics.*;
import acm.program.*;

public class bonusprob8_1 extends GraphicsProgram {
	public void run() {
		int x = getHeight();
		int y = x;
		GLabel label = new GLabel("width: " + x + ", height: " + y, 100, 75);
		label.setFont("London-42");
		label.setColor(Color.RED);
		add(label);
	}
}