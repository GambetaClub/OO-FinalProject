package jalif.mariano.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape{

	/**
	 * This function takes all the items given to it and passes them in to the super constructor, allowing it to create the shape.
	 */
	public Line(int x, int y, int x2, int y2, Color color, boolean isFilled) {
		super(x, y, x2, y2, color,isFilled);
	}
	
	/**
	 * Each shape is in charge of drawing itself.
	 */
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		g.drawLine(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}
	
	@Override
	public void resize(int width, int height, int x, int y) {
		super.setX(x);
		super.setY(y);
		super.setWidth(width);
		super.setHeight(height);
	}

	// (Overloading method)
	public void resize(int endX, int endY) {
		super.setWidth(endX);
		super.setHeight(endY);
	}

	@Override
	public void dragger(int endX, int endY) {
		this.resize(endX, endY);
	}


}
