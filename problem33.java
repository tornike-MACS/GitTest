import java.awt.Color;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

//33. დაწერეთ პროგრამა რომელიც კანვასზე დახატავს შემთხვევითი ფერის მქონე წრეწირს,
//რაიდიუსიც შემთხვევით აირჩეით შეზღუდული რეინჯიდან
public class problem33  extends GraphicsProgram{
	public void run() {
		int r = rgen.nextInt(150, 200);
		int h = getHeight();
		int w = getWidth();
		Color color = rgen.nextColor();
		GOval circle = new GOval(w / 2 - r / 2, h / 2 - r / 2, r, r);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle);
	}
	RandomGenerator rgen = new RandomGenerator();
}
