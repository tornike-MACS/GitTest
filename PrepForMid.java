import acm.program.ConsoleProgram;

//ამოცანა 1. ლოგარითმი (15 ქულა)
//თქვენი ამოცანაა დაწეროთ მეთოდი რომელიც ლოგარითმს გამოითვლის. შეგახსენებთ რომ ლოგარითმი n-ის ფუძით m 
//არის რიცხვი რომელხარისხშიცუნდა ავიყვანოთ n იმისათვის რომ m მივიღოთ. ანუ, თუ n^x =m , მაშინ xის მთელინაწილია შედეგი. n ^ x > m
//log(5 ,25) =2
//5, 26
//დაწერეთ მეთოდი log რომელსაც გადაეცემა 2 მთელი რიცხვი და რომელიცაბრუნებს ამ რიცხვებითვის 
//ლოგარითმის მთელ ნაწილს. თქვენ არ გავთ უფლება გამოიყენოთ Math კლასი.
//შესაბამისადვერგამოიყენებთმეთოდებს log, log10, log1p, pow და ა.შ. ჩათვალეთ, რომ m>n>0.
public class PrepForMid extends ConsoleProgram{
	public void run() {
		int n = readInt("n: ");
		int m = readInt("m: " );
		println(findLog(n, m));

	}
	
	private int findLog(int n, int m) {
		int count = 0;
		while(m != 1 || m!= -1) {
			m /= n;
			count++;
		}
		return count;
	}
}
