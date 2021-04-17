package jalif.mariano.colorbuttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jalif.jalif.indwes.myemail.edu.Canvas;

public class RedButton implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Canvas.setColor(Color.red);
	}

}
