package jalif.mariano.shapes;

import java.awt.Color;
import java.awt.Graphics;


public class Triangle extends Shape{

	public Triangle(int x, int y, int height, int width) {
		super(x,y,height,width);
		this.setColor(Color.red);
	}
	
	public void draw(Graphics g) {
		int [] xCoords = {super.getX(), super.getX() - 50, super.getX() + 50};
		int [] yCoords = {super.getY(), super.getY() + 100, super.getY() + 100};
		g.setColor(super.getColor());
		g.drawPolygon(xCoords, yCoords, 3);
	}

	@Override
	public void resize(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}
