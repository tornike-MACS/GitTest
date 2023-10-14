import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.awt.*;

public class Problem13 extends GraphicsProgram {
	public void run() {
		int height = getHeight()/2;
		GLine myLine = new GLine(0, height, 1000, height);
		myLine.setColor(Color.RED);
		add(myLine);
	}
}
