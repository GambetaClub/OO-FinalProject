package jalif.mariano.shapebuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jalif.jalif.indwes.myemail.edu.Canvas;

public class UndoButton implements ActionListener{
	private Canvas c;
	
	/**
	 * Since undo is a non static function, and requires a canvas to be initialized to work,
	 *  the constructor initializes the button with the canvas to be used being passed in.
	 * @param c is the canvas passed in.
	 */
	public UndoButton(Canvas c) {
		this.c = c;
	}

	/**
	 * This method overrides the actionPerformed method and uses it to call the undo function for canvases.
	 * Additionally, it handles the exception thrown when one tries to undo when nothing has been drawn.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			c.undo();
		}catch(IndexOutOfBoundsException exception) {
			System.out.println("No item in shape list to undo.");
		}	
	}
}

