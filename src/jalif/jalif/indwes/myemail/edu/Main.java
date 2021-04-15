package jalif.jalif.indwes.myemail.edu;

import javax.swing.JButton;
import javax.swing.JFrame;

import jalif.mariano.buttons.BlackButton;
import jalif.mariano.buttons.BlueButton;
import jalif.mariano.buttons.CircleButton;
import jalif.mariano.buttons.LineButton;
import jalif.mariano.buttons.RectangleButton;
import jalif.mariano.buttons.RedButton;
import jalif.mariano.buttons.TriangleButton;

public class Main {
	
	private static final int windowSize = 400;

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Paint");
		frame.setSize(windowSize, windowSize);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Canvas canvas = new Canvas();
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
		
		JButton bluButton = new JButton ("Blue");
		bluButton.setBounds(10, 60, 465, bluButton.getMinimumSize().height);
		canvas.add(bluButton);
		bluButton.addActionListener(new BlueButton());
		
		JButton redButton = new JButton ("Red");
		redButton.setBounds(10, 60, 465, redButton.getMinimumSize().height);
		canvas.add(redButton);
		redButton.addActionListener(new RedButton());
		
		JButton blackButton = new JButton ("Black");
		blackButton.setBounds(10, 60, 465, blackButton.getMinimumSize().height);
		canvas.add(blackButton);
		blackButton.addActionListener(new BlackButton());
		
		
		frame.setVisible(true);
		
	}
	
}
