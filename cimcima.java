import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;



public class cimcima extends GraphicsProgram {
	private GOval ball;
	private RandomGenerator rg = RandomGenerator.getInstance();
	
	private static final double SIZE = 40;
	
	public void run() {
		addMouseListeners();
		
	}
	
	public void mouseClicked(MouseEvent e) {
		ball = (GOval)getElementAt(e.getX(), e.getY());
		if(ball == null) {
			ball = new GOval(SIZE, SIZE);
			add(ball, e.getX() - SIZE / 2, e.getY() - SIZE / 2);
			ball.setFilled(true);
			ball.setColor(rg.nextColor());
		}
	}
}
