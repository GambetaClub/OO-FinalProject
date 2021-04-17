package jalif.mariano.shapes;

import java.awt.Color;
import java.awt.Graphics;


public class Triangle extends Shape{

	public Triangle(int x, int y, int height, int width, Color color, int fillSelection) {
		super(x,y,height,width,color,fillSelection);
	}
	
	public void draw(Graphics g) {
		int [] xCoords = {super.getX(), super.getX() - super.getWidth(), super.getX() + super.getWidth()};
		int [] yCoords = {super.getY(), super.getY() + super.getWidth(), super.getY() + super.getWidth()};
		g.setColor(super.getColor());
		if(super.getFillSelection() == 1) {
			g.fillPolygon(xCoords, yCoords, 3);
		}else if(super.getFillSelection() == 2) {
			g.drawPolygon(xCoords, yCoords, 3);
		}
		
	}

	public void resize(int width, int height, int x, int y) {
		super.setY(y);
		super.setX(x);
		super.setWidth(width);
		super.setHeight(height);
	}
	
}
