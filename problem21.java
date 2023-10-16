import acm.graphics.GLine;
import acm.program.*;

public class problem21 extends GraphicsProgram{
	public void run(){
		int h = getHeight();
		int x1 = 0;
		int x2 = h;
		int y1 = 0;
		int y2 = 0;
		for(int i = 0; i < 11; i++){
		GLine hLine = new GLine(x1,y1,x2,y2);
		add(hLine);
		y1 += h/10;
		y2 += h/10;
		}
	}
}
