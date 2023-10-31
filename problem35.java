import acm.program.ConsoleProgram;
import acm.util.*;

//35. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა ამოვიდეს ბორჯღალო

public class problem35 extends ConsoleProgram {
	public void run() {
		int count = 0;
		while(true) {
			boolean b = rgen.nextBoolean();
			if(b) {
				println("borjgalo");
				count++;
				break;
			}else {
				println("safasuri");
				count++;
			}
		}
		println("we need " + count + " tosses to get a tail");
	}
	RandomGenerator rgen = new RandomGenerator()
			//თავიდაააან!!!!!!
}
