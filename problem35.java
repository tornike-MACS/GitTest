import acm.program.ConsoleProgram;
import acm.util.*;

//35. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა ამოვიდეს ბორჯღალო

public class problem35 extends ConsoleProgram {
	public void run() {
		double bcount = 0;
		double count = 0;
		boolean b = rgen.nextBoolean();
		for(int i = 0; i < 1000; i++) {
			if(b) {
				bcount++;
			}
			count++;
		}
		println(count / bcount);
	}
	RandomGenerator rgen = RandomGenerator.getInstance();
}
