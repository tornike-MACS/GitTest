import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

//4. მაუსის კლიკზე იმავე ადგილზე ჩნდება ბურთი და იწყებს ვარდნას ძირს, თუ მაუსს სხვა
//ადგილზე ვაკლიკებ ბურთი გადადის ახალ ადგილზე და იქედან იწყებს ვარდნას
public class Problem44 extends GraphicsProgram{
	public void run() {
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		GOval ball = new GOval(30,30);
		add(ball, e.getX(), e.getY());
	}
}
