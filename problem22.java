import acm.graphics.*;
import acm.program.*;

public class problem22 extends GraphicsProgram{
	public void run(){
		int y = 0;
		int x = 0;
		int sizeOfSquare = getHeight()/SIZE_OF_TABLE;
		GRect square = new GRect(sizeOfSquare, sizeOfSquare, x, y);
		for(int i = 0; i < SIZE_OF_TABLE; i++){
			for(int j = 0; j < SIZE_OF_TABLE; j++){
				add(square);
				square.setFilled((i+j) % 2 != 0);
				x += sizeOfSquare;
			}
			y += sizeOfSquare;
		}
	}
	private static final int SIZE_OF_TABLE = 8;
}
