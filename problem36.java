import acm.program.ConsoleProgram;
import acm.util.*;

//36. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა 3-ჯერ ზედიზედ ამოვიდეს ბორჯღალო
public class problem36 extends ConsoleProgram{
	public void run() {
		int bcount = 0;
		int count = 0;
		while(true) {
			boolean b = rgen.nextBoolean();
			if(b) {
				println("borjgalo");
				bcount++;
			}else {
				println("safasuri");
				bcount = 0;
			}
			count++;
			if(bcount == 3) break;
		}
		println(count + " tosses");
	}
	RandomGenerator rgen = new RandomGenerator();
}
