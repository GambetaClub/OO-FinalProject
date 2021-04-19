package jalif.mariano.colorbuttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jalif.jalif.indwes.myemail.edu.Canvas;

public class RedButton implements ActionListener{

	/**
	 * This method overrides the actionPerformed method and uses it to set the present color selection in the canvas to red.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Canvas.setColorSelection(Color.red);
	}

}
