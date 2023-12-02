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
		
		
	}
	
	public void mouseClicked(MouseEvent e) {
		
	}
	
	
}
