import acm.program.ConsoleProgram;
//ამოცანა 3. სიტყვების თამაში(25 ქულა)
//შესაძლებელია თუ არა ერთი სიტყვის სიმბოლოებისგან მეორე სიტყვის მიღება? ამ
//ამოცანის გადასაჭრელად დაწერეთ მეთოდი spellWord, რომელსაც გადაეცემა ორი
//სტრინგი და აბრუნებს ბულეანს. თქვენი მიზანია პირველი სტრინგიდან მეორე
//მიიღოთ. ამისათვის შეგიძლიათ პირველი სტრინგიდან გარკვეული სიმბოლოების
//ამოჭრათ ხოლო დარჩენილი სიმბოლოები გადააადგილოთ როგორც გინდათ ისე. თუკი
//პირველი სტრინგიდან მეორის მიღება შესაძლებელია მაშინ მეთოდი უნდა აბრუნებდეს
//true-ს, წინააღმდეგ შემთხვევაში false-ს.
//მაგალითად თუკი გადმოგეცათ სტრინგები “gamarjoba” და “baro” მაშინ მეთოდმა უნდა
//დააბრუნოს true. ხოლო თუ გადმოგეცათ სტრინგები “gamarjoba” და “oboba” მაშინ
//მეთოდმა უნდა დააბრუნოს false.
public class sityvebisTamashi2017 extends ConsoleProgram{
	public void run() {
		String a = readLine();
		String b = readLine();
		println(spellWord(a, b));
	}
	
	private boolean spellWord(String a, String b) {
		for(int i = 0; i < a.length() - 2; i++) {
			for(int j = 1; j < a.length() - 1; j++) {
				String racxa = a.substring(i, j) + a.substring(j);
				if(racxa.equals(b)) {
					return true;
				}
			}
		}
		return false;
	}
}
