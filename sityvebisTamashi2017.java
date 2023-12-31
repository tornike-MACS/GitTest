import acm.program.ConsoleProgram;
//ამოცანა 3. სიტყვების თამაში(25 ქულა)
//შესაძლებელია თუ არა ერთი სიტყვის სიმბოლოებისგან მეორე სიტყვის მიღება? ამ
//ამოცანის გადასაჭრელად დაწერეთ მეთოდი spellWord, რომელსაც გადაეცემა ორი
//სტრინგი და აბრუნებს ბულეანს. თქვენი მიზანია პირველი სტრინგიდან მეორე
//მიიღოთ. ამისათვის შეგიძლიათ პირველი სტრინგიდან გარკვეული სიმბოლოების
//ამოჭრათ ხოლო დარჩენილი სიმბოლოები გადააადგილოთ როგორც გინდათ ისე. თუკი
//პირველი სტრინგიდან მეორის მიღება შესაძლებელია მაშინ მეთოდი უნდა აბრუნებდეს
//true-ს, წინააღმდეგ შემთხვევაში false-ს.
//მაგალითად თუკი გადმოგეცათ სტრინგები  მაშინ მეთოდმა უნდა
//დააბრუნოს true. ხოლო თუ გადმოგეცათ სტრინგები  მაშინ
//მეთოდმა უნდა დააბრუნოს false.
public class sityvebisTamashi2017 extends ConsoleProgram{
	public void run() {
		String a = readLine();
		String b = readLine();
		println(spellWord(a, b));
	}
	
	private boolean spellWord(String a, String b) {
		for(int i = 0; i < b.length(); i++) {
			if(a.contains(b.charAt(i) + "")) {
				a = cut(a, b.charAt(i));
				b = cut(b, b.charAt(i));
			}else return false;
		}
		return true;
	}
	
	private String cut(String s, char c) {
		String substring1 = s.substring(0, s.indexOf(c));
		String substring2 = s.substring(s.indexOf(c) + 1);
		return substring1 + substring2;
	}
}
