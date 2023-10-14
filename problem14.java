import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.*;

public class problem14 extends GraphicsProgram {
	public void run(){
		GRect head = new GRect(240, 320);
		head.setFilled(true);
		head.setColor(Color.RED);
		int x = getWidth()/2 - 120;
		add(head, x, 100);
		
	}
}
