package ejercicio1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class EventoBoton implements ActionListener
{
	private JLabel data;
	private HashSet<JTextField> JTextFields;

	public EventoBoton(JLabel d)
	{
		data=d;
		JTextFields = new HashSet<JTextField>();
	}
	
	public void addJTextField(JTextField textField) {
		JTextFields.add(textField);
	}
	
	public boolean areFieldsCompleted() {
		boolean allCompleted = true;
		
		for(JTextField txtField: JTextFields) {
			if(txtField.getText().equals("")) {
				txtField.setBackground(Color.RED);
				allCompleted = false;
				continue;
			}
			txtField.setBackground(Color.WHITE);
		}
		
		return allCompleted;
	}
	
	public void clearTextFields() {
		for(JTextField txtField: JTextFields) {
			txtField.setText(null);
		}
	}
	
	public String getTextFields() {
		String temp = "";
		for(JTextField txtField: JTextFields) {
			temp += txtField.getText() + " ";
		}
		return temp;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		
		if(areFieldsCompleted())
		{
			data.setText(getTextFields());
			clearTextFields();
		}
		else 
		{
			data.setText("Complete los campos...");
		}
	}
	
}