package jalif.jalif.indwes.myemail.edu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import jalif.mariano.shapes.*;

@SuppressWarnings("serial")
public class Canvas extends JPanel {

	private ArrayList<Shape> shapes;
	private static int selection;
	
	private Shape tempShape = null;
	
	public Canvas() {
		
		shapes = new ArrayList<Shape>();
		
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseDragged(MouseEvent e) {
				if(tempShape == null) {
					if(selection == 1) {
						tempShape = new Rectangle(e.getX(), e.getY(), 10, 10);
					}else if(selection == 2) {
						tempShape = new Circle(e.getX(), e.getY(), 10, 10);
					}else if(selection == 3) {
						tempShape = new Triangle(e.getX(), e.getY(), 10, 10);
					}else {
						tempShape = new Line(e.getX(), e.getY(), 10, 10);
					}
				}
				int eX = e.getX();
				int eY = e.getY();
				int newWidth =  eX - tempShape.getX();
				int newHeight = eY - tempShape.getY();
				int newX = tempShape.getFirstX();
				int newY = tempShape.getFirstY();
				
				if (newWidth < 0) {
					newWidth = Math.abs(tempShape.getFirstX() - eX);
					newX = eX;
				}
				if(newHeight < 0) {
					newHeight = Math.abs(tempShape.getFirstY() - eY);
					newY = eY;
				}
				
				tempShape.resize(newWidth, newHeight, newX, newY);
				shapes.add(tempShape);
				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		addMouseListener(new MouseAdapter() {
			
			
			public void mouseClicked(MouseEvent e) {
				System.out.println("Mouse clicked at: " + e.getX() + ", " + e.getY());					
				Shape newShape;
				if(selection == 1) {
					newShape = new Rectangle(e.getX(), e.getY(), 10, 10);
				}else if(selection == 2) {
					newShape = new Circle(e.getX(), e.getY(), 10, 10);
				}else if(selection == 3) {
					newShape = new Triangle(e.getX(), e.getY(), 10, 10);
				}else {
					newShape = new Line(e.getX(), e.getY(), 10, 10);
				}

				shapes.add(newShape);
				repaint();
			};
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(!shapes.isEmpty()) {
				}
			}
			
			public void mouseReleased(MouseEvent e) {
				System.out.println("Mouse released");
				if(tempShape != null) {
					shapes.add(tempShape);
				}
				tempShape = null;
			}
			
		});
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		System.out.println("I'm repainting");
		g.setColor(Color.white);
		g.fillRect(0, 0, 2000, 2000);
		g.setColor(Color.black);
		if(tempShape != null) {
			tempShape.draw(g);
		}
		for (Shape shape : shapes) {
			shape.draw(g);
		}
	}

	public static int getSelection() {
		return selection;
	}

	public static void setSelection(int selection) {
		Canvas.selection = selection;
	}
}
