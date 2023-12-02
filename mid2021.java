import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
/*-
 * თქვენი ამოცანაა დაადგინოთ გადმოცემული სტრინგები ერთმანეთის ანაგრამები არიან თუ არა
 * 
 * ერთი ტექსტი მეორის ანაგრამაა, თუკი ორივე ტექსტის ჩასაწერად ერთი და იგივე ასოიების კრებულიგამოიყენება
 * და ერთი სიტყვიდან მეორის მიღება უბრალო ასოების გადაადგილებითაა შესაძლებელი
 */
public class mid2021 extends ConsoleProgram{
	public void run() {
		String a = readLine();
		String b = readLine();
		println(isAnagram(a, b));
		
	}
	
	private boolean isAnagram(String a, String b) {
		for(int i = 0; i < a.length(); i++) {
			if(b.contains(a.charAt(i) + "")) {
				b = cut(b, a.charAt(i));
				a = cut(a, a.charAt(i));
			}else {
				return false;
			}
		}
		if(b.isEmpty() && a.isEmpty()) {
			return true;
		}
		return false;
	}
	
	private String cut(String s, char c) {
		String substring1 = s.substring(0, s.indexOf(c));
		String substring2 = s.substring(s.indexOf(c) + 1);
		return substring1 + substring2;
	}
	
	
}
/*-
 * დაწერეთ გრაფიკული პროგრამა, რომელსაც აქვს ორი რეჟიმი: ამატებს ან კვადრატს, ან წრეს.
 * 
 * 1. მაუსის კლიკზე ან კვადრატი ემატება ფანჯარაზე, ან წრე (იმ წერტილზე სადაც კლიკი მოხდა)
 * 2. რეჟიმის ცვლილება ხდება მაუსის დრაგის მეშვეობით. თუ მომხმარებელმა გააკეთა დრაგი:
 *    - მარჯვნიდან->მარცხნივ: შემდეგ კლიკზე ემატება ოვალი  
 *    - მარცხნიდან->მარჯვნივ: შემდეგ კლიკზე ემატება კვადრატი
 * 3. თავიდან სანამ დრეგი არ მოხდება (default-ად) ემატება ოვალი
 */

//private static final double GOB_D = 50;
//private boolean isOval;
//private int xs;
//
//@Override
//public void init() {
//	isOval = true;
//	addMouseListeners();
//}
//
//@Override
//public void mousePressed(MouseEvent e) {
//	xs = e.getX();
//}
//
//@Override
//public void mouseDragged(MouseEvent e) {
//	isOval = (xs - e.getX() > 0);
//}
//
//@Override
//public void mouseClicked(MouseEvent e) {
//	GObject obj;
//	if (isOval) {
//		obj = new GOval(GOB_D, GOB_D);
//	} else {
//		obj = new GRect(GOB_D, GOB_D);
//	}
//	double x = e.getX() - GOB_D / 2;
//	double y = e.getY() - GOB_D / 2;
//	add(obj, x, y);
//}






