import acm.program.ConsoleProgram;

//ამოცანა 4. ბოროტი კაცი (25 ქულა)
//ტექსტში, რომელშიც ერთიდაიგივე სიმბოლო გვერდიგვერდ არ გვხდებოდა, ვიღაც
//ბოროტმა კაცმა სხვადასხვა ადგილებში ჩაამატა ერთიდაიგივე სიმბოლოები ორ-ორად,
//ერთმანეთის გვერდით. ამ ჩამატებულ და შეცვლილ სტინგში კიდევ ჩაამატა
//ერთმანეთის გვერდით ერთიდაიგივე სიმბოლოები და ა.შ. სანამ არ მობეზრდა.
//“How are you?” -&gt; “How are yoxxu?” -&gt; “Hoyyw are yoxxu?” -&gt; “Hoyyw are
//yoxzzxu?” -&gt; “Hoyyw aaare yoxzzxu?”.
//თქვენი ამოცანაა აღადგინოთ საწყისი ტექსტი. ამისათვის უნდა დაწეროთ unEvilText()
//მეთოდი რომელსაც გადაეცემა სტრინგი და აბრუნებს სტრინგს. გადაცემულ სტრინგში
//წერია ბოროტი კაცის მიერ ზემოთ აღწერილი მეთოდით “გაფუჭებული” ტექსტი.
//მეთოდმა უნდა დააბრუნოს თავდაპირველი ტექსტი.
public class mid2016 extends ConsoleProgram{
	public void run() {
		String s = readLine();
		println(unEvilText(s));
	}
	
	private String unEvilText(String s) {
		String ans = s;
		while(hasDoubleWords(ans)) {
			for(int i = 0; i < ans.length() - 1; i++) {
				if(ans.charAt(i) == ans.charAt(i + 1)) {
					ans = cut(ans, i);
				}
			}
		}
		return ans;
	}
	
	private String cut(String s, int i) {
		String ans;
		String substring1 = s.substring(0, i);
		String substring2 = s.substring(i + 2);
		ans = substring1 + substring2;
		return ans;
	}
	
	private boolean hasDoubleWords(String s) {
		for(int i = 0; i < s.length(); i ++) {
			if(s.charAt(i) == s.charAt(i + 1)) {
				return true;
			}
		}
		return false;
	}
}




//ამოცანა 3. გეომეტრიული პროგრესია (20 ქულა)
//თქვენი ამოცანაა დაადგინოთ არის თუ არა მომხმარებლის მიერ შემოყვანილი რიცხვები
//გეომეტრიული პროგრესია. ამისათვის თქვენ უნდა დაწეროთ კონსოლის პროგრამა.
//ჩათვალეთ რომ მომხმარებელს მხოლოდ მთელი რიცხვები შემოჰყავს მანამ სანამ არ
//შემოიყვანს -1. როგორც კი მომხმარებელი -1 შემოიყვანს თქვენმა პროგრამამ უნდა
//დაბეჭდოს სტრინგი “Geometric progresson” თუკი შეყვანილი მიმდევრობა
//გეომეტრიული პროგრესიია და უნდა დაბეჭდოს სტრინგი “Not a geometric porgression”
//წინააღმდეგ შემთხვევაში. რის შემდეგაც პროგრამამ უნდა დაასრულოს მუშაობა