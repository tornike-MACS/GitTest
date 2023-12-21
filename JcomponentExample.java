import javax.swing.JLabel;
import javax.swing.*;

import acm.program.ConsoleProgram;

public class JcomponentExample extends ConsoleProgram{
	public void run() {
		JLabel label = new JLabel("hi");
		add(label, SOUTH);
		
		JTextField field = new JTextField(5);
		field.setText("zd");
		add(field, SOUTH);
		field.addActionListener(this);
		
		JButton button = new JButton("Press here!");
		add(button, SOUTH);
	}
}
