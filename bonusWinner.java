import java.util.*;

import acm.program.ConsoleProgram;

public class bonusWinner extends ConsoleProgram{
	public void run() {
		
	}
	
	private String bonusWinner(HashMap <String, Integer> results) {
		HashMap<Integer, Integer> frequencies = new HashMap<Integer, Integer>();
		for(int result : results.values()) {
			frequencies.put(result, frequencies.getOrDefault(result,  0) + 1);
		}
		String winner = null;
		for(String student : results.keySet()) {
			int result = results.get(student);
			if(frequencies.get(result) == 1) {
				if(winner == null || results.get(winner) > result)  {
					winner = student;
				}
			}
		}
		return null;
	}
}
//!!!