import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

//0. წინა ამოცანის გაგრძელება, დაამატეთ ვერტიკალური კედლებიდან ასხლეტვა. ანუ ბურთი
//მოძრაობს მარცხენა კედლიდან მარჯვნივ. როგორც კი მარჯვენა კედელს დაეტაკება იმავე
//სიჩქარით უნდა გააგრძელოს მოძრაობა მაჯვენა კედლიდან მარცხნივ. როგორც კი მარცხენა
//კედელს დაეტაკება უნდა გააგრძელოს მარჯვნივ და ა.შ. უსასრულოდ.
public class problem40 extends GraphicsProgram {
	public void run() {
		int move = 1;
		GOval oval = new GOval(0, getHeight() / 2 - 20, 40, 40);
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval);
		while(true) {
			oval.move(move, 0);
			pause(1);
			if(oval.getX() == getWidth() - 40) {
				move *= -1;
			}
		}
		
	}
}
