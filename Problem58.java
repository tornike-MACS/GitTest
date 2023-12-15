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
		int n = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[j][i] = n;
				n++;
			}
		}
		println(magicMatrix(arr));
	}
	
	private boolean magicMatrix(int[][] array) {
		int n = array.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[n * n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				list.add(array[i][j]);
			}
		}
		for(int i = 0; i < n * n; i++) {
			arr[i] = list.get(i);
		}
		Arrays.sort(arr);
		if( arr[0] == 1 && arr[n * n] == n * n) {
			return true;
		}
		return false;
		
	}
}



// deeptostring
//deepequals