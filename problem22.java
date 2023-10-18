import acm.graphics.*;
import acm.program.*;

public class problem22 extends GraphicsProgram{
	public void run(){
		double squareSize = getHeight()/RESOLUTION;
		for(int i = 0; i < RESOLUTION; i++){
			for(int j = 0; j < RESOLUTION; j++){
				GRect square = new GRect(squareSize, squareSize);
				add(square, i * squareSize, j * squareSize);
				square.setFilled((i + j) % 2 != 0);
			}
		}
	}
	private static final int RESOLUTION = 40;
}
