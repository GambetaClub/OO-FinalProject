package jalif.mariano.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import jalif.jalif.indwes.myemail.edu.Canvas;

public class CircleButton implements ActionListener{

	private JTextField textField;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(textField, "You have selected a circle.");
		Canvas.setSelection("circle");
	}

}