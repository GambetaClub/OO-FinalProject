package jalif.mariano.shapebuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jalif.jalif.indwes.myemail.edu.Canvas;

public class UndoButton implements ActionListener{
	private Canvas c;
	
	public UndoButton(Canvas c) {
		this.c = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			c.undo();
		}catch(IndexOutOfBoundsException exception) {
			System.out.println("No item in shape list to undo.");
		}	
	}
}

