import acm.program.ConsoleProgram;

//მომხმარებელს შეყავს დადებითი რიცხვები, მანამ სანამ არ შეიყვანს -1 ს, დაბეჭდეთ
//რაოდენობა რამდენი ლუწი რიცხვი შეყვანა მომხმარებელმა.
public class problem28 extends ConsoleProgram {
	public void run() {
		int answer = 0;
		while(true) {
			int a = readInt();
			if(a == STOP){
				println(answer);
			}else {
				if(a % 2 == 0) {
					answer++;
				}
			}
		}
	}
	private static final int STOP = -1;
}
