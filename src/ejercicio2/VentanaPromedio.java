package ejercicio2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.GridLayout;
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
    private JTextField tpsTxt;
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
        
        tpsTxt = new JTextField();
        panelL1.add(tpsTxt);
        tpsTxt.setColumns(10);
        
        // Panel izquierdo 2
        
        JPanel panelL2 = new JPanel();
        panelL2.setBorder(new TitledBorder(null, "Promedio y condici\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panelL.add(panelL2);
        panelL2.setLayout(new GridLayout(2, 2, 0, 20));
        
        JLabel promedioLbl = new JLabel("Promedio:");
        promedioLbl.setHorizontalAlignment(SwingConstants.CENTER);
        panelL2.add(promedioLbl);
        
        promedioTxt = new JTextField();
        panelL2.add(promedioTxt);
        promedioTxt.setColumns(10);
        
        JLabel condicionLbl = new JLabel("Condición:");
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
        
        JButton nuevoBtn = new JButton("Nuevo");
        panelR.add(nuevoBtn);
        
        JButton salirBtn = new JButton("Salir");
        panelR.add(salirBtn);


        // Agregar panel contenedor al frame

        getContentPane().add(containerPanel);
        this.setVisible(true);
    }
}
