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

public class VentanaContactos extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtLastName;
	private JTextField txtTelephone;
	private JTextField txtBirthdate;

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE/*JFrame.EXIT_ON_CLOSE*/);
		setBounds(200, 200, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblName = new JLabel("Nombre:");
		contentPane.add(lblName);
		
		txtName = new JTextField();
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Apellido:");
		contentPane.add(lblLastName);
		
		txtLastName = new JTextField();
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);
		
		JLabel lblTelephone = new JLabel("Telefono:");
		contentPane.add(lblTelephone);
		
		txtTelephone = new JTextField();
		contentPane.add(txtTelephone);
		txtTelephone.setColumns(10);
		
		JLabel lblBirthdate = new JLabel("Fecha de nacimiento:");
		contentPane.add(lblBirthdate);
		
		txtBirthdate = new JTextField();
		contentPane.add(txtBirthdate);
		txtBirthdate.setColumns(10);
		
		JLabel lblData = new JLabel("Los datos ingresados fueron:");
		contentPane.add(lblData);
		
		JButton btnShow = new JButton("Mostrar");
		contentPane.add(btnShow);
		
		JLabel lblDataUser = new JLabel("");
		contentPane.add(lblDataUser);
		
		setVisible(true);
	}
}
