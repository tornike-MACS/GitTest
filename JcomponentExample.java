import javax.swing.JLabel;

import acm.program.ConsoleProgram;

public class JcomponentExample extends ConsoleProgram{
	public void run() {
		JLabel label = new JLabel("hi");
		add(label, SOUTH);
	}
}
