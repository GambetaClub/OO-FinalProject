package jalif.mariano.shapes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	private Color color;
	
	private int firstX;
	private int firstY;


	private int x;
	private int y;
	
	private int height;
	private int width;
	
	public Shape(int x, int y, int height, int width) {
		this.firstX = x;
		this.firstY = y;
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	
	public abstract void resize(int width, int height, int x, int y);
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getFirstX() {
		return firstX;
	}

	public int getFirstY() {
		return firstY;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public abstract void draw(Graphics g);

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
