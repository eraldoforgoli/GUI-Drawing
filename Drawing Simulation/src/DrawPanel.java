
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

	// draws an X from the corners of the panel
	public void paintComponent(Graphics g) {

		// call paintComponent to ensure the panel displays correctly
		super.paintComponent(g);
		int width = getWidth(); // total width
		int height = getHeight(); // total hight

		// draw a line from the upper - ledt to the lower - right
		int i = 0;
		while (i <= width) {
			g.drawLine(0, 0, (0 + i), (height - i));
			g.drawLine(0, height, (0 + i), (i - 2));
			g.drawLine(width, 0, (i - 2), (0 + i));
			g.drawLine(width, height, (0 + i), (height - i));

			i += 2;
		}
	}
}
