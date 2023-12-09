import java.util.Arrays;

import acm.program.ConsoleProgram;

//57. დაწერეთ მეთოდი, რომელსაც გადაეცემა ორი სტრინგი და აბრუნებს true-ს თუკი ეს ორის
//სტრინგი ერთმანეთის ანაგრამაა, ხოლო წინააღმდე შემთხვევაში აბრუნებს false-ს. ჩათვალეთ,
//რომ ორივე სტრინგი მხოლოდ ლათინური ალფავიტის პატარა ასოებისგან შედგება.
//იმპლემენტაცია გააკეთეთ მასივების გამოყენებით შემდეგი ალგორითმით: თითოეული
//სიტყვისთვის დათვალეთ თითოეული სიმბოლოს რაოდენობა(‘a’-‘z’) და შეინახეთ მასივში.
//შემდეგ შეადარეთ ერთმანეთს მასივები.
public class Problem57 extends ConsoleProgram{
	public void run() {
		String first = readLine();
		String second = readLine();
		println(areAnagrams(first, second));
	}
	
	private boolean areAnagrams(String first, String second) {
		if(Arrays.equals(getFrequencies(first), getFrequencies(second))) {
			return true;
		}
		return false;
	}
	
	private int[] getFrequencies(String s) {
		int[] arr = new int[26];
		for(int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
		}
		return arr;
	}
}
