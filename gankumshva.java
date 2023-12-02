import acm.program.ConsoleProgram;

//ამოცანა 4. ტექსტის განკუმშვა (25 ქულა)
//მოცემული გაქვთ ტექსტის შეკუმშვის ალგორითმი.
//თუკი ტექსტში რომელიმე სიმბოლო ზედიზედ ერთზე მეტჯერ გვხვდება ერთმანეთის
//გვერდით, მაშინ შეგვიძლია ეს ტექსტი შევამციროთ და ამ სიმბოლოების მაგივრად
//დავწეროთ თუ რამდენჯერ მეორდება და რა სიმბოლოა. მაგალითად, “aaaaa”-ს
//მაგივრად შეიძლება დავწეროთ “5a”.
//თქვენი ამოცანაა დაწეროთ მეთოდი longestRunDecompression(), რომელსაც გადაეცემა
//სტრინგი და აბრუნებს სტრინგს. გადაცემული სტრინგი მოცემული ალგორითმით
//შეკუმშული ტექსტია. მეთოდმა უნდა დააბრუნოს ტექსტის თავდაპირველი ვარიანტი,
//ანუ როგორი იყო ტექსტი შეკუმშვამდე.
//შეგიძლიათ ჩათვალოთ, რომ თავდაპირველ ტექსტში მხოლოდ პატარა ლათინური
//ასოები გვხვდებოდა და მასში მაქსიმუმ 9 ერთნაირი სიმბოლო იყო ერთმანეთის
//გვერდით.
//მაგალითად
//longestRunCompress(“2a4b2c”) -&gt; “aabbbbcc”
//longestRunCompress(“abbbbcccdee”) -&gt; “a4b3cd2e”
public class gankumshva extends ConsoleProgram{
	public void run() {
		String s = readLine();
		println(longestRunDecompression(s));
	}
	
	private String longestRunDecompression(String s) {
		String ans = "";
		for(int i = 0; i < s.length() - 1; i++) {
			if(isDigit(s.charAt(i))){
				for(int j = 0; j < (int)s.charAt(i); j++) {
					ans += s.charAt(i + 1);
				}
				i += 1;
			}
		}
		return ans;
	}
	
	private boolean isDigit(char c) {
		if(c >= 'a' && c <= 'z') {
			return false;
		}
		return true;
	}
}
