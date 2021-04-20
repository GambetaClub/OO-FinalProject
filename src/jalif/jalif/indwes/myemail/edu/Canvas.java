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

	private static int maxWindowSize = 900;
	private ArrayList<Shape> shapes;
	private static String shapeSelection = "pen";
	private static int defShapeSize = 20;
	private static float shapeThickness = 5.0f;
	private static Color colorSelection = Color.black;
	private static boolean isFilled = true;
	
	private Shape tempShape = null;
	
	public Canvas() {
		
		setShapes(new ArrayList<Shape>());
		
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			  /** (Overridden method)
			  * Checks if there is already a tempShape, if not
			  * it creates a new one and saves it for if the user
			  * keeps dragging.
			  */
			public void mouseDragged(MouseEvent e) {
				if(tempShape == null) {
					switch(shapeSelection) {
						case "rectangle":
							tempShape = new Rectangle(e.getX(), e.getY(), defShapeSize, defShapeSize, shapeThickness , colorSelection, isFilled);
							break;
						case "circle":
							tempShape = new Circle(e.getX(), e.getY(), defShapeSize, defShapeSize, shapeThickness , colorSelection, isFilled);
							break;
						case "triangle":
							tempShape = new Triangle(e.getX(), e.getY(), defShapeSize, defShapeSize, shapeThickness , colorSelection, isFilled);
							break;
						case "pen":
							tempShape = new Pen(e.getX(), e.getY(), shapeThickness , colorSelection);
							break;
						default:
							tempShape = new Line(e.getX(), e.getY(), e.getX(), e.getY(), shapeThickness , colorSelection);
							break;
					}
				}
				/* Calls the function of tempShape (polymorphism)
				 * which takes care of resizing itself.
				 * 
				 */
				tempShape.dragger(e.getX(), e.getY());
				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent e) {
			}
			
		});
		
		addMouseListener(new MouseAdapter() {

			/**
			 * Creates new shape and immediately adds it to 
			 * the array list.
			 */
			public void mouseClicked(MouseEvent e) {
				Shape newShape;
				int eX = e.getX();
				int eY = e.getY();
				switch(shapeSelection) {
					case "rectangle":
						newShape = new Rectangle(eX, eY, defShapeSize, defShapeSize, shapeThickness , colorSelection, isFilled);
						shapes.add(newShape);
						break;
					case "circle":
						newShape = new Circle(eX, eY, defShapeSize, defShapeSize, shapeThickness , colorSelection, isFilled);
						shapes.add(newShape);
						break;
					case "triangle":
						newShape = new Triangle(eX, eY, defShapeSize, defShapeSize, shapeThickness , colorSelection, isFilled);
						shapes.add(newShape);
						break;
					case "pen":
						newShape = new Pen(eX, eY, shapeThickness , colorSelection);
						newShape.dragger(eX, eY);
						shapes.add(newShape);

				default:
					System.out.println("Line should be dragged to be drawn");
				}
				repaint();
			};
			
			public void mouseReleased(MouseEvent e) {
				if(tempShape != null) {
					shapes.add(tempShape);
				}
				tempShape = null;
			}
			
		});
	}
	
	
	@Override
	/**
	 * (Overriden method)
	 * Function which takes care of drawing the 
	 * different shapes.
	 */
	protected void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, maxWindowSize, maxWindowSize);
		g.setColor(Color.black);
		Graphics2D g2 = (Graphics2D) g;	// Necessary for the shapes' thickness

		/**
		 * Draws every single shape with its correspondent thickness. 
		 */
		for (Shape shape : shapes) { 
			g2.setStroke(new BasicStroke(shape.getThickness()));
			shape.draw(g2);
		}
		if(tempShape != null) {
			g2.setStroke(new BasicStroke(tempShape.getThickness()));
			tempShape.draw(g2);
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
	
	public static void setColorSelection(Color colorSelection) {
		Canvas.colorSelection = colorSelection;
		
	}
	
	public static Color getColorSelection() {
		return colorSelection;
	}
	
	public int numberOfShapes() {
		return shapes.size();
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
	
	public void addShape(Shape shape) {
		shapes.add(shape);
	}


	public static float getShapeThickness() {
		return shapeThickness;
	}

	/**
	 * Handles the possible error of having thickness
	 * equal zero. 
	 */
	public static void setShapeThickness(float shapeThickness) {
		if(shapeThickness <= 0) {
			throw new IllegalArgumentException();
		}
		Canvas.shapeThickness = shapeThickness;
	}
	
}