import acm.program.ConsoleProgram;
import acm.util.*;

//36. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა 3-ჯერ ზედიზედ ამოვიდეს ბორჯღალო
public class problem36 extends ConsoleProgram{
	public void run() {
		int total = 0;
		for(int i = 0; i < 100; i++) {
			total += experiment();
		}
		println(total / 100);
	}
	RandomGenerator rgen = new RandomGenerator();
	private int experiment() {
		int bcount = 0;
		boolean b = rgen.nextBoolean();
		while(true) {
			if(b) {
				bcount++;
				if(bcount == 3) {
					break;
				}
			}
		}
		return bcount;
	}
}
