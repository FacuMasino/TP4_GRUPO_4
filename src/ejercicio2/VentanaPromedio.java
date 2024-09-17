package ejercicio2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaPromedio extends JDialog
{
    private static final long serialVersionUID = 1L;
    private JTextField nota2Txt;
    private JTextField nota3Txt;
    private JTextField nota1Txt;
    private JComboBox<String> cboTp;
    private JTextField promedioTxt;
    private JTextField condicionTxt;

    public VentanaPromedio()
    {
    	setModal(true);
    	setTitle("Promedio");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(200, 200, 480, 360);

        // Panel contenedor

        JPanel containerPanel = new JPanel();
        GridBagLayout gbl_containerPanel = new GridBagLayout();
        containerPanel.setLayout(gbl_containerPanel);

        // Panel izquierdo

        JPanel panelL = new JPanel();
        GridBagConstraints gbc_panelL = new GridBagConstraints();
        gbc_panelL.weightx = 3.0 / 4.0;
        gbc_panelL.weighty = 1;
        gbc_panelL.gridx = 0;
        gbc_panelL.gridy = 0;
        containerPanel.add(panelL, gbc_panelL);
        panelL.setLayout(new GridLayout(2, 1, 0, 30));
        
        // Panel izquierdo 1
        
        JPanel panelL1 = new JPanel();
        panelL1.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panelL.add(panelL1);
        panelL1.setLayout(new GridLayout(4, 2, 0, 0));
        
        JLabel nota1Lbl = new JLabel("Nota 1:");
        nota1Lbl.setHorizontalAlignment(SwingConstants.CENTER);
        panelL1.add(nota1Lbl);
        
        nota1Txt = new JTextField();
        panelL1.add(nota1Txt);
        nota1Txt.setColumns(10);
        
        JLabel nota2Lbl = new JLabel("Nota 2:");
        nota2Lbl.setHorizontalAlignment(SwingConstants.CENTER);
        panelL1.add(nota2Lbl);
        
        nota2Txt = new JTextField();
        panelL1.add(nota2Txt);
        nota2Txt.setColumns(10);
        
        JLabel nota3Lbl = new JLabel("Nota 3:");
        nota3Lbl.setHorizontalAlignment(SwingConstants.CENTER);
        panelL1.add(nota3Lbl);
        
        nota3Txt = new JTextField();
        panelL1.add(nota3Txt);
        nota3Txt.setColumns(10);
        
        JLabel tpsLbl = new JLabel("TPs:");
        tpsLbl.setHorizontalAlignment(SwingConstants.CENTER);
        panelL1.add(tpsLbl);
        
        cboTp = new JComboBox<>();
        cboTp.addItem("Seleccionar");
        cboTp.addItem("Aprobado");
        cboTp.addItem("Desaprobado");
        panelL1.add(cboTp);
        
        // Panel izquierdo 2
        
        JPanel panelL2 = new JPanel();
        panelL2.setBorder(new TitledBorder(null, "Promedio y condicion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panelL.add(panelL2);
        panelL2.setLayout(new GridLayout(2, 2, 0, 20));
        
        JLabel promedioLbl = new JLabel("Promedio:");
        promedioLbl.setHorizontalAlignment(SwingConstants.CENTER);
        panelL2.add(promedioLbl);
        
        promedioTxt = new JTextField();
        panelL2.add(promedioTxt);
        promedioTxt.setColumns(10);
        
        JLabel condicionLbl = new JLabel("Condicion:");
        condicionLbl.setHorizontalAlignment(SwingConstants.CENTER);
        panelL2.add(condicionLbl);
        
        condicionTxt = new JTextField();
        panelL2.add(condicionTxt);
        condicionTxt.setColumns(10);
        

        // Panel derecho

        JPanel panelR = new JPanel();
        GridBagConstraints gbc_panelR = new GridBagConstraints();
        gbc_panelR.weightx = 1.0 / 4.0;
        gbc_panelR.weighty = 1.0;
        gbc_panelR.gridx = 1;
        gbc_panelR.gridy = 0;
        containerPanel.add(panelR, gbc_panelR);
        panelR.setLayout(new GridLayout(3, 1, 0, 10));
        
        JButton calcularBtn = new JButton("Calcular");
        panelR.add(calcularBtn);
        calcularBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					JTextField[] jtfNota  = {nota1Txt, nota2Txt, nota3Txt};
					double[] notas = UtilsPromedio.obtenerNotas(jtfNota);
					
					double promedio = (notas[0] + notas[1] + notas[2]) / 3;
					
					promedioTxt.setText(Double.toString(promedio));
					condicionTxt.setText(UtilsPromedio.obtenerCondicion(notas, cboTp));
				} catch (Exception ex) {
					System.out.println("Campos Inválidos.");
					System.out.println(ex.getMessage());
				}
			}
        	
        });
        
        JButton nuevoBtn = new JButton("Nuevo");
        panelR.add(nuevoBtn);
        nuevoBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				nota1Txt.setText("");
				nota2Txt.setText("");
				nota3Txt.setText("");
				condicionTxt.setText("");
				promedioTxt.setText("");
				cboTp.setSelectedItem("Seleccionar");
			}
        	
        });
        
        JButton salirBtn = new JButton("Salir");
        panelR.add(salirBtn);



        // Agregar panel contenedor al frame

        getContentPane().add(containerPanel);
        this.setVisible(true);
    }
}
