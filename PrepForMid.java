import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

//ujebis gaferadeba
public class PrepForMid extends GraphicsProgram{
	private static final int ROWS = 8;
	private static final int COLUMNS = 8;
	private static final int SIDE_LEN = 55;
	
	private GRect first = null;
	private GRect second = null;
	private GRect third = null;
	
	public void run() {
		addMouseListeners();
		drawBoard();
	}
	private void drawBoard() {
		for(int i = 0; i < ROWS; i++) {
			for(int j = 0; j < COLUMNS; j++) {
				GRect rect = new GRect(SIDE_LEN, SIDE_LEN);
				add(rect, i * SIDE_LEN, j * SIDE_LEN);
			}
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		GRect rect = (GRect)getElementAt(e.getX(), e.getY());
		if(rect == first) {
			first.setFilled(false);
			first = second;
			second = null;
			third = null;
			return;
		}
		if(rect == second) {
			second.setFilled(false);
			second = null;
			third = null;
			return;
		}
		if(first == null) {
			first = rect;
			first.setFilled(true);
			second = null;
			return;
		}
		if(second == null) {
			second = rect;
			second.setFilled(true);
			third = null;
			return;
		}
		if(third == null) {
			third = rect;
			third .setFilled(true);
			first.setFilled(false);
			first = second;
			second = third;
			third = null;
			return;
		}
		if(first != null) {
			
		}
		
	}
}
