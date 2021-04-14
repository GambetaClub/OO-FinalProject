package jalif.jalif.indwes.myemail.edu;

import javax.swing.JButton;
import javax.swing.JFrame;
import jalif.mariano.buttons.CircleButton;
import jalif.mariano.buttons.LineButton;
import jalif.mariano.buttons.RectangleButton;
import jalif.mariano.buttons.TriangleButton;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Painting is cool");
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CoolCanvas canvas = new CoolCanvas();
		frame.add(canvas);
		
		JButton rectButton = new JButton("Rectangle");
		rectButton.setBounds(10, 60, 465, rectButton.getMinimumSize().height);
		canvas.add(rectButton);
		rectButton.addActionListener(new RectangleButton());
		
		
		JButton circButton = new JButton ("Circle");
		circButton.setBounds(10, 60, 465, circButton.getMinimumSize().height);
		canvas.add(circButton);
		circButton.addActionListener(new CircleButton());

			
		JButton triButton = new JButton ("Triangle");
		triButton.setBounds(10, 60, 465, triButton.getMinimumSize().height);
		canvas.add(triButton);
		triButton.addActionListener(new TriangleButton());
		
		JButton lineButton = new JButton ("Line");
		lineButton.setBounds(10, 60, 465, lineButton.getMinimumSize().height);
		canvas.add(lineButton);
		lineButton.addActionListener(new LineButton());
		
		
		
		frame.setVisible(true);
		
	}
	
}
