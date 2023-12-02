import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;



public class cimcima extends GraphicsProgram {
	private GOval ball;
	private RandomGenerator rg = RandomGenerator.getInstance();
	
	private boolean daiwyo = false;
	
	private static final double SIZE = 40;
	
	public void run() {
		addMouseListeners();
		
		while(true) {
			if(ball != null) {
				ball.setColor(getColor());
			}
			if(ball.getColor() == Color.GREEN) ball = null;
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		GObject object = getElementAt(e.getX(), e.getY());
		if(object == null) {
			addBall(e.getX(), e.getY());
		}else {
			ball = (GOval)object;
		}
	}
	
//	private void cimcim() {
//		while(daiwyo) {
//			ball.setColor(getColor());
//			if(ball.getColor() == Color.GREEN) {
//				daiwyo = false;
//				break;
//			}
//			pause(30);
//		}
//	}
	
	private Color getColor() {
		int n = rg.nextInt(1, 4);
		if(n == 1) return Color.BLACK;
		if(n == 2) return Color.BLUE;
		if(n == 3) return Color.RED;
		if(n == 4) return Color.GREEN;
		return null;
	}
	
	private void addBall(int x , int y) {
		GOval ball = new GOval(SIZE, SIZE);
		ball.setFilled(true);
		ball.setColor(rg.nextColor());
		add(ball, x - SIZE / 2, y - SIZE / 2);
	}
}
