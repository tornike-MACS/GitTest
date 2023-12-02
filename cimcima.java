import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;



public class cimcima extends GraphicsProgram {
	private GOval ball;
	private RandomGenerator rg = RandomGenerator.getInstance();
	
	private boolean daiwyo = true;
	
	private static final double SIZE = 40;
	
	public void run() {
		addMouseListeners();
		cimcim();
	}
	
	public void mouseClicked(MouseEvent e) {
		ball = (GOval)getElementAt(e.getX(), e.getY());
		if(ball == null) {
			ball = new GOval(SIZE, SIZE);
			ball.setFilled(true);
			ball.setColor(rg.nextColor());
			add(ball, e.getX() - SIZE / 2, e.getY() - SIZE / 2);
		}else {
			daiwyo = true;
		}
	}
	
	private void cimcim() {
		while(daiwyo) {
			ball.setColor(getColor());
			if(ball.getColor() == Color.GREEN) {
				daiwyo = false;
				break;
			}
			pause(300);
		}
	}
	
	private Color getColor() {
		int n = rg.nextInt(1, 4);
		if(n == 1) return Color.BLACK;
		if(n == 2) return Color.BLUE;
		if(n == 3) return Color.RED;
		if(n == 4) return Color.GREEN;
		return null;
	}
}
