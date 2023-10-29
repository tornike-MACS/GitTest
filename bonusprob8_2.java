import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
//დაწერეთ მეთოდი რომელიც აბრუნებს კვადრატს, როგორც ობიექტს(GRect). მეთოდს
//არგუმენტად გადაეცემა 3 ცვლადი: გვერდის სიგრძე, ფერი, და ცვლადი რომელიც
//აღნიშნავს შევსებული უნდა იყოს თუ არა კვადრატი. კვადრატი უნდა გამოიყურებოდეს
//გადმოცემული ცვლადების შესაბამისად.
//a. მეთოდის დაწერის შემდეგ შექმენით ობიექტი ამ მეთოდის გამოყენებით და
//გამოაჩინეთ ფანჯრის ცენტრში.
public class bonusprob8_2 extends GraphicsProgram {
	public void run() {
		addrect(30, Color.RED,true);
	}
	private GRect addrect(int a, Color color, boolean fillOrNot) {
		GRect rect = new GRect(a, a);
		rect.setFilled(fillOrNot);
		rect.setColor(color);
		return rect;
	}
	
}
