package jalif.mariano.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Pen extends Shape{
	private ArrayList<Integer> xPoints;
	private ArrayList<Integer> yPoints;
	private static int defSize = 0;
	
	public Pen(int x, int y, float thickness, Color color) {
		super(x, y, defSize, defSize, thickness, color, false);
		this.xPoints = new ArrayList<Integer>();
		this.yPoints = new ArrayList<Integer>();
		this.dragger(x, y);
	}

	@Override
	public void dragger(int eX, int eY) {
		xPoints.add(eX);
		yPoints.add(eY);
	}

	@Override
	public void resize(int width, int height, int x, int y) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		int newXPoints[] = new int[xPoints.size()];
		int newYPoints[] = new int[yPoints.size()];
		for (int i = 0; i < xPoints.size(); i++) {
			newXPoints[i] = xPoints.get(i);
			newYPoints[i] = yPoints.get(i);
		}
		
		try {
			g.drawPolyline(newXPoints, newYPoints, xPoints.size());   
	    } catch (NullPointerException e) {
	        System.out.println("xPoints doesn't have any point :(");
	    }
	}
	
}
