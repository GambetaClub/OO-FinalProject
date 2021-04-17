package jalif.mariano.shapes;

import java.awt.Color;
import java.awt.Graphics;


public class Rectangle extends Shape{
	
	public Rectangle(int x, int y, int height, int width, Color color, int fillSelection){
		super(x,y,height,width, color, fillSelection);
	}
	
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		if(super.getFillSelection() == 1) {
			g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
		}else if(super.getFillSelection() == 2) {
			g.drawRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
		}
	}
	
	
	public void resize(int width, int height, int x, int y) {
		super.setY(y);
		super.setX(x);
		super.setWidth(width);
		super.setHeight(height);
	}
	
}
