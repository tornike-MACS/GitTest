import acm.graphics.*;
import acm.program.*;

public class problem22 extends GraphicsProgram{
	public void run(){
		double y = 0;
		double x = 0;
		double sizeOfSquare = (double)getHeight()/SIZE_OF_TABLE;
		GRect square = new GRect(y, x, sizeOfSquare, sizeOfSquare);
		for(int i = 0; i < SIZE_OF_TABLE; i++){
			for(int j = 0; j < SIZE_OF_TABLE; j++){
				add(square);
				square.setFilled((i+j) % 2 != 0);
				x = x + sizeOfSquare;
			}
			y = y + sizeOfSquare;
		}
	}
	private static final int SIZE_OF_TABLE = 8;
}
