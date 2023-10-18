import acm.graphics.GLine;
import acm.program.*;

public class problem21 extends GraphicsProgram{
	public void run(){
		int h = getHeight();
		for(int i = 0; i < 11; i++){
		GLine hLine = new GLine(0, i * h / 10, h, i * h / 10);
		add(hLine);
		}
		for(int j = 0; j < 11; j++){
		GLine vLine = new GLine (j * h / 10, 0, j * h / 10, h);
		add(vLine);
		}
	}
}
