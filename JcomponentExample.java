import javax.swing.JLabel;

import java.awt.event.*;

import javax.swing.*;

import acm.program.ConsoleProgram;

public class JcomponentExample extends ConsoleProgram{
	public void run() {
		JLabel label = new JLabel("name");
		add(label, SOUTH);
		
		JTextField field = new JTextField(10);
		field.setText("");
		add(field, SOUTH);
		field.addActionListener(this);
		
		JButton button = new JButton("Press here!");
		button.addActionListener(this);
		add(button, SOUTH);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		println(e.getActionCommand());
	}
}
