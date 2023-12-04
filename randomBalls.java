import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;


public class randomBalls extends GraphicsProgram{
	
	private GOval ball;
	private RandomGenerator rg = RandomGenerator.getInstance();
	private boolean startMoving = false;
	
	public void run() {
		addMouseListeners();
		for(int i = 0; i < 20; i++) {
			double radius = rg.nextDouble(10, 30);
			GOval oval = new GOval(2 * radius, 2 * radius);
			oval.setFilled(true);
			add(oval, rg.nextDouble(0, getWidth() - 2 * radius), rg.nextDouble(0, getHeight() - 2 * radius));
		}
		while(true) {
			System.out.println("daiwyo");
			if(startMoving) {
				ball.move(0, 3);
			}
			pause(1);
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		if(getElementAt(e.getX(), e.getY()) != null) {
			ball = (GOval)getElementAt(e.getX(), e.getY());
			ball.setColor(rg.nextColor());
		}else{
			System.out.println("sdc");
			startMoving = true;
		}
	}
}
