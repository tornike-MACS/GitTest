import acm.program.ConsoleProgram;
import acm.util.*;

//36. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა 3-ჯერ ზედიზედ ამოვიდეს ბორჯღალო
public class problem36 extends ConsoleProgram{
	public void run() {
		int bcount = 0;
		int b3count = 0;
		int count = 0;
		for(int i = 0; i < 1000; i++) {
			boolean b = rgen.nextBoolean();
			if(b) {
				bcount++;
			}
			if(bcount == 3) {
				b3count++;
				bcount = 0;
			}
			count++;
		}
		println(count / b3count);
	}
	RandomGenerator rgen = RandomGenerator.getInstance(); 
}
