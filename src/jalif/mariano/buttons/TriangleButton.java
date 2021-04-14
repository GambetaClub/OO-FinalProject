package jalif.mariano.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import jalif.jalif.indwes.myemail.edu.CoolCanvas;


public class TriangleButton implements ActionListener{

	private JTextField textField;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(textField, "You have selected a triangle.");
		CoolCanvas.setSelection(3);
	}
	

}
