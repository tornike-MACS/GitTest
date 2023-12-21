import javax.swing.JLabel;

import java.awt.event.*;

import javax.swing.*;

import acm.graphics.GImage;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class JcomponentExample extends GraphicsProgram{
	public void run() {
//		JLabel label = new JLabel("name");
//		add(label, SOUTH);
//		
//		JTextField field = new JTextField(10);
//		field.setText("");
//		field.addActionListener(this);
//		add(field, SOUTH);
//		
//		JButton button = new JButton("Press here!");
//		add(button, SOUTH);
//		
		GImage image = new GImage("Screenshot 2023-11-16 211117.png");
		add(image);
	}
	
	public void actionPerformed(ActionEvent e) {
		println(e.getActionCommand());
	}
}
