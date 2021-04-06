package jalif.jalif.indwes.myemail.edu;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Painting is cool");
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CoolCanvas canvas = new CoolCanvas();
		frame.add(canvas);
		
		
		frame.setVisible(true);
		
	}
}
