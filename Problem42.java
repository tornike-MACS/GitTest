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
	}
	public void mouseMoved(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
	}
	public void mouseClicked(MouseEvent e) {
		line = new GLine(e.getX(), e.getY(), x2, y2);
		add(line);
	}
}
