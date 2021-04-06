package jalif.mariano.shapes;

import java.awt.Graphics;


public class Rectangle extends Shape{
	
	public Rectangle(int x, int y, int height, int width) {
		super(x ,y , height, width);
	}
	
	public void resize(int x, int y) {
		int oldX = super.getX();
		int oldY = super.getY();
		
		int newX = oldX - x;
		int newY = oldY - y;
		super.setHeight(super.getHeight() + newY);
		super.setWidth(super.getWidth() + newX);
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
		
	}
	
}
