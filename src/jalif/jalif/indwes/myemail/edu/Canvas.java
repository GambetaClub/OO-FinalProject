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

	private static int maxWindowSize = 600;
	private ArrayList<Shape> shapes;
	private static String selection = "line";
	
	private Shape tempShape = null;
	
	public Canvas() {
		
		shapes = new ArrayList<Shape>();
		
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			// (Overridden method)
			public void mouseDragged(MouseEvent e) {
				if (tempShape instanceof Line){
					tempShape.dragger(e.getX(), e.getY());
				}
				if(tempShape == null) {
					switch(selection) {
					case "rectangle":
						tempShape = new Rectangle(e.getX(), e.getY(), 10, 10);
						break;
					case "circle":
						tempShape = new Circle(e.getX(), e.getY(), 10, 10);
						break;
					case "triangle":
						tempShape = new Triangle(e.getX(), e.getY(), 10, 10);
						break;
					default:
						tempShape = new Line(e.getX(), e.getY(), e.getX(), e.getY());
						break;
					}
				}
				tempShape.dragger(e.getX(), e.getY());
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
				Shape newShape;
				int eX = e.getX();
				int eY = e.getY();
				switch(selection) {
				case "rectangle":
					newShape = new Rectangle(eX, eY, 10, 10);
					shapes.add(newShape);
					break;
				case "circle":
					newShape = new Circle(eX, eY, 10, 10);
					shapes.add(newShape);
					break;
				case "triangle":
					newShape = new Triangle(eX, eY, 10, 10);
					shapes.add(newShape);
					break;
				default:
					System.out.println("Line should be dragged to be drawn");
				}
				
				repaint();
			};
			
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
		g.fillRect(0, 0, maxWindowSize, maxWindowSize);
		g.setColor(Color.black);
		if(tempShape != null) {
			tempShape.draw(g);
		}
		for (Shape shape : shapes) {
			shape.draw(g);
		}
	}

	public static String getSelection() {
		return selection;
	}

	public static void setSelection(String selection) {
		Canvas.selection = selection;
	}
	
	public static int getMaxWindowSize() {
		return maxWindowSize;
	}
	
}
