package jalif.mariano.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape{

	public Line(int x, int y, int x2, int y2) {
		super(x, y, x2, y2);
		this.setColor(Color.magenta);
	}
	
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		g.drawLine(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}

	@Override
	public void resize(int firstX, int firstY, int changingX, int changingY) {
		super.setWidth(changingX);
		super.setHeight(changingY);
	}

	@Override
	public void dragger(int eX, int eY) {
		// TODO Auto-generated method stub
		
	}

}
