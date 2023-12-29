package finals;

import java.util.StringTokenizer;

import acm.program.ConsoleProgram;
//ამოცანა 2. სათაური (15 ქულა).
//თქვენი ამოცანაა გადააკეთოთ ინგლისური ენაზე დაწერილი ტექსტი სათაურად. ამისათვის უნდა დაწეროთ მეთოდი translateToTitle რომელსაც გადაეცემა სტრინგი და აბრუნებს სტრინგს. ჩათვალეთ, რომ გადაცემულ ტექსტში გვხვდება მხოლოდ ლათინური სიმბოლოები(დიდიც და პატარაც) და სფეისები. სიტყვები მინიმუმ ერთი სფეისით არის ერთმანეთისგან გამოყოფილი. თქვენი ამოცანაა გადააკეთოთ და დააბრუნოთ გადმოცემული ტექსტი, ისე, რომ დააბრუნებულ ტექსტში ყველა სიტყვა დიდი ასოთი იწყებოდეს და თითოეულ სიტყვაში მხოლოდ ერთი დიდი ასო იყოს.
//მაგალითად:
//etErNAl sUNShiNe OF tHe Spotless mIND -> Eternal Sunshine Of The Spotless Mind
//feAR oF a BLaCk pLaNet -> Fear Of A Black Planet

public class finals2014TranslateToTitle extends ConsoleProgram{
	public void run() {
		println(translateToTitle(readLine()));
	}
	
	private String translateToTitle(String s) {
		String ans = "";
		String translatedWord = "";
		StringTokenizer tk = new StringTokenizer(s);
		while(tk.hasMoreTokens()) {
			translatedWord = translateWord(tk.nextToken());
			ans += translatedWord + " ";
		}
		return ans;
	}
	
	private String translateWord(String s) {
		String firstLetter = s.charAt(0) + "";
		String withoutFirstLetter = "";
		for(int i = 1; i < s.length(); i++) {
			withoutFirstLetter += s.charAt(i) + "";
		}
		
		String ans = firstLetter.toUpperCase() + withoutFirstLetter.toLowerCase(); 
		return ans;
	}

}

