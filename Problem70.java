import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;
//70. მთელ ფორმაზე ბადის დახატვა, ისე რომ ფორმის ზომის ცვლილებაზე ბადის უჯრის ზომაც
//პროპორციულად იზრდებოდეს
public class Problem70 extends GraphicsProgram{
	public void run() {
		drawNet();
	}
	
	private void drawNet() {
		removeAll();
		for(int i = 0; i < 10; i++) {
			GLine vLine = new GLine(i * getWidth() / 10, 0, i * getWidth() / 10, getHeight());
			add(vLine);
			GLine hLine = new GLine(0, i * getHeight() / 10, getWidth(), i * getHeight() / 10);
			add(hLine);
		}
 	}
	
	public void componentHidden(ComponentEvent e) { }
	public void componentMoved(ComponentEvent e) { }
	public void componentResized(ComponentEvent e) { drawNet(); }
	public void componentShown(ComponentEvent e) { }
}
