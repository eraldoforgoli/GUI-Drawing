// Creating JFrame to display DrawPanel
import javax.swing.JFrame;

public class DrawPanelTest {
		public static void main(String[] args) {
		
		// create a panel that contains our drawing
		DrawPanel panel = new DrawPanel();
		
		// create new frame to hold the panel
		JFrame application = new JFrame();
		// set the frame to exin when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(500, 500);
		application.setVisible(true);
	}

} 
