package jalif.mariano.shapes;

import java.awt.Color;
import java.awt.Graphics;


public class Rectangle extends Shape{
	
	/**
	 * This function takes all the items given to it and passes them in to the super constructor, allowing it to create the shape.
	 */
	public Rectangle(int x, int y, int height, int width, float thickness, Color color, boolean isFilled){
		super(x, y, height, width, thickness, color, isFilled);
	}
	
	/**
	 * Each shape is in charge of drawing itself. It looks to isFilled to decide which function it will use to draw the rectangle.
	 */
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		if(super.getIsFilled()) {
			g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
		}else {
			g.drawRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
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
		int newWidth =  eX - this.getFirstX();
		int newHeight = eY - this.getFirstY();
		int newX = this.getFirstX();
		int newY = this.getFirstY();
		
		if (newWidth < 0) {
			newWidth = Math.abs(this.getFirstX() - eX);
			newX = eX;
		}
		if(newHeight < 0) {
			newHeight = Math.abs(this.getFirstY() - eY);
			newY = eY;
		}
		
		this.resize(newWidth, newHeight, newX, newY);
	}
}
