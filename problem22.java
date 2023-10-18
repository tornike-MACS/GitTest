import acm.graphics.*;
import acm.program.*;

public class problem22 extends GraphicsProgram{
	public void run(){
		double y = 0;
		double x = 0;
		int sizeOfSquare = getHeight()/SIZE_OF_TABLE;
		GRect square = new GRect(sizeOfSquare, sizeOfSquare);
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				add(square, x, y);
				square.setFilled((i+j) % 2 != 0);
				x += sizeOfSquare;
			}
			y += sizeOfSquare;
		}
	}
	private static final int SIZE_OF_TABLE = 8;
}
