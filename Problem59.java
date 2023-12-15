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
		int count = 0;
		int max = 0;
		int[][] matrix = new int[5][4];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				for(int a = 0; a < matrix.length; a++) {
					for(int b = 0; b < matrix.length; b++) {
						if(isFull(matrix, i, j, a, b)) {
							count = countArea(matrix, i, j, a, b);
						}
					}
				}
			}
		}
	}
	
	private boolean isFull(int[][] matrix, int x1, int y1, int x2, int y2) {
		for(int i = 0; i < matrix.length; i++) {
			
		}
	}
	
	private int countArea(int[][] matrix, int x1, int y1, int x2, int y2) {
		
	}
	
	
	
	
	
	
	
	
}
