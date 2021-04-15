package jalif.mariano.shapes;

import java.awt.Color;
import java.awt.Graphics;


public class Rectangle extends Shape{
	
	public Rectangle(int x, int y, int height, int width, Color color) {
		super(x ,y , height, width, color);
	}
	
	public void resize(int width, int height, int x, int y) {
		super.setY(y);
		super.setX(x);
		super.setWidth(width);
		super.setHeight(height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
		
	}
	
}
