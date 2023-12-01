import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
//ამოცანა 3. ტეხილი (25 ქულა)
//დაწერეთ პროგრამა რაომელიც მომხმარებელს მისცემს საშუალებას მაუსის
//დახმარებით დახატოს ტეხილი. მოთხოვნები:
//ტეხილის სათავე დაფიქსირებულია და მდებარეობს (0,0) წერტილში.მაუსის
//ყოველ კლიკზე დაფაზე უნდა დაემატოს ახალი GLine რომლის ერთი წვერო არის
//ტეხილის ბოლო წერტილი, ხოლო მეორე წვერო კი, წერტილი სადაც მოხდა მაუსის
//კლიკი. მაგალითად თუ მომხმარებელმა პირველად დააკლიკა (10, 100) წერტილზე,მაშინ თქვენმა პროგრამამ დაფაზე უნდა დაამატოს (0, 0) წერტილიდან (10, 100)
//წერტილამდე მონაკვეთი. ხოლო თუ მეორე დაჭერისას მომხმარებელმა
//დააკლიკა (5, 5) წერტილზე, დაფაზე უნდა დაემატოს (10, 100) წერტილიდან (5, 5)
//წერტილამდე მონაკვეთი. ყოველი მაუსის გაჩოჩებისას(mouseDragged) პროგრამა უნდა ხატავდეს
//მონაკვეთის მოძრაობას, რომლის ერთი ბოლო დაფიქსირებულია ტეხილის ბოლო
//წერტილში, ხოლო მეორე ბოლო დაყვება მაუსის ისარს. ისევე როგორც ეს ხდება

public class mid2021 extends GraphicsProgram{
	private int x1 = 0;
	private int y1 = 0;
	private int x2 = 0;
	private int y2 = 0;
	private boolean nowClicked = false;
	
	GLine line1;
	
	public void run() {
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("asd");
		x1 = x2;
		y1 = y2;
		x2 = e.getX();
		y2 = e.getY();
		line1 = new GLine(x1, y1, x2, y2);
		add(line1);
	}
	
	
	public void mouseDragged(MouseEvent e) {
		if(!nowClicked){
			x1 = x2;
			y1 = y2;
			x2 = e.getX();
			y2 = e.getY();
			line1 = new GLine(x1, y1, x2, y2);
			nowClicked = true;
		}
		line1.setEndPoint(e.getX(), e.getY());
		add(line1);
		x2 = e.getX();
		y2 = e.getY();
	}
	
	public void mouseReleased(MouseEvent e){
		nowClicked = false;
	}
}

//SPOILER ALERT! თქვენი ამოცანაა დაადგინოთ არის თუ არა ლუკა ანაკინის შვილი.
//ამისათვის თქვენ გადმოგეცემათ ლუკას და ანაკინის DNA ნიმუშები (ორი სტრინგი). ეს ნიმუშები ერთმანეთს უნდა შეადაროთ და იპოვოთ მაქსიმალური სიგრძის
//ზუსტი დამთხვევა რომელიც ორივე DNA-ს ნიმუშში გვხვდება. თუკი მაქსიმალური
//სიგრძის დამთხვევის სიგრძე(სიმბოლოების რაოდენობა) მეტია ანაკინის DNA-ს
//სიგრძის ნახევარზე მაშინ ლუკა ანაკინის შვილია წინააღმდეგ შემთხვევაში არ
//არის. დაწერეთ მეთოდი amIYourFatherLuke რომელსაც გადაეცემა ორი სტრინგი და
//აბრუნებს boolean-ს.ანუ თქვენ უნდა იპოვოთ ორ სტრინგში მაქსიმალური სიგრძის
//ქვესტრინგი, რომელსაც ორივე სტრინგი შეიცავს. მაგალითად:
//სტრინგებში "CGAT", "CCTGACT" მაქსიმალური სიგრძის ქვესტინგია "GA" სტრინგებში "GATTA", "ATTGATTT" 
//მაქსიმალური სიგრძის ქვესტინგია "GATT" სტრინგებში "ATAGGCC", "ATCCGCCAG" მაქსიმალური სიგრძის ქვესტინგია "GCC"

//public void run() {
//	String father = readLine();
//	String son = readLine();
//	println(amIYourFatherLuke(father, son));
//}
//
//private boolean amIYourFatherLuke(String father, String son) {
//	for(int i = 0; i < father.length() - 2; i++) {
//		for(int j = 1; j < father.length(); j++) {
//			String subS = father.substring(i, j);
//			if(son.contains(subS) && subS.length() > father.length() / 2) {
//				return true;
//			}
//		}
//	}
//	return false;
//}






//თქვენი ამოცანაა დაწეროთ მეთოდი რომელიც ლოგარითმს გამოითვლის. შეგახსენებთ რომ ლოგარითმი n-ის ფუძით m არის რიცხვი რომელ ხარისხშიც
//უნდა ავიყვანოთ n იმისათვის რომ m მივიღოთ. ანუ, თუ n^x =m , მაშინ xის მთელი
//ნაწილია შედეგი. n ^ x > m
//log(5 ,25) =2
//5, 26
//public void run() {
//int n = readInt();
//int m = readInt();
//println(log(n, m));
//}
//
//private int log(int n, int m) {
//int nextN = n;
//int ans = 0;
//while(m >= nextN) {
//	nextN *= n;
//	ans++;
//}
//return ans;
//}