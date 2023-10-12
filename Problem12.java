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
		GRect myWindow = new GRect(80, 80);
		add(myWindow, 220, 240);
		myWindow = new GRect(80, 80);
		add(myWindow, 460, 240);
		GRect myDoor = new GRect(60, 120);
		add(myDoor, 350, 280 );
	}
}