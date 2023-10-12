import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {
	public void run() {
		GRect myRect = new GRect (400, 200);
		add(myRect, 180, 200);
		GLine myLine = new GLine (180, 200, 380, 100);
		add(myLine);
		myLine = new GLine (380, 100, 580, 200);
		add(myLine);
		GRect window = new GRect(80, 80);
		add(window, 220, 240);
		window = new GRect(80, 80);
		add(window, 460, 240);
		GRect door = new GRect(60, 120);
		add(door, 350, 280 );
	}
}