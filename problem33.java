import acm.graphics.*;
import acm.program.*;
import acm.util.*;

//33. დაწერეთ პროგრამა რომელიც კანვასზე დახატავს შემთხვევითი ფერის მქონე წრეწირს,
//რაიდიუსიც შემთხვევით აირჩეით შეზღუდული რეინჯიდან
public class problem33  extends GraphicsProgram{
	public void run() {
		GOval circle = new GOval(0, 0, rgen.nextInt(30, 50), rgen.nextInt(30, 50));
		circle.setFilled(true);
		add(circle);
	}
	RandomGenerator rgen = new RandomGenerator();
}
