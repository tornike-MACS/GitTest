import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

//44. მაუსის კლიკზე იმავე ადგილზე ჩნდება ბურთი და იწყებს ვარდნას ძირს, თუ მაუსს სხვა
//ადგილზე ვაკლიკებ ბურთი გადადის ახალ ადგილზე და იქედან იწყებს ვარდნას
public class Problem44 extends GraphicsProgram{
	GOval ball;
	public void run() {
		ball = new GOval(30,30);
		ball.setFilled(true);
		addMouseListeners();
		while(true) {
			ball.move(0, 2);
			pause(7);
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		add(ball);
		ball.setLocation(e.getX(), e.getY());
	}
}

//რანაირააად??