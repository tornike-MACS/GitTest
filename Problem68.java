import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

//68. თქვენი ამოცანაა გრაფიკული პროგრამის საშუალებით გააკეთოთ ჩატი. ფანჯარაზე, SOUTH
//რეგიონზე უნდა გქონდეთ ერთი ტექსტფილდი და ერთი ღილაკი ტექტით Enter.
//ტექსტფილდში ტექსტის შეყვანის მერე Enter ჭილაკზე დაჭერით ტექსტი უნდა
//იწერებოდეს(იხატებოდეს) კანვასზე ხოლო ტექსტფილდში კი ტექსტი იშლებოდეს. ხელახლა
//ტექსტის შეყვანისას ახალი ტექსტი წინა ტექსტის ქვემოთ უნდა გამოცნდეს(როგორც ჩატში
//ხდება ხოლმე. თუკი ტექსტი ჩაცდება ეკრანს არაუშავს.
public class Problem68 extends GraphicsProgram{
	public void run() {
		JTextField field = new JTextField(10);
		add(field, SOUTH);
		
		JButton button = new JButton("Enter");
		add(button, SOUTH);
	}
}
