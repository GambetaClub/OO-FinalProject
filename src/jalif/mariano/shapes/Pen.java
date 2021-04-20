package jalif.mariano.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Pen extends Shape{

	public Pen(int x, int y, int height, int width, Color color) {
		super(x, y, height, width, color, false);
	}

	@Override
	public void dragger(int eX, int eY) {
	}

	@Override
	public void resize(int width, int height, int x, int y) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		g.fillOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}
	
}
