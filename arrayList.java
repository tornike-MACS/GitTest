import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class arrayList extends ConsoleProgram{
	public void run() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		println(list.get(0));
	}
}
