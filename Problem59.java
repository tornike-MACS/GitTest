import acm.program.ConsoleProgram;
//59. (2018 წლის გამოცდის ამოცანა)
//გადმოგეცემათ nxm-ზე მატრიცა რომელშიც მხოლოდ 0-ები და 1-ები წერია. მეთოდმა
//უნდა დააბრუნოს ამ მატრიცის ყველაზე დიდი ქვემართკუთხედის
//ზომა(ელემენტების რაოდენობა) რომელიც მხოლოდ 1-ებისგან შედგება.
//მაგალითად:
//01100100
//01111100
//00111100
//00111100
//ამ მატრიცაში ყველაზე დიდი შიდა მართკუთხედი, რომელიც სულ ერთიანებისგან
//შედგება არის 12 ზომის:
//01100100
//01111100
//00111100
//00111100
//შესაბამისად ამ მატრიცაზე მეთოდმა უნდა დააბრუნოს 12. ჩათვალეთ რომ
//გადმოცემულ მატრიცაში ერთი უჯრა მაინც იქნება რომელშიც წერია 1
public class Problem59 extends ConsoleProgram{
	public void run() {
		int[][] matrix = new int[4][5];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				matrix[i][j] = 1;
			}
		}
		
		println(biggestRect(matrix));
		
	}
	
	private int biggestRect(int[][] matrix) {
		int maxArea = 0;
		int n = matrix.length;
		int m = matrix[0].length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(matrix[i][j] == 1) {
					int width = countWidth(matrix, i, j);
					int height = countHeight(matrix, i , j);
					int area = width * height;
					if(area > maxArea) {
						maxArea = area;
					}
				}
			}
		}
		return maxArea;
	}
	
	private int countHeight(int[][] matrix, int x , int y) {
		int count = 0;
		while(true) {
			if(matrix[x][y] == 1) {
				count++;
			}else break;
			if(y == matrix[x].length - 1) {
				break;
			}
			y++;
		}
		return count;
	}
	
	private int countWidth(int[][] matrix, int x, int y) {
		int count = 0;
		while(true) {
			if(matrix[x][y] == 1) {
				count++;
			}else break;
			if(x == matrix.length - 1) {
				break;
			}
			x++;
		}
		return count;
	}
	
	
	
	
	
	
	
}
