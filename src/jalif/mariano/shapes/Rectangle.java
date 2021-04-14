package jalif.mariano.shapes;

import java.awt.Graphics;


public class Rectangle extends Shape{
	
	public Rectangle(int x, int y, int height, int width) {
		super(x ,y , height, width);
	}
	
	public void resize(int width, int height, int x, int y) {
		super.setY(y);
		super.setX(x);
		super.setWidth(width);
		super.setHeight(height);
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
		
	}
	
}
