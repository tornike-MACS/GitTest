import javax.swing.JLabel;
import javax.swing.*;

import acm.program.ConsoleProgram;

public class JcomponentExample extends ConsoleProgram{
	public void run() {
		JLabel label = new JLabel("hi");
		add(label, SOUTH);
		
		JTextField field = new JTextField(15);
		add(field, SOUTH);
	}
}
