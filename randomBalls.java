import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import javafx.scene.input.MouseEvent;


public class randomBalls extends GraphicsProgram{
	
	private GOval ball;
	private RandomGenerator rg = RandomGenerator.getInstance();
	
	public void run() {
		addMouseListeners();
//		for(int i = 0; i < 20; i++) {
//			double radius = rg.nextDouble(10, 30);
//			GOval oval = new GOval(2 * radius, 2 * radius);
//			oval.setFilled(true);
//			add(oval, rg.nextDouble(0, getWidth() - 2 * radius), rg.nextDouble(0, getHeight() - 2 * radius));
//		}
	}
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("sd");
	}
}