//თქვენი ამოცანაა დაწეროთ მეთოდი რომელიც ლოგარითმს გამოითვლის. შეგახსენებთ რომ ლოგარითმი n-ის ფუძით m არის რიცხვი რომელ ხარისხშიც
//უნდა ავიყვანოთ n იმისათვის რომ m მივიღოთ. ანუ, თუ n^x =m , მაშინ xის მთელი
//ნაწილია შედეგი. n ^ x > m
//log(5 ,25) =2
//5, 26
//public void run() {
//	int n = readInt();
//	int m = readInt();
//	println(log(n, m));
//}
//	
//private int log(int n, int m) {
//	int count = 0;
//	int prev = n;
//	while(prev <= m) {
//		prev = prev * n;
//		count++;
//	}
//	return count;
//}
////SPOILER ALERT! თქვენი ამოცანაა დაადგინოთ არის თუ არა ლუკა ანაკინის შვილი.
////ამისათვის თქვენ გადმოგეცემათ ლუკას და ანაკინის DNA ნიმუშები (ორი სტრინგი). ეს ნიმუშები ერთმანეთს უნდა შეადაროთ და იპოვოთ მაქსიმალური სიგრძის
////ზუსტი დამთხვევა რომელიც ორივე DNA-ს ნიმუშში გვხვდება. თუკი მაქსიმალური
////სიგრძის დამთხვევის სიგრძე(სიმბოლოების რაოდენობა) მეტია ანაკინის DNA-ს
////სიგრძის ნახევარზე მაშინ ლუკა ანაკინის შვილია წინააღმდეგ შემთხვევაში არ
////არის. დაწერეთ მეთოდი amIYourFatherLuke რომელსაც გადაეცემა ორი სტრინგი და
////აბრუნებს boolean-ს.ანუ თქვენ უნდა იპოვოთ ორ სტრინგში მაქსიმალური სიგრძის
////ქვესტრინგი, რომელსაც ორივე სტრინგი შეიცავს. მაგალითად:
////სტრინგებში "CGAT", "CCTGACT" მაქსიმალური სიგრძის ქვესტინგია "GA" სტრინგებში "GATTA", "ATTGATTT" 
////მაქსიმალური სიგრძის ქვესტინგია "GATT" სტრინგებში "ATAGGCC", "ATCCGCCAG" მაქსიმალური სიგრძის ქვესტინგია "GCC"
//public class mid2021 extends ConsoleProgram{
//	public void run() {
//		String father = readLine();
//		String son = readLine();
//		println(amIYourFatherLuke(father, son));
//	}
//	
//	private boolean amIYourFatherLuke(String father, String son) {
//		for(int i = 0; i < son.length(); i++) {
//			for(int j = i; j < son.length(); j++) {
//				String substring = son.substring(i, j);
//				if(father.contains(substring + "") && substring.length() > father.length() / 2) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
//}





////ამოცანა 3. ტეხილი (25 ქულა)
////დაწერეთ პროგრამა რაომელიც მომხმარებელს მისცემს საშუალებას მაუსის
////დახმარებით დახატოს ტეხილი. მოთხოვნები:
////ტეხილის სათავე დაფიქსირებულია და მდებარეობს (0,0) წერტილში.მაუსის
////ყოველ კლიკზე დაფაზე უნდა დაემატოს ახალი GLine რომლის ერთი წვერო არის
////ტეხილის ბოლო წერტილი, ხოლო მეორე წვერო კი, წერტილი სადაც მოხდა მაუსის
////კლიკი. მაგალითად თუ მომხმარებელმა პირველად დააკლიკა (10, 100) წერტილზე,მაშინ თქვენმა პროგრამამ დაფაზე უნდა დაამატოს (0, 0) წერტილიდან (10, 100)
////წერტილამდე მონაკვეთი. ხოლო თუ მეორე დაჭერისას მომხმარებელმა
////დააკლიკა (5, 5) წერტილზე, დაფაზე უნდა დაემატოს (10, 100) წერტილიდან (5, 5)
////წერტილამდე მონაკვეთი. ყოველი მაუსის გაჩოჩებისას(mouseDragged) პროგრამა უნდა ხატავდეს
////მონაკვეთის მოძრაობას, რომლის ერთი ბოლო დაფიქსირებულია ტეხილის ბოლო
////წერტილში, ხოლო მეორე ბოლო დაყვება მაუსის ისარს. ისევე როგორც ეს ხდება
//
//public class mid2021 extends GraphicsProgram{
//	
//	private int x1 = 0;
//	private int y1 = 0;
//	private int x2 = 0;
//	private int y2 = 0;
//	
//	private GLine line;
//	
//	private boolean axali = true;
//	
//	public void run() {
//		addMouseListeners();
//	}
//	public void mouseClicked(MouseEvent e) {
//		x2 = e.getX();
//		y2 = e.getY();
//		line = new GLine(x1, y1, x2, y2);
//		add(line);
//		x1 = x2;
//		y1 = y2;
//	}
//	
//	public void mouseDragged(MouseEvent e) {
//		if(axali) {
//			line = new GLine(x1, y1, e.getX(), e.getY());
//			axali = !axali;
//		}
//		line.setEndPoint(e.getX(), e.getY());
//		add(line);
//		x1 = e.getX();
//		y1 = e.getY();
//	}
//	
//	public void mouseReleased(MouseEvent e) {
//		axali = true;
//	}
//	
//}