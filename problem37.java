import acm.program.ConsoleProgram;
import acm.util.*;
//რულეტკა, მომხმარებელს შეყავს 0 დან 36 მდე რიცხვი, შემდეგ ხდება რულეტკის
//დატრიალების სიმულაცია, კონსოლში უნდა დაიბეჭდოს ამოსული რიცხვი და მოიგო თუ არა
//დადებულმა რიცხვმა
public class problem37 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter the number you want to bet on: ");
		int a = rgen.nextInt(0, 36);
		if(n == a) {
			println(" . . . " + a);
			println("Congratulations you won!!");
		}else {
			println(" . . . " + a);
			println("You lost :(");
		}
	}
	RandomGenerator rgen = new RandomGenerator();	
}
