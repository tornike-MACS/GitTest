import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;


public class randomBalls extends GraphicsProgram{
	
	private GOval ball;
	private RandomGenerator rg = RandomGenerator.getInstance();
	
	public void run() {
		for(int i = 0; i < 20; i++) {
			double radius = rg.nextDouble(10, 30);
			GOval oval = new GOval(2 * radius, 2 * radius);
			add(oval);
		}
	}
}
