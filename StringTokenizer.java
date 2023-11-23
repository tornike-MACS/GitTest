import acm.program.*;
import java.util.*;
import java.lang.Object;

public class StringTokenizer extends ConsoleProgram{

	public void run() {
		  StringTokenizer st = new StringTokenizer("this is a test");
		     while (st.hasMoreTokens()) {
		         System.out.println(st.nextToken());
		     }
	}
	
}
