import acm.graphics.*;
import acm.program.*;
import acm.util.*;

//33. დაწერეთ პროგრამა რომელიც კანვასზე დახატავს შემთხვევითი ფერის მქონე წრეწირს,
//რაიდიუსიც შემთხვევით აირჩეით შეზღუდული რეინჯიდან
public class problem33  extends GraphicsProgram{
	public void run() {
		GOval circle = new GOval(getWidth() / 2, getHeight() / 2, rgen.nextInt(40, 100), rgen.nextInt(50, 110));
		circle.setFilled(true);
		add(circle);
	}
	RandomGenerator rgen = new RandomGenerator();
}
