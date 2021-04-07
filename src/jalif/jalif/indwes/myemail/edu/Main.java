package jalif.jalif.indwes.myemail.edu;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Paint");
		frame.setSize(550, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Canvas canvas = new Canvas();
		frame.add(canvas);
		
		
		frame.setVisible(true);
		
	}
}
