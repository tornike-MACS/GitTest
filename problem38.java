import acm.program.ConsoleProgram;
import acm.util.*;
//38. მოხმარებელს აქვს საწყისი თანხა 1000, თამაშობს მანამ სანამ არ წააგებს ყველაფერს. ყოველ
//ჯერზე შეყავს ფსონის თანხა და რიცხვი რომელზეც დებს. ხდება რულეტკის დატრიალების
//სიმულაცია(0-დან 36-მდე შემთხვევითი რიცხვი), მოგების შემთხვევაში მოთამაშეს
//უორმაგედბა დადებული თანხა წაგების შემთხვევაში კი მოთამაშე კარგავს დადებულ თანხას.
//მოთამაშე მოგებულია მაშინ თუ რულეტკაზე ამოსული რიცხვი ემთხვევა მის მიერ დადებულ
//რიცხვს. პროგრამა ყოველ მოქმედებაზე უნდა ბეჭდავდეს შესაბამის შეტყობინებას, ადვილადრომ გაერკვეს მოთამაშე, რა რიცხვი ამოვიდა, რამდენი წააგო, რამდენი მოიგო, რამდენი აქვს
//ბალანსი
public class problem38 extends ConsoleProgram { 
	public void run() {
		int balance = 1000;
		while(true) {
			int bet = readInt("Enter how much do you bet: ");
			int number = readInt("Enter the number you bet on: ");
			int roulette = rgen.nextInt(0, 36);
			println("Ball stopped at: " + roulette);
			if(number == roulette) {
				balance += 35 * bet;
				println("Congratulations! You won: " + 35 * bet);
				println("Your balance is: " + balance);
			}else {
				balance -= bet;
				println("You lost: " + bet);
				println("Yor balance is: " + balance);
			}
			if(balance == 0)break;
		}
	}
	RandomGenerator rgen = new RandomGenerator();
}
