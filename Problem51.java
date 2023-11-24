import acm.program.ConsoleProgram;

//51. დაწერეთ მეთოდი რომელიც გადაცემული ტექსტიდან შლის დუბლირებულ სიმბოლოებს,
//ანუ თუ ტექსტიში რომელიმე სიმბოლო მეორდება, უნდა დარჩეს მხოლოდ ყველაზე მარცხენა.
public class Problem51 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		String answer = removeDoubleWords(text);
		println(answer);
	}
	
	private String removeDoubleWords(String text) {
		String answer = " ";
		for(int i = 0; i < text.length(); i++) {
			if(answer.charAt(answer.length() - 1) != text.charAt(i)) {
				answer += text.charAt(i);
			}
		}
		return answer
	}
//}არასწორიააა contains ით