package jalif.mariano.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape{

	public Line(int x, int y, int x2, int y2, Color color, boolean isFilled) {
		super(x, y, x2, y2, color,isFilled);
	}
	
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		g.drawLine(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}
	
	@Override
	public void resize(int width, int height, int x, int y) {
		// No need to implement this function, since the 
		// real function doesn't need as many arguments.
		// overloaded method.
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
