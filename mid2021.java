import acm.program.ConsoleProgram;
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

public class mid2021 extends ConsoleProgram{
	public void run() {
		String father = readLine();
		String son = readLine();
		println(amIYourFatherLuke(father, son));
	}

	private boolean amIYourFatherLuke(String father, String son) {
		for(int i = 0; i < father.length() - 2; i++) {
			for(int j = 1; j < father.length(); j++) {
				String subS = father.substring(i, j);
				if(son.contains(subS) && subS.length() > father.length() / 2) {
					return true;
				}
			}
		}
		return false;
	}
	
}








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