import acm.program.ConsoleProgram;
//დაწერეთ მეთოდი getBiggestDivisor, რომელსაც გადაეცემა ნატურალური რიცხვი n და
//რომელიც აბრუნებს ამ რიცხვის ყველაზე დიდ მარტივ გამყოფს. ჩათვალეთ, რომ n&gt;1
//მაგალითად 24-ის ყველაზე დიდი მარტივი გამყოფია 3, ხოლო 37-ის ყველაზე დიდი
//მარტივი გამყოფია 37
public class yvelazeGamyofi2017 extends ConsoleProgram{
	public void run() {
		int n = readInt();
		println(getBiggestDivisor(n));
	}
	
	private int getBiggestDivisor(int n) {
		int biggest = 0;
		for(int i = 0; i < n; i++) {
			if(n % i == 0 && isPrime(i) && i > biggest) {
				biggest = i;
			}
		}
		return biggest;
	}
	
	private boolean isPrime(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
