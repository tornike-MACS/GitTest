import acm.program.ConsoleProgram;

//51. დაწერეთ მეთოდი რომელიც გადაცემული ტექსტიდან შლის დუბლირებულ სიმბოლოებს,
//ანუ თუ ტექსტიში რომელიმე სიმბოლო მეორდება, უნდა დარჩეს მხოლოდ ყველაზე მარცხენა.
public class Problem51 extends ConsoleProgram {
	String letterSaver = "";
	public void run() {
		String text = readLine("Enter text: ");
		String answer = removeDoubleWords(text);
		println(answer);
	}
	
	private String removeDoubleWords(String text) {
		for(int i = 0; i < text.length(); i++) {
			if(letterSaver.contains(text.charAt(i) + "") == false) {
				letterSaver += text.charAt(i);
			}
		}
		return letterSaver;
	}
}