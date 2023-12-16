import java.util.*;

import acm.program.ConsoleProgram;

//1. დაწერეთ მეთოდი რომელსაც არგუმენტად გადმოეცემა int-ების მატრიცა და ამ
//მატრიცას სორტავს.
public class bonusProb22 extends ConsoleProgram{
	public void run() {
		int[][] matrix = new int[3][4];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				matrix[i][j] = readInt();
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0;  i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				list.add(matrix[i][j]);
			}
		}
		int[] arr = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		Arrays.sort(arr);
		int n = 0;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = arr[n];
				n++;
			}
		}
				println(Arrays.deepToString(matrix));
	}
}
