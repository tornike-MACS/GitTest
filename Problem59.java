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
		int n = 3;
		int m = 4;
		int count = 0;
		int max = 0;
		int[][] matrix = new int[3][4];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				matrix[i][j] = 1;
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				for(int a = 0; a < n; a++) {
					for(int b = 0; b < m; b++) {
						if(isFull(matrix, i, j, a, b)) {
							count = countArea(matrix, i, j, a, b);
						}
						if(count > max) {
							max = count;
						}
					}
				}
			}
		}
		println(max);
	}
	
	private boolean isFull(int[][] matrix, int x1, int y1, int x2, int y2) {
		for(int i = x1; i < x2; i++) {
			for(int j = y1; j < y2; j++) {
				if(matrix[i][j] == 0)return false;
			}
		}
		return true;
	}
	
	private int countArea(int[][] matrix, int x1, int y1, int x2, int y2) {
		return (x2 - x1) * (y2 - y1);
	}
	
	
	
	
	
	
	
	
}
