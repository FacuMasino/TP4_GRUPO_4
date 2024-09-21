package ejercicio3;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class VentanaSeleccion extends JDialog
{
	private static final long serialVersionUID = 1L;
	private JRadioButton winRad;
	private JRadioButton macRad;
	private JRadioButton linRad;
	private JCheckBox prograChk;
	private JCheckBox adminChk;
	private JCheckBox disenoChk;
	private JTextField horasTxt;
	private JButton btn;
	private ButtonGroup grupoRadio;
	
	public VentanaSeleccion()
	{
		setModal(true);
		setTitle("Seleccion mutliple");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(200, 200, 480, 360);
        
        JPanel containerPanel = new JPanel();
        GridBagLayout gbl_containerPanel = new GridBagLayout();
        containerPanel.setLayout(gbl_containerPanel);
        containerPanel.setLayout(new GridLayout(4, 1, 0, 30));

        JPanel panelSistema = new JPanel();
        GridBagConstraints gbc_panelTop = new GridBagConstraints();
        gbc_panelTop.weightx = 3.0 / 4.0;
        gbc_panelTop.weighty = 1;
        gbc_panelTop.gridx = 0;
        gbc_panelTop.gridy = 0;
        panelSistema.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 0, 10), new TitledBorder(null, null, TitledBorder.LEADING, TitledBorder.TOP)));
        panelSistema.setLayout(new GridLayout(1, 1, 0, 20));
        containerPanel.add(panelSistema, gbc_panelTop);
        
        JPanel panelSistema1 = new JPanel();
        panelSistema1.setBorder(new TitledBorder(null, null, TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panelSistema1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        
        JLabel sistemaLbl = new JLabel("Elige un sistema operativo");
        sistemaLbl.setHorizontalAlignment(SwingConstants.CENTER);
        panelSistema1.add(sistemaLbl);
        
        winRad = new JRadioButton("Windows");
        winRad.setBounds(40, 36, 141, 23);
        panelSistema1.add(winRad);
        
        macRad = new JRadioButton("MacOs");
        macRad.setBounds(180, 36, 141, 23);
        panelSistema1.add(macRad);
        
        linRad = new JRadioButton("Linux");
        linRad.setBounds(315, 36, 141, 23);
        panelSistema1.add(linRad);
        panelSistema.add(panelSistema1);
        
        JPanel panelEspecialidad = new JPanel();
        GridBagConstraints gbc_panelB = new GridBagConstraints();
        gbc_panelB.weightx = 3.0 / 4.0;
        gbc_panelB.weighty = 1.0;
        gbc_panelB.gridx = 0;
        gbc_panelB.gridy = 0;
        panelEspecialidad.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(0, 10, 0, 10), new TitledBorder(null, null, TitledBorder.LEADING, TitledBorder.TOP)));
        panelEspecialidad.setLayout(new GridLayout(1, 2, 10, 30));
        containerPanel.add(panelEspecialidad, gbc_panelB);
        
        JPanel panelEspecialidad1 = new JPanel();
        JLabel especialidadLbl = new JLabel("Elige una especialidad");
        GridBagConstraints gbc_label = new GridBagConstraints();
        especialidadLbl.setHorizontalAlignment(SwingConstants.LEFT);
        panelEspecialidad1.add(especialidadLbl);
        panelEspecialidad.add(panelEspecialidad1, gbc_label);
        
        
        JPanel panelEspecialidad2 = new JPanel();
        GridBagConstraints gbc_checkbox = new GridBagConstraints();
        panelEspecialidad2.setLayout(new GridLayout(3, 1, 5, 10));
        prograChk = new JCheckBox("Programacion");
        prograChk.setBounds(21, 122, 128, 23);
        panelEspecialidad2.add(prograChk);

        adminChk = new JCheckBox("Administracion");
        adminChk.setBounds(21, 122, 128, 23);
        panelEspecialidad2.add(adminChk);

        disenoChk = new JCheckBox("Diseno grafico");
        disenoChk.setBounds(21, 122, 128, 23);
        panelEspecialidad2.add(disenoChk);

        panelEspecialidad.add(panelEspecialidad2, gbc_checkbox);      
        
        JPanel panelHoras = new JPanel();
        GridBagConstraints gbc_tex = new GridBagConstraints();
        gbc_tex.weightx = 3.0 / 4.0;
        gbc_tex.weighty = 1;
        gbc_tex.gridx = 0;
        gbc_tex.gridy = 0;
        panelHoras.setLayout(new GridLayout(1, 1, 0, 20));  
        containerPanel.add(panelHoras, gbc_tex); 
        
        JPanel panelHoras1 = new JPanel();
        panelHoras1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        JLabel cantidadLbl = new JLabel("Cantidad de horas en el computador: ");
        horasTxt = new JTextField();
        horasTxt.setPreferredSize(new Dimension(150, 26));
        panelHoras1.add(cantidadLbl);
        panelHoras1.add(horasTxt);
        panelHoras.add(panelHoras1);
        
        
        JPanel panelBtn = new JPanel();
        GridBagConstraints gbc_btn = new GridBagConstraints();
        panelBtn.setLayout(new GridLayout(1, 1, 5, 10)); 
        containerPanel.add(panelBtn, gbc_btn); 
        
        JPanel panelBtn1 = new JPanel();
        panelBtn1.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        btn = new JButton("Aceptar");
        btn.setBounds(193, 272, 117, 29);
        panelBtn1.add(btn);
        panelBtn.add(panelBtn1);
        
        
        //Se agregan los radio button a un grupo, para la seleccion exclusiva
        grupoRadio = new ButtonGroup();
        grupoRadio.add(winRad);
        grupoRadio.add(macRad);
        grupoRadio.add(linRad);
        
        List<JRadioButton> rads = new ArrayList<>();
        rads.add(winRad);
        rads.add(macRad);
        rads.add(linRad);
        
        List<JCheckBox> chks = new ArrayList<>();
        chks.add(prograChk);
        chks.add(adminChk);
        chks.add(disenoChk);
        
        EventoBoton click = new EventoBoton(rads, chks, horasTxt);
        
        btn.addActionListener(click);
        
        getContentPane().add(containerPanel);
        this.setVisible(true);
	}
}
