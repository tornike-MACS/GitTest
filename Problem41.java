import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//გააკეთეთ Paint-ის ფანქრის ანალოგიური ხელსაწყო. კერძოდ, მაუსის ყოველ მოძრაობაზე
//ეკრანზე დაამატეთ გაფერადებული წრეწირები იმავე წერტილში სადაც მაუსი მდებარეობს.
public class Problem41  extends GraphicsProgram{
	public void run() {
		addMouseListeners();
	}
	public void mouseMoved(MouseEvent e) {
		GOval oval = new GOval(40, 40);
		oval.setColor(Color.RED);
		oval.setFilled(true);
		add(oval, e.getX(), e.getY());
	}
}
