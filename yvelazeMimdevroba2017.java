//import acm.program.ConsoleProgram;
//import acm.util.RandomGenerator;

//ამოცანა 4. ყველაზე მიმდევრობა(25)
//წარმოიდგინეთ შემდეგი მიმდევრობა. მიმდევრობის პირველი წევრი ნატურალური
//რიცხვი n-ია. იმისათვის, რომ შემდეგი წევრი მივიღოთ უნდა ავაგდოთ მონეტა.
//მონეტის აგდების შედეგად თუკი ამოვიდა გერბი მაშინ შემდეგი წევრია n/2(მთელი
//რიცხვების გაყოფა), ხოლო თუკი ამოვიდა საფასური მაშინ შემდეგი წევრია n-1.
//მიმდევრობის ყოველი შემდეგი წევრიც იგივე წესებით მოიცემა - მიმდევრობის წინა
//წევრს ან ორზე ვყოფთ ან ერთს ვაკლებთ. ასე ვაგრძელებთ მანამ სანამ არ მივიღებთ 0-
//ს. თქვენი ამოცანაა დაწეროთ მეთოდი countSequence რომელსაც გადაეცემა
//მიმდევრობის პირველი წევრი n და რომელიც აბრუნებს საშუალოდ რამდენი წევრი
//აქვს მიმდევრობას.
//გაითვალისწინეთ, რომ ამ ამოცანაში საკვანძო სიტყვაა საშუალოდ. შედეგის
//გამოსათვლელად თქვენ უნდა ჩაატაროთ ექსპერიმენტები. ყოველ ექსპერიმენტზე
//უნდა დაიწყოთ n-იდან მოახდინოთ სიმულაცია ჩვენი წესების და მიიღოთ
//მიმდევრობის სიგრძე. საკმარისი რაოდენობის(EXPERIMENT_COUNT) ექსპერიმენტის
//ჩატარების შემდეგ თქვენ შეგიძლიათ გამოთვალოთ საშუალოდ რამდენი წევრი აქვს n-
//ით დაწყებულ მიმდევრობას.


import acm.graphics.*;
import acm.program.ConsoleProgram;
public class yvelazeMimdevroba2017 extends ConsoleProgram{
	public void run(){
		int x = 1;
		int y = 2;
		GObject o = new GRect(x,y);
		String s = "shalaxo";
		println(iseRa(x,y,o,s));
		println(iseRa(x,y,o,s));
	}
	private int iseRa(int x, double y, GObject r, String s){
		x++;
		y += 1;
		r.move(x,y);
		s = s.substring(s.indexOf('a'));
//		return (int)(x + y + r.getX() + s.length());
		return (int)(s.length());
	}
}



//public class yvelazeMimdevroba2017 extends ConsoleProgram{
//	
//	RandomGenerator rg = RandomGenerator.getInstance();
//	
//	private static final int EXPERIMENT_COUNT = 10000;
//	
//	public void run() {
//		double sum = 0;
//		int n = readInt();
//		for(int i = 0; i < EXPERIMENT_COUNT; i ++) {
//			sum += countSequence(n);
//		}
//		println(sum / EXPERIMENT_COUNT);
//	}
//	
//	private int countSequence(int n) {
//		int count = 0;
//		while(n > 0) {
//			if(rg.nextBoolean(0.5)) {
//				n /= 2;
//			}else {
//				n -= 1;
//			}
//			count++;
//		}
//		return count;
//	}
//}
