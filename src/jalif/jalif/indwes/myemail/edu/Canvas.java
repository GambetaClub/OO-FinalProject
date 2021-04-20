package jalif.jalif.indwes.myemail.edu;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
	private static String shapeSelection = "pen";
	private static int defShapeSize = 20;
	private static float shapeWidth = 5.0f;
	private static Color colorSelection = Color.black;
	private static boolean isFilled = true;
	
	private Shape tempShape = null;
	
	public Canvas() {
		
		setShapes(new ArrayList<Shape>());
		
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			// (Overridden method)
			public void mouseDragged(MouseEvent e) {
				if(tempShape == null) {
					switch(shapeSelection) {
						case "rectangle":
							tempShape = new Rectangle(e.getX(), e.getY(), defShapeSize, defShapeSize, colorSelection, isFilled);
							break;
						case "circle":
							tempShape = new Circle(e.getX(), e.getY(), defShapeSize, defShapeSize, colorSelection, isFilled);
							break;
						case "triangle":
							tempShape = new Triangle(e.getX(), e.getY(), defShapeSize, defShapeSize, colorSelection, isFilled);
							break;
						case "pen":
							tempShape = new Pen(e.getX(), e.getY(), colorSelection);
							break;
						default:
							tempShape = new Line(e.getX(), e.getY(), e.getX(), e.getY(), colorSelection);
							break;
					}
				}
				tempShape.dragger(e.getX(), e.getY());
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
				switch(shapeSelection) {
					case "rectangle":
						newShape = new Rectangle(eX, eY, defShapeSize, defShapeSize, colorSelection, isFilled);
						shapes.add(newShape);
						break;
					case "circle":
						newShape = new Circle(eX, eY, defShapeSize, defShapeSize, colorSelection, isFilled);
						shapes.add(newShape);
						break;
					case "triangle":
						newShape = new Triangle(eX, eY, defShapeSize, defShapeSize, colorSelection, isFilled);
						shapes.add(newShape);
						break;
					case "pen":
						newShape = new Pen(eX, eY, colorSelection);
						shapes.add(newShape);
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
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(shapeWidth));		
		
		for (Shape shape : shapes) {
			shape.draw(g);
		}
		if(tempShape != null) {
			tempShape.draw(g);
		}
	}
	

	
	public static int getMaxWindowSize() {
		return maxWindowSize;
	}

	public static String getShapeSelection() {
		return shapeSelection;
	}

	public static void setShapeSelection(String selection) {
		Canvas.shapeSelection = selection;
	}
	
	public static boolean getIsFilled() {
		return isFilled;
	}

	public static void setIsFilled(boolean isFilled) {
		Canvas.isFilled = isFilled;
		
	}
	
	public static Color getColorSelection() {
		return colorSelection;
	}

	public static void setColorSelection(Color colorSelection) {
		Canvas.colorSelection = colorSelection;
		
	}
	
	public int numberOfShapes() {
		return getShapes().size();
	}


	public ArrayList<Shape> getShapes() {
		return shapes;
	}


	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}

	public void undo() {
		if(shapes.size() == 0) {
			throw new IndexOutOfBoundsException();
		}
		shapes.remove(shapes.size()-1);
		repaint();
		
	}
	
}