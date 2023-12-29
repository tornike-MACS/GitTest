package finals;

import java.io.*;
import java.util.*;

import acm.program.ConsoleProgram;
//ამოცანა 3. ჩემი მტრის მტერი (40 ქულა)
//
//მოცემული გაქვთ ფაილი რომელშიც წერია ინფორმაცია ვინ ვისი მეგობარია. თითოეული ხაზში ჩაწერილია სფეისით გამოყოფილი ორი სახელი,
//რაც ნიშნავს იმას რომ ეს ადამიანები ერთმანეთის მეგობრები არიან.
//ჩათვალეთ რომ თითოეული სახელი უნიკალურია და ორი ადამიანი ერთი და იგივე სახელით არ შეგხვდებათ.
//
//თუ ორი ადამიანი არ მეგობრობს, მაშინ ისინი ერთმანეთის მტრები არიან. თქვენი ამოცანაა დაადგინოთ მართალია თუ არა გამონათქვამი ჩემი მტრის მტერი ჩემი მეგობარია. 
//
//დაწერეთ enemyOfMyEnemy მეთოდი, რომელსაც გადაეცემა ზემოთ ნახსენები ფაილის სახელი და ფაილში არსებული ერთერთი ადამიანის სახელი. 
//მეთოდმა უნდა დააბრუნოს true თუ გადაცემული ადამიანის მეგობრების სიმრავლე ზუსტად ემთხვევა, მისი მტრების მტრების სიმრავლეს, სხვა შემთხვევაში მეთოდმა უნდა დააბრუნოს false. 

public class enemyOfMyEnemy2014 extends ConsoleProgram{
	public void run() {
		
		println(enemyOfMyEnemy("ShorterLexicon.txt", "Jon"));
	}
	
	private HashMap<String, HashSet<String>> enemyOfMyEnemy(String fileName, String name) {
		HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
		try{ 
			BufferedReader rd = new BufferedReader(new FileReader(fileName));
			System.out.println("sd");
			while(true) {
				String line = rd.readLine();
				System.out.println("sd");
				if(line == null)break;
				System.out.println("sd");
				StringTokenizer tk = new StringTokenizer(line);
				String a = tk.nextToken();
				String b = tk.nextToken();
				map.putIfAbsent(a, new HashSet<String>());
				map.putIfAbsent(b, new HashSet<String>());
				map.get(a).add(b);
				map.get(b).add(a);
			}
			rd.close();
		}catch(FileNotFoundException e) {
			println("File not found");
		}catch(IOException e) {
			println("not found");
		}
		return map;
	}
}
// file not found!!!!!
