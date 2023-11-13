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
	GOval oval = new GOval(40, 40);
	public void mouseMoved(MouseEvent e) {
		oval.setColor(Color.RED);
		oval.setFilled(true);
		add(ball, e.getX(), e.getY());
	}
}
