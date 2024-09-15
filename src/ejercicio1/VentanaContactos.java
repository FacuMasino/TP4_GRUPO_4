package ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaContactos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtLastName;
	private JTextField txtTelephone;
	private JTextField txtBirthdate;
	
	private JLabel lblName;
	private JLabel lblLastName;
	private JLabel lblTelephone;
	private JLabel lblBirthdate;
	private JLabel lblDataUser;

	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaContactos frame = new VentanaContactos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaContactos() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 200, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		lblName = new JLabel("Nombre:");
		contentPane.add(lblName);
		
		txtName = new JTextField();
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		lblLastName = new JLabel("Apellido:");
		contentPane.add(lblLastName);
		
		txtLastName = new JTextField();
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);
		
		lblTelephone = new JLabel("Telefono:");
		contentPane.add(lblTelephone);
		
		txtTelephone = new JTextField();
		contentPane.add(txtTelephone);
		txtTelephone.setColumns(10);
		
		lblBirthdate = new JLabel("Fecha de nacimiento:");
		contentPane.add(lblBirthdate);
		
		txtBirthdate = new JTextField();
		contentPane.add(txtBirthdate);
		txtBirthdate.setColumns(10);
		
		
		
		JLabel lblData = new JLabel("Los datos ingresados fueron:");
		contentPane.add(lblData);
		
		lblDataUser = new JLabel("");
		contentPane.add(lblDataUser);
		
		EventoBoton eventoB = new EventoBoton(lblDataUser);
		eventoB.setName(txtName);
		eventoB.setLastName(txtLastName);
		eventoB.setTelephone(txtTelephone);
		eventoB.setBirthdate(txtBirthdate);
		
		//Por aca Gonzo...
		JButton btnShow = new JButton("Mostrar");
		
		btnShow.addActionListener(eventoB);
		contentPane.add(btnShow);
		
		setVisible(true);
	}
}
