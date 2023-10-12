import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.awt.*;

public class Problem13 extends GraphicsProgram {
	public void run() {
		GLine myLine = new GLine(0, 230, 1000, 230);
		myLine.setColor(Color.RED);
		add(myLine);
	}
}
