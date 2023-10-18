import acm.graphics.*;
import acm.program.*;

public class problem22 extends GraphicsProgram{
	public void run(){
		double sizeOfSquare = (double)getHeight()/SIZE_OF_TABLE;
		for(int i = 0; i < SIZE_OF_TABLE; i++){
			for(int j = 0; j < SIZE_OF_TABLE; j++){
				double x = j*sizeOfSquare;
				double y = i*sizeOfSquare;
				GRect square = new GRect(x, y, sizeOfSquare, sizeOfSquare);
				add(square);
				square.setFilled((i+j) % 2 != 0);
			}
		}
	}
	private static final int SIZE_OF_TABLE = 8;
}
