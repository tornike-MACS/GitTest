import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import javafx.scene.input.MouseEvent;
//modzravi burti
public class mid2022_2 extends GraphicsProgram{
	
	private static final double BALL_V = 1;
	private static final double BALL_RADIUS = 40;
	private static final double PAUSE = 5;
	
	private GOval ball;
	private RandomGenerator rg = RandomGenerator.getInstance();
	private boolean isMoving;
	
	public void run() {
		addMouseListeners();
		ball = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
		ball.setFilled(true);
		add(ball, getWidth() / 2 - BALL_RADIUS, 0);
		isMoving = true;
		double v = BALL_V;
		while(true) {
			if(isMoving) {
				ball.move(0, v);
				if(ball.getY() < 0 || ball.getY() + ball.getHeight() >= getHeight()) {
					v = -v;
				}
				pause(PAUSE);// es sachiroaa
			}
		}
		
	}
	
	public void mouseClicked(MouseEvent e) {
		if(getElementAt(e.getX(), e.getY()) == ball) {
			isMoving = !isMoving;
			ball.setColor(rg.nextColor());
		}
	}
	
	
}
