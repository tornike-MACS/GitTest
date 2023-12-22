import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.graphics.GImage;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
//67. გააკეთეთ ფოტოების აპლიკაცია. აპლიკაციას უნდა ჰქონდეს ტექსფილდი სადაც შეიძლება
//ფოტოს(ფაილის) მისამართის ჩაწერა. ენტერზე დაჭერის შემდეგ ეს ფოტო უნდა გამოჩნდეს
//ფანჯრის ცენტრში.
public class Problem67 extends GraphicsProgram{
	public void run() {
		
		JTextField field = new JTextField(10);
		add(field, SOUTH);
		String photo = field.getText();
		
		GImage image = new GImage(photo);
		add(image, 100, 100);
	}
	
	public void actionPerformed(ActionEvent e) {
		println(e.getActionCommand());
	}
}
