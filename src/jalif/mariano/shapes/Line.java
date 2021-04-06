package jalif.mariano.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape{

	public Line(int x, int y, int width, int height) {
		super(x,y,width,height);
		this.setColor(Color.magenta);
	}
	
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		g.drawLine(super.getX(), super.getY(), super.getX() - super.getWidth(), super.getY());
	}

	@Override
	public void resize(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
