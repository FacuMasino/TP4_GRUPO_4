package ejercicio1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class VentanaContactos extends JDialog {

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
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public VentanaContactos() {
		
		setModal(true);
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 200, 750, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 30));
		
		
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
		eventoB.addJTextField(txtName);
		eventoB.addJTextField(txtLastName);
		eventoB.addJTextField(txtTelephone);
		eventoB.addJTextField(txtBirthdate);
		
		lblNewLabel = new JLabel("");
		contentPane.add(lblNewLabel);
		
		JButton btnShow = new JButton("Mostrar");
		contentPane.add(btnShow);
		
		btnShow.addActionListener(eventoB);
		
		
		setVisible(true);
	}
}
