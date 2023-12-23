import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.graphics.GImage;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
//67. გააკეთეთ ფოტოების აპლიკაცია. აპლიკაციას უნდა ჰქონდეს ტექსფილდი სადაც შეიძლება
//ფოტოს(ფაილის) მისამართის ჩაწერა. ენტერზე დაჭერის შემდეგ ეს ფოტო უნდა გამოჩნდეს
//ფანჯრის ცენტრში.
public class Problem67 extends GraphicsProgram{
	JTextField field;
	public void run() {
		
		field = new JTextField(10);
		add(field, SOUTH);
//		field.addActionListener(this);
		
		
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		String address = field.getText();
		GImage image = new GImage(address);
		add(image, 100, 100);
	}
}
