import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

//4. მაუსის კლიკზე იმავე ადგილზე ჩნდება ბურთი და იწყებს ვარდნას ძირს, თუ მაუსს სხვა
//ადგილზე ვაკლიკებ ბურთი გადადის ახალ ადგილზე და იქედან იწყებს ვარდნას
public class Problem44 extends GraphicsProgram{
	GOval ball;
	public void run() {
		addMouseListeners();
		while(true) {
			ball.move(2, 0);
			pause(7);
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		ball = new GOval(30,30);
		ball.setFilled(true);
		add(ball, e.getX(), e.getY());
	}
}
