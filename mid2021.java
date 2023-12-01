import acm.program.ConsoleProgram;
//თქვენი ამოცანაა დაწეროთ მეთოდი რომელიც ლოგარითმს გამოითვლის. შეგახსენებთ რომ ლოგარითმი n-ის ფუძით m არის რიცხვი რომელ ხარისხშიც
//უნდა ავიყვანოთ n იმისათვის რომ m მივიღოთ. ანუ, თუ n^x =m , მაშინ xის მთელი
//ნაწილია შედეგი. n ^ x > m
//log(5 ,25) =2
//5, 26
public class mid2021 extends ConsoleProgram{
	public void run() {
		int n = readInt();
		int m = readInt();
		println(log(n, m));
	}
	
	private int log(int n, int m) {
		int ans = 0;
		while(m > n) {
			n *= n;
			ans++;
		}
		return ans;
	}
}