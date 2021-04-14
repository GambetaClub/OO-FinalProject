package jalif.jalif.indwes.myemail.edu;

import javax.swing.JFrame;

public class Main {
	
	private static final int windowSize = 400;

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Paint");
		frame.setSize(windowSize, windowSize);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Canvas canvas = new Canvas();
		frame.add(canvas);
		
		
		frame.setVisible(true);
		
	}
}
