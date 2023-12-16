import java.util.Arrays;

import acm.program.ConsoleProgram;

//2. დაწერეთ მეთოდი რომელსაც არგუმენტად გადმოეცემა int-ების მატრიცა და ამ
//მატრიცას ატრიალებს სიმეტრიულად y ღერძის მიმართ1, 2 -> 2,1
//3, 4 4,3
public class bonusProb22_2 extends ConsoleProgram{
	public void run() {
		int[][] matrix = new int[2][3];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 1;
		matrix[1][1] = 2;
		matrix[1][2] = 3;
		println(Arrays.deepToString(reverseMatrix(matrix)));
	}
	
	private int[][] reverseMatrix(int[][] matrix) {
		int[][] copy = Arrays.copyOf(matrix, matrix.length);
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				copy[i][j] = matrix[i][matrix[i].length - 1 - j]; 
			}
		}
		return copy;
	}
}
