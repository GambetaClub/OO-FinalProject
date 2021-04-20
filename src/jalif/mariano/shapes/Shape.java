package jalif.mariano.shapes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	
	/*
	 * Each of the following data members is declared as private as part of the encapsulation.
	 * The data members will only be accessed through public methods.
	 */
	private Color color;

	private int firstX;
	private int firstY;

	private int x;
	private int y;
	
	private int height;
	private int width;
	
	private boolean isFilled;
	/**
	 * The Shape constructor builds each shape that is used for this drawing program.
	 * @param x is the x coordinate of where the mouse was pushed. The shape is drawn starting from here.
	 * @param y is the x coordinate of where the mouse was pushed. The shape is drawn starting from here.
	 * @param height is the height of the eventual shape or second y, it is the distance from the first y to the y coordinate where the mouse released.
	 * @param width is the width of the eventual shape or the second x, it is the distance from the first x to the x coordinate where the mouse was released.
	 * @param color defines the color of each shape created.
	 * @param isFilled defines whether or not the shape will be drawn with an outline or if it will be drawn filled.
	 */
	public Shape(int x, int y, int height, int width, Color color, boolean isFilled) {
		this.firstX = x;
		this.firstY = y;
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.color = color;
		this.isFilled = isFilled;
	}
	
	/**
	 * Each shape is in charge of drawing itself, so each class that inherits from Shape will draw itself.
	 * @param g
	 */
	public abstract void draw(Graphics g);
	
	/**
	 * This function will be implemented by each class that inherits from Shape.
	 * @param eX
	 * @param eY
	 */
	public abstract void dragger(int eX, int eY);
	
	/**
	 * This function will be implemented by each class that inherits from Shape.
	 */
	public abstract void resize(int width, int height, int x, int y);
	
	/*
	 * The following functions are all getters and setters for the private data members.
	 * Getters and setters are required for an object to be encapsulated, as it allows for the object to control who has access to the variables.
	 */
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

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean getIsFilled() {
		return isFilled;
	}

	public void setIsFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	
	
}
