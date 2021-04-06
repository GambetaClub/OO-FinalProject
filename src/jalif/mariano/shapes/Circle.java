package jalif.mariano.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

	public Circle(int x, int y, int height, int width){
		super(x,y,height,width);
		this.setColor(Color.green);
	}
	
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		g.drawOval(super.getX() - (super.getWidth()/2), super.getY() - (super.getHeight()/2), super.getWidth(), super.getHeight());
	}
	
	@Override
	public void resize(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}
