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
				n += 2;
			}
		}
		println(magicMatrix(arr));
	}
	
	private boolean magicMatrix(int[][] array) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				list.add(array[i][j]);
			}
		}
		int[] arr = new int[list.size()];
		int n = arr.length;
		for(int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		Arrays.sort(arr);
		if(arr[n - 1] == n && arr[0] == 1) {
			return true;
		}else return false;
	}
}



// deeptostring
//deepequals