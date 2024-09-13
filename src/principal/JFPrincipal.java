package principal;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class JFPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public JFPrincipal() {
		setMinimumSize(new Dimension(450, 300));
		setMaximizedBounds(new Rectangle(0, 0, 800, 600));
		setMaximumSize(new Dimension(800, 600));
		setTitle("TP4 Grupo 4 - Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel containerPanel = new JPanel();
		contentPane.add(containerPanel, BorderLayout.CENTER);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new GridLayout(3, 0, 0, 5));
		
		JButton btnEjercicio1 = new JButton("Ejercicio 1");
		btnPanel.add(btnEjercicio1);
		btnEjercicio1.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnPanel.add(btnEjercicio2);
		btnEjercicio2.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnPanel.add(btnEjercicio3);
		btnEjercicio3.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JLabel lblGrupo = new JLabel("GRUPO NRO: 4");
		lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGrupo.setHorizontalTextPosition(SwingConstants.LEFT);
		lblGrupo.setAlignmentY(Component.TOP_ALIGNMENT);
		GroupLayout gl_containerPanel = new GroupLayout(containerPanel);
		gl_containerPanel.setHorizontalGroup(
			gl_containerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_containerPanel.createSequentialGroup()
					.addGap(111)
					.addComponent(btnPanel, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
					.addGap(110))
				.addGroup(gl_containerPanel.createSequentialGroup()
					.addGap(27)
					.addComponent(lblGrupo, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(194, Short.MAX_VALUE))
		);
		gl_containerPanel.setVerticalGroup(
			gl_containerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_containerPanel.createSequentialGroup()
					.addGap(21)
					.addComponent(lblGrupo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnPanel, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
					.addGap(76))
		);
		containerPanel.setLayout(gl_containerPanel);
	}

}
