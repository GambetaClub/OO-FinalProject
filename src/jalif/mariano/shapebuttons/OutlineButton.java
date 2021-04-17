package jalif.mariano.shapebuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jalif.jalif.indwes.myemail.edu.Canvas;

public class OutlineButton implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Canvas.setFillSelection(2);
	}

}
