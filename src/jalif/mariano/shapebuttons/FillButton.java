package jalif.mariano.shapebuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jalif.jalif.indwes.myemail.edu.Canvas;

public class FillButton implements ActionListener{

	/**
	 * This method overrides the actionPerformed method and uses it to set the choose whether the next shapes will be drawn filled.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Canvas.setIsFilled(true);
	}

}
