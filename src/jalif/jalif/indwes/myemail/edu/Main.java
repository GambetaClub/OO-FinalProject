package jalif.jalif.indwes.myemail.edu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import jalif.mariano.colorbuttons.BlackButton;
import jalif.mariano.colorbuttons.BlueButton;
import jalif.mariano.colorbuttons.GreenButton;
import jalif.mariano.colorbuttons.MagentaButton;
import jalif.mariano.colorbuttons.PinkButton;
import jalif.mariano.colorbuttons.RedButton;
import jalif.mariano.colorbuttons.YellowButton;
import jalif.mariano.shapebuttons.CircleButton;
import jalif.mariano.shapebuttons.FillButton;
import jalif.mariano.shapebuttons.LineButton;
import jalif.mariano.shapebuttons.OutlineButton;
import jalif.mariano.shapebuttons.RectangleButton;
import jalif.mariano.shapebuttons.TriangleButton;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Paint");
		frame.setSize(Canvas.getMaxWindowSize(), Canvas.getMaxWindowSize());
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel canvasPanel = new JPanel(new BorderLayout());
		frame.add(canvasPanel);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(100, 100, 500, 300);
		canvasPanel.add(canvas, BorderLayout.CENTER);
		
		JPanel shapePanel = new JPanel();
		shapePanel.setBounds(10, 30, 465, shapePanel.getMinimumSize().height);
		canvasPanel.add(shapePanel, BorderLayout.NORTH);
		
		JButton rectButton = new JButton("Rectangle");
		rectButton.setBounds(10, 60, 465, rectButton.getMinimumSize().height);
		shapePanel.add(rectButton);
		rectButton.addActionListener(new RectangleButton());
		
		JButton circButton = new JButton ("Circle");
		circButton.setBounds(10, 60, 465, circButton.getMinimumSize().height);
		shapePanel.add(circButton);
		circButton.addActionListener(new CircleButton());
			
		JButton triButton = new JButton ("Triangle");
		triButton.setBounds(10, 60, 465, triButton.getMinimumSize().height);
		shapePanel.add(triButton);
		triButton.addActionListener(new TriangleButton());
		
		JButton lineButton = new JButton ("Line");
		lineButton.setBounds(10, 60, 465, lineButton.getMinimumSize().height);
		shapePanel.add(lineButton);
		lineButton.addActionListener(new LineButton());
		
		JButton fillButton = new JButton("Fill");
		fillButton.setBounds(10, 60, 465, fillButton.getMinimumSize().height);
		shapePanel.add(fillButton);
		fillButton.addActionListener(new FillButton());
		
		JButton outlineButton = new JButton("No Fill");
		outlineButton.setBounds(10, 60, 465, outlineButton.getMinimumSize().height);
		shapePanel.add(outlineButton);
		outlineButton.addActionListener(new OutlineButton());
		
		
		JPanel colorPanel = new JPanel(new GridLayout(9, 1, 5, 5));
		colorPanel.setBounds(10, 30, 465, colorPanel.getMinimumSize().height);
		canvasPanel.add(colorPanel, BorderLayout.WEST);
		
		JButton blackButton = new JButton ("Black");
		blackButton.setBounds(10, 60, 465, blackButton.getMinimumSize().height);
		colorPanel.add(blackButton);
		blackButton.addActionListener(new BlackButton());
		
		JButton yellowButton = new JButton ("Yellow");
		yellowButton.setBounds(10, 60, 465, yellowButton.getMinimumSize().height);
		yellowButton.setForeground(Color.yellow);
		colorPanel.add(yellowButton);
		yellowButton.addActionListener(new YellowButton());
		
		JButton greenButton = new JButton ("Green");
		greenButton.setBounds(10, 60, 465, greenButton.getMinimumSize().height);
		greenButton.setForeground(Color.green);
		colorPanel.add(greenButton);
		greenButton.addActionListener(new GreenButton());
		
		JButton blueButton = new JButton ("Blue");
		blueButton.setBounds(10, 60, 465, blueButton.getMinimumSize().height);
		blueButton.setForeground(Color.blue);
		colorPanel.add(blueButton);
		blueButton.addActionListener(new BlueButton());
		
		JButton magentaButton = new JButton ("Magenta");
		magentaButton.setBounds(10, 60, 465, magentaButton.getMinimumSize().height);
		magentaButton.setForeground(Color.magenta);
		colorPanel.add(magentaButton);
		magentaButton.addActionListener(new MagentaButton());
		
		JButton redButton = new JButton ("Red");
		redButton.setBounds(10, 60, 465, redButton.getMinimumSize().height);
		redButton.setForeground(Color.red);
		colorPanel.add(redButton);
		redButton.addActionListener(new RedButton());
		
		JButton pinkButton = new JButton ("Pink");
		pinkButton.setBounds(10, 60, 465, pinkButton.getMinimumSize().height);
		pinkButton.setForeground(Color.pink);
		colorPanel.add(pinkButton);
		pinkButton.addActionListener(new PinkButton());
		
		
		
		frame.setVisible(true);
		
	}
	
}
