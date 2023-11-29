import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

//ამოცანა 1. ლოგარითმი (15 ქულა)
//თქვენი ამოცანაა დაწეროთ მეთოდი რომელიც ლოგარითმს გამოითვლის. შეგახსენებთ რომ ლოგარითმი n-ის ფუძით m 
//არის რიცხვი რომელხარისხშიცუნდა ავიყვანოთ n იმისათვის რომ m მივიღოთ. ანუ, თუ n^x =m , მაშინ xის მთელინაწილია შედეგი. n ^ x > m
//log(5 ,25) =2
//5, 26
//დაწერეთ მეთოდი log რომელსაც გადაეცემა 2 მთელი რიცხვი და რომელიცაბრუნებს ამ რიცხვებითვის 
//ლოგარითმის მთელ ნაწილს. თქვენ არ გავთ უფლება გამოიყენოთ Math კლასი.
//შესაბამისადვერგამოიყენებთმეთოდებს log, log10, log1p, pow და ა.შ. ჩათვალეთ, რომ m>n>0.
public class PrepForMid extends GraphicsProgram{
	private static final int ROWS = 8;
	private static final int COLUMNS = 8;
	private static final int SIDE_LEN = 55;
	
	private GRect r1 = null;
	private GRect r2 = null;
	
	public void run() {
		addMouseListeners();
		drawBoard();
	}
	private void drawBoard() {
		for(int i = 0; i < ROWS; i++) {
			for(int j = 0; j < COLUMNS; j++) {
				GRect r = new GRect(SIDE_LEN, SIDE_LEN);
				add(r, i*SIDE_LEN, j*SIDE_LEN);
			}
		}
	}
	public void mouseClicked(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		GRect obj = (GRect) getElementAt(x, y);
		if(obj == null) return;//break
		if(r1 == null && r2 == null) {
			r2 = obj;
			r2.setFilled(true);
			return;
		}
		if(r2 == null && r1 != null) {
			if(obj == r1) {
				r1.setFilled(false);
			}
			r2 = r1;
			r1 = obj;
			r1.setFilled(true);
			return;
		}
		if(obj == r2) {
			r2.setFilled(false);
			r2 = null;
			return;
		}
		if(obj == r1) {
			r1.setFilled(false);
			r1 = r2;
			r2 = null;
			return;
		}
		r2.setFilled(false);
		r2 = r1;
		r1 = obj;
		r1.setFilled(true);
		
	}
	
}
