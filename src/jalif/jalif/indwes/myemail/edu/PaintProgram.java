package jalif.jalif.indwes.myemail.edu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintProgram {
	
	private static int defaultGridRows = 9;
	private static int defaultGridColumns = 1;
	private static int defaultGridPadding = 5;
	/**
	 * The start function declares and initializes all the JFrames and JPanels needed that every functionality of our program is built upon.
	 */
	public void start() {
		
		/*
		 * This is the main JFrame that everything will be placed on. 
		 * The size is set to a maximum value, and made unresizable to make repainting easier to achieve.
		 */
		JFrame frame = new JFrame("Paint");
		frame.setSize(Canvas.getMaxWindowSize(), Canvas.getMaxWindowSize());
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * The mainPanel is the panel on which all the other panels will be organized.
		 * It uses a BorderLayout to divide the panel into 5 possible areas: North, South, West, East, and Center.
		 */
		JPanel mainPanel = new JPanel(new BorderLayout());
		frame.add(mainPanel);
		
		/*
		 * The canvas is added to the center of the mainPanel.
		 */
		Canvas canvas = new Canvas();
		mainPanel.add(canvas, BorderLayout.CENTER);
		
		/*
		 * The topToolPanel is a JPanel that will also use a BorderLayout to organize items placed upon it.
		 * It is placed in the North portion of the mainPanel.
		 */
		JPanel topToolPanel = new JPanel(new BorderLayout());
		mainPanel.add(topToolPanel, BorderLayout.NORTH);
		
		/*
		 * The shapeToolsPanel is JPanel on which all the buttons for different shapes will be placed. 
		 * It is placed in the West portion of the topToolPanel.
		 */
		JPanel shapeToolsPanel = new JPanel();
		topToolPanel.add(shapeToolsPanel, BorderLayout.WEST);
		
		/*
		 * The usefulToolPanel will hold buttons for options like "Fill" or "No Fill", as well as our "Undo" button.
		 */
		JPanel usefulToolPanel = new JPanel();
		topToolPanel.add(usefulToolPanel, BorderLayout.EAST);
		
		/*
		 * Each of the next five buttons added represent an option to choose a certain shape to draw.
		 * They all get added to the shapeToolsPanel from left to right.
		 */
		JButton rectButton = new JButton("Rectangle");
		shapeToolsPanel.add(rectButton);
		rectButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Canvas.setShapeSelection("rectangle");
			}
		});
		
		JButton circButton = new JButton ("Circle");
		shapeToolsPanel.add(circButton);
		circButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Canvas.setShapeSelection("circle");
			}
		});
		
		JButton triButton = new JButton ("Triangle");
		shapeToolsPanel.add(triButton);
		triButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Canvas.setShapeSelection("triangle");
			}
		});
		
		JButton lineButton = new JButton ("Line");
		shapeToolsPanel.add(lineButton);
		lineButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Canvas.setShapeSelection("line");
			}
		});
		
		JButton penButton = new JButton ("Pen");
		shapeToolsPanel.add(penButton);
		penButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Canvas.setShapeSelection("pen");
			}
		});
		
		
		/*
		 * The following three buttons are useful tools for the program to use: the option to choose whether or not to fill shapes, and the undo option.
		 * Each of these will be added to the usefulToolPanel, once again from right to left.
		 */
		JButton fillButton = new JButton("Fill");
		usefulToolPanel.add(fillButton);
		fillButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Canvas.setIsFilled(true);
			}
		});
		
		JButton outlineButton = new JButton("No Fill");
		usefulToolPanel.add(outlineButton);
		outlineButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Canvas.setIsFilled(false);
			}
		});
		
		JButton undoButton = new JButton ("Undo");
		usefulToolPanel.add(undoButton);
		undoButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					canvas.undo();
				}catch(IndexOutOfBoundsException exception) {
					System.out.println("No item in shape list to undo.");
				}	
			}
		});
		
		/*
		 * The colorPanel is a JPanel which utilizes a GridLayout to organize buttons from the top to the bottom.
		 * It is set up to have more rows than are actually filled to minimize the size of each button on it.
		 */
		JPanel colorPanel = new JPanel(new GridLayout(defaultGridRows, defaultGridColumns, defaultGridPadding, defaultGridPadding));
		mainPanel.add(colorPanel, BorderLayout.WEST);
		
		/*
		 * Each of the following buttons will be added to the colorPanel.
		 * They will stack one on top of the other as the grid is set up to only have one column.
		 * Additionally, the text portion of each button will be set to the color that the button is connected to.
		 */
		JButton blackButton = new JButton ("Black");
		colorPanel.add(blackButton);
		blackButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Canvas.setColorSelection(Color.black);
			}
		});
		
		JButton yellowButton = new JButton ("Yellow");
		yellowButton.setForeground(Color.yellow);
		colorPanel.add(yellowButton);
		yellowButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Canvas.setColorSelection(Color.yellow);
			}
		});

		JButton greenButton = new JButton ("Green");
		greenButton.setForeground(Color.green);
		colorPanel.add(greenButton);
		greenButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Canvas.setColorSelection(Color.green);
			}
		});

		JButton blueButton = new JButton ("Blue");
		blueButton.setForeground(Color.blue);
		colorPanel.add(blueButton);
		blueButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Canvas.setColorSelection(Color.blue);
			}
		});

		JButton magentaButton = new JButton ("Magenta");
		magentaButton.setForeground(Color.magenta);
		colorPanel.add(magentaButton);
		magentaButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Canvas.setColorSelection(Color.magenta);
			}
		});

		JButton redButton = new JButton ("Red");
		redButton.setForeground(Color.red);
		colorPanel.add(redButton);
		redButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Canvas.setColorSelection(Color.red);
			}
		});
		
		JButton pinkButton = new JButton ("Pink");
		pinkButton.setForeground(Color.pink);
		colorPanel.add(pinkButton);
		pinkButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Canvas.setColorSelection(Color.pink);
			}
		});
		
		
		frame.setVisible(true);
	}

}
