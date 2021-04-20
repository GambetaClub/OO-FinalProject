package jalif.mariano.shapes;

import java.awt.Color;
import java.awt.Graphics;


public class Triangle extends Shape{

	/**
	 * This function takes all the items given to it and passes them in to the super constructor, allowing it to create the shape.
	 */
	public Triangle(int x, int y, int height, int width, Color color, boolean isFilled) {
		super(x, y, height, width, color, isFilled);
	}
	
	/**
	 * Each shape is in charge of drawing itself. It looks to isFilled to decide which function it will use to draw the triangle.
	 */
	public void draw(Graphics g) {
		int [] xCoords = {super.getX(), super.getX() - super.getWidth(), super.getX() + super.getWidth()};
		int [] yCoords = {super.getY(), super.getY() + super.getWidth(), super.getY() + super.getWidth()};
		g.setColor(super.getColor());
		if(super.getIsFilled()) {
			g.fillPolygon(xCoords, yCoords, 3);
		}else {
			g.drawPolygon(xCoords, yCoords, 3);
		}
		
	}

	public void resize(int width, int height, int x, int y) {
		super.setY(y);
		super.setX(x);
		super.setWidth(width);
		super.setHeight(height);
	}

	@Override
	public void dragger(int eX, int eY) {
		int newWidth =  eX - this.getX();
		int newHeight = eY - this.getY();
		int newX = this.getFirstX();
		int newY = this.getFirstY();
		
		if (newWidth < 0) {
			newWidth = Math.abs(this.getFirstX() - eX);
		}
		if(newHeight < 0) {
			newHeight = Math.abs(this.getFirstY() - eY);
		}
		
		this.resize(newWidth, newHeight, newX, newY);
	}
	
}
