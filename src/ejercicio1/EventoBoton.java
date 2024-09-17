package ejercicio1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EventoBoton implements ActionListener
{
	private JTextField name;
	private JTextField lastName;
	private JTextField telephone;
	private JTextField birthdate;
	private Boolean allCompleted;
	private JLabel data;

	/*
	private JLabel lblName;
	private JLabel lblLastName;
	private JLabel lblTelephone;
	private JLabel lblBirthdate;
	private JLabel lblDataUser;
	*/
	
	public EventoBoton(JLabel d)
	{
		//allCompleted=false;
		data=d;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		allCompleted=false;
		
		
		if(name.getText().equals(""))
		{
			name.setBackground(Color.RED);
		}
		else 
		{
			name.setBackground(Color.WHITE);
		}
		
		if(lastName.getText().equals(""))
		{
			lastName.setBackground(Color.RED);
		}
		else 
		{
			lastName.setBackground(Color.WHITE);
		}
		
		if(telephone.getText().equals(""))
		{
			telephone.setBackground(Color.RED);
		}
		else  
		{
			telephone.setBackground(Color.WHITE);
		}
		
		if(birthdate.getText().equals(""))
		{
			birthdate.setBackground(Color.RED);
		}
		else 
		{
			birthdate.setBackground(Color.WHITE);
		}
		
		if(!name.getText().equals("") && !lastName.getText().equals("") && !telephone.getText().equals("") && !birthdate.getText().equals(""))
		{
			allCompleted = true;
		}
	
		if(allCompleted)
		{
			data.setText( name.getText()+ "  -  " + lastName.getText() + "  -  " + telephone.getText()+ "  -  " + birthdate.getText());
			
			name.setText(null);
			lastName.setText(null);
			telephone.setText(null);
			birthdate.setText(null);
		}
		else 
		{
			data.setText("Complete los campos que se encuentran vacios...");
		}
	}
	
	//Getters & Setters
	
	public JTextField getName() {
		return name;
	}


	public void setName(JTextField name) {
		this.name = name;
	}


	public JTextField getLastName() {
		return lastName;
	}


	public void setLastName(JTextField lastName) {
		this.lastName = lastName;
	}


	public JTextField getTelephone() {
		return telephone;
	}


	public void setTelephone(JTextField telephone) {
		this.telephone = telephone;
	}


	public JTextField getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(JTextField birthdate) {
		this.birthdate = birthdate;
	}


	public Boolean getAllCompleted() {
		return allCompleted;
	}


	public void setAllCompleted(Boolean allCompleted) {
		this.allCompleted = allCompleted;
	}

/*
	public JLabel getLblName() {
		return lblName;
	}


	public void setLblName(JLabel lblName) {
		this.lblName = lblName;
	}


	public JLabel getLblLastName() {
		return lblLastName;
	}


	public void setLblLastName(JLabel lblLastName) {
		this.lblLastName = lblLastName;
	}


	public JLabel getLblTelephone() {
		return lblTelephone;
	}


	public void setLblTelephone(JLabel lblTelephone) {
		this.lblTelephone = lblTelephone;
	}


	public JLabel getLblBirthdate() {
		return lblBirthdate;
	}


	public void setLblBirthdate(JLabel lblBirthdate) {
		this.lblBirthdate = lblBirthdate;
	}


	public JLabel getLblDataUser() {
		return lblDataUser;
	}


	public void setLblDataUser(JLabel lblDataUser) {
		this.lblDataUser = lblDataUser;
	}
*/

	
}
