import acm.program.ConsoleProgram;
import acm.util.*;

//35. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა ამოვიდეს ბორჯღალო

public class problem35 extends ConsoleProgram {
	public void run() {
		double bcount = 0;
		double count = 0;
		for(int i = 0; i < 1000; i++) {
			boolean b = rgen.nextBoolean();
			if(b) {
				bcount++;
			}
			count++;
		}
		println(count / bcount);
	}
	RandomGenerator rgen = RandomGenerator.getInstance();
}
