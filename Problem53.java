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
	int countSymbols = 0;
	int countSentences = 0;
	int countComas = 0;
	int countQuestion = 0;
	int countExclamation = 0;
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
					}else { 
						countSymbols++;
					}
					if(s.charAt(i) == '.') {
						countSentences++;
						countComas++;
					}
					if(s.charAt(i) == '?') {
						countSentences++;
						countQuestion++;
					}
					if(s.charAt(i) == '!') {
						countExclamation++;
						countSentences++;
					}
				}
				
			}
		}catch(IOException e) {
			
		}
		println("words: " + countWords);
		println("Symbols: " + countSymbols);
		println("sentences: " + countSentences);
		println("comas: " + countComas);
		println("question marks: " + countQuestion);
		println("Exclamation: " + countExclamation);
	}
}
