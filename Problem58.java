import java.util.ArrayList;
import java.util.Arrays;

import acm.program.ConsoleProgram;

//58. (2018 წლის გამოცდის ამოცანა)
//მატრიცას ეწოდება მაგიური თუკი ის კვადრატულია(n x n-ზე) და მასში არის ყველა
//რიცხვი 1-დან n^2-ის ჩათვლით. თქვენი მიზანია დაწეროთ magicMatrix მეთოდი
//რომელიც შეამოწმებს არის თუ არა მატრიცა მაგიური და თუკი მაგიურია მაშინ
//დააბრუნებს true-ს თუ არა მაშინ false-ს
public class Problem58 extends ConsoleProgram{
	public void run() {
		int[][] arr = new int[5][5];
		println(magicMatrix());
	}
	
	private boolean magicMatrix(int[][] array) {
		int n = array.length;
		for(int i = 0; i < n * n; i++) {
			
		}
		
	}



// deeptostring
//deepequals