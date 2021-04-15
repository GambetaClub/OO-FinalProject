package jalif.jalif.indwes.myemail.edu;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;


import javax.swing.JPanel;
import jalif.mariano.shapes.*;

@SuppressWarnings("serial")
public class CoolCanvas extends JPanel {
	
	
	private ArrayList<Shape> shapes;
	private static int selection;
	
	public CoolCanvas() {
		
		shapes = new ArrayList<Shape>();
		
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseDragged(MouseEvent e) {
				
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Mouse clicked at: " + e.getX() + ", " + e.getY());
				
				Rectangle r = new Rectangle(e.getX(), e.getY(), 100, 100);
				Triangle t = new Triangle(e.getX(), e.getY(), 100, 100);
				Circle c = new Circle(e.getX(), e.getY(), 100, 100);
				Line l = new Line(e.getX(), e.getY(), 100, 100);
				
				shapes.add(r);
				shapes.add(t);
				shapes.add(c);
				shapes.add(l);
				
//				r.draw(getGraphics());
//				t.draw(getGraphics());
//				c.draw(getGraphics());
//				l.draw(getGraphics());
				
				if(selection == 1) {
					r.draw(getGraphics());
				}else if(selection == 2) {
					c.draw(getGraphics());
				}else if(selection == 3) {
					t.draw(getGraphics());
				}else {
					l.draw(getGraphics());
				}
			};
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(!shapes.isEmpty()) {
				}
			}
			
		});
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		System.out.println("I'm repainting");
		for (Shape shape : shapes) {
			shape.draw(g);
		}
	}

	public int getSelection() {
		return selection;
	}

	public static void setSelection(int nselection) {
		selection = nselection;
	}

}
