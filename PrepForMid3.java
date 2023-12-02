
import acm.program.ConsoleProgram;
//ამოცანა 4. ენპლეტი (25 ქულა)
//ტექსტში ენპლეტი ეწოდება n ცალ ერთმანეთის მიყოლებით მდგარ ერთიდაიგივე
//სიმბოლოებისგან შემდგარ სტრინგს. თქვენი ამოცანაა ტექსტში წაშალოთ ყველა
//შემხვედრი ენპლეტი. ამისათვის უნდა დაწეროთ მეთოდი removeNplet() რომელსაც
//გადაეცემა სტრინგი და მთელი რიცხვი n და რომელიც აბრუნებს სტრინგს. მეთოდმა
//უნდა იმოქმედოს შემდეგნაირად: უნდა წაშალოთ პირველივე(ყველაზე მარცხნივ
//მდგომი) ენპლეტი, ამის შემდეგ თუ მიღებულ სტრინგში ენპლეტი აღარ არის
//დააბრუნოთ ეს სტრინგი თუკი არის მაშინ ისევ წაშალოთ პირველივე ენპლეტი და ა.შ.
//მაგალითად,
//removeNplet(“asdXXXasd”,3) -&gt; “asdasd”
//removeNplet(“asdzzdas”,2) -&gt; “asas”
public class PrepForMid3 extends ConsoleProgram{
	public void run() {
		String s = readLine();
		int n = readInt();
		println(removeNplet(s, n));
	}
	
	private String removeNplet(String s, int n) {
		String ans = s;
		while(hasNplet(ans, n)) {
			ans = cut(ans, n);
		}
		return ans;
	}
	
	private boolean hasNplet(String s, int n) {
		int count = 1;
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) == s.charAt(i+1)){
				count++;
			}
			if(count == n) {
				return true;
			}
		}
		return false;
	}
	
	private String cut(String s, int n) {
		String ans;
		int count = 1;
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) == s.charAt(i + 1)) {
				count++;
			}
			if(count == n) {
				String substring1 = s.substring(0, i + 1 - count + 1);
				String substring2 = s.substring(i + 2);
				ans = substring1 + substring2;
				return ans;
			}
		}
		return s;
	}
}
