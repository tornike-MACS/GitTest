import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.*;

//34. კანვასზე დახატეთ 1000 შემთხვევითი რადიუსის მქონე შემთხვევითი ფერით გაფერადებული
//წრე, შემთხვევით კოორდინატებზე.

public class problem34 extends GraphicsProgram {
	public void run() {
		for(int i = 0; i < 1000; i++) {
			int r = rgen.nextInt();
			int x = rgen.nextInt();
			int y = rgen.nextInt();
			Color color = rgen.nextColor();
			GOval circle = new GOval(x, y, r, r);
			circle.setFilled(true);
			circle.setColor(color);
			add(circle);
		}
		
	}
	RandomGenerator rgen = new RandomGenerator();
}
