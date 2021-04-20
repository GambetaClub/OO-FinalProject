package jalif.mariano.shapebuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jalif.jalif.indwes.myemail.edu.Canvas;


public class LineButton implements ActionListener {

	/**
	 * This method overrides the actionPerformed method and uses it to set the present shape selection to a line.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Canvas.setShapeSelection("line");
	}
}