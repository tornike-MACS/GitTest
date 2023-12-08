import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

//53. დაწერეთ პროგრამა რომელიც ფაილიდან წაიკითხავს ტექტს და დათვლის შემდეგ
//სტატისტიკებს: სიმბოლოების რაოდენობა, სიტყვების რაოდენობა(სიტყვები სფეისებით
//გამოყოფილია ერთმანეთისგან), წინადადებების რაოდენობა. რამდენი წინდადება მთავრდება
//წერტილით, კითხვის ნიშნით და ძახილის ნიშნით?
public class Problem53 extends ConsoleProgram{
	public void run() {
		int count = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Problem53.java"));
			while(true) {
				System.out.println("sd");
				int a = reader.read();
				if(a == 1) {
					break;
				}
				count++;
			}
		}catch(IOException e) {
			
		}
		println(count);
	}
}
