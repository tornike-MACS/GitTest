import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

//53. დაწერეთ პროგრამა რომელიც ფაილიდან წაიკითხავს ტექტს და დათვლის შემდეგ
//სტატისტიკებს: სიმბოლოების რაოდენობა, სიტყვების რაოდენობა(სიტყვები სფეისებით
//გამოყოფილია ერთმანეთისგან), წინადადებების რაოდენობა. რამდენი წინდადება მთავრდება
//წერტილით, კითხვის ნიშნით და ძახილის ნიშნით?
public class Problem53 extends ConsoleProgram{
	int countWords = 0;
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("text.java"));
			while(true) {
				String s = reader.readLine();
				if(s == null) {
					break;
				}
				for(int i = 0; i < s.length(); i++) {
					if(s.charAt(i) == ' ') {
						countWords++;
					}
				}
			}
		}catch(IOException e) {
			
		}
		println(countWords);
	}
}
