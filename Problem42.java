//42. Paint-ის მონაკვეთის ხატვის გაკეთება, ჯერ აჭერ მაუსს, ფიქსირდება ერთი წვერო, მერე
//მაუსის მოძრაობისას მონაკვეთიც მოძრაობს რადგან მეორე წვერო არაა დაფიქსირებული და
//კლიკით ფიქსირდება მეორე წვეროც
import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem42 extends GraphicsProgram {
	
	GLine line;
	int x1;
	int x2;
	int y1;
	int y2;
	
	public void run() {
		addMouseListeners();
		line = new GLine(x1, y1, x2, y2);
//		add(line);
	}
	public void mouseMoved(MouseEvent e) {

	}
	public void mouseClicked(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
		x2 = e.getX() + 20;
		y2 = e.getY() + 20;
		add(line);
		
	}
}
