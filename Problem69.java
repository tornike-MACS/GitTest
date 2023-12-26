import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

//69. 68 ამოცანის გაგრძელება. დაამატეთ სქროლი. თუკი ტექსტი ჩაცდება ეკრანს მაშინ ახალი
//ტექსტი მაინც უნდა გამოჩნდეს ეკრანის ბოლოში, შესაბამისად სულ პირველად შეყვანილი
//ტექსტი გაქრება ეკრანიდან.
public class Problem69 extends GraphicsProgram{
	public void run() {
		JTextField field = new JTextField(10);
		add(field, SOUTH);
		
		JButton butt = new JButton("Enter");
		add(butt, SOUTH);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
}
