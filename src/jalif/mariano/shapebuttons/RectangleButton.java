package jalif.mariano.shapebuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jalif.jalif.indwes.myemail.edu.Canvas;

public class RectangleButton implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Canvas.setShapeSelection("rectangle");
	}

}