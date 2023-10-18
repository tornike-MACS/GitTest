import acm.graphics.GLine;
import acm.program.*;

public class problem21 extends GraphicsProgram{
	public void run(){
		int h = getHeight();
		for(int i = 0; i < RESOLUTION + 1; i++){
		GLine hLine = new GLine(0, i * h / RESOLUTION, h, i * h / RESOLUTION);
		add(hLine);
		}
		for(int j = 0; j < RESOLUTION + 1; j++){
		GLine vLine = new GLine (j * h / RESOLUTION, 0, j * h / RESOLUTION, h);
		add(vLine);
		}
	}
	private static final int RESOLUTION = 10; 
}
