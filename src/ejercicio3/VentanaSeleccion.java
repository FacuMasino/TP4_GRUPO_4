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
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import java.awt.ComponentOrientation;
import javax.swing.border.CompoundBorder;

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
		setTitle("Seleccion multiple");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(200, 200, 480, 380);
        
        
        
        JPanel containerPanel = new JPanel();
        GridBagLayout gbl_containerPanel = new GridBagLayout();
        containerPanel.setLayout(gbl_containerPanel);
        containerPanel.setLayout(new GridLayout(3, 1, 0, 20));

        Border CompartidoBorde = BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 0, 10),
                new TitledBorder(null, null, TitledBorder.LEADING, TitledBorder.TOP));
  
        
        JPanel panelSistema = new JPanel();
        GridBagConstraints gbc_panelTop = new GridBagConstraints();
        gbc_panelTop.weightx = 3.0 / 4.0;
        gbc_panelTop.weighty = 1;
        gbc_panelTop.gridx = 0;
        gbc_panelTop.gridy = 0;
     
        panelSistema.setBorder(new CompoundBorder(new EmptyBorder(10, 10, 0, 10), null) );
        containerPanel.add(panelSistema, gbc_panelTop);
        panelSistema.setLayout(new GridLayout(0, 1, 0, 0));
        
        JPanel panelSistema1 = new JPanel();
        //panelSistema1.setForeground(Color.BLACK);
        panelSistema1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
        panelSistema1.setBorder(null);
        panelSistema.add(panelSistema1);
        
        JPanel panelEspecialidad = new JPanel();
        GridBagConstraints gbc_panelB = new GridBagConstraints();
        gbc_panelB.weightx = 3.0 / 4.0;
        gbc_panelB.weighty = 1;
        gbc_panelB.gridx = 0;
        gbc_panelB.gridy = 0;
        
        
        panelEspecialidad.setBorder(new CompoundBorder(new EmptyBorder(10, 10, 0, 10), new LineBorder(new Color(0, 0, 0))));
        panelEspecialidad.setLayout(new GridLayout(1, 2, 10, 11));
        containerPanel.add(panelEspecialidad, gbc_panelB);
        
        JPanel panelEspecialidad1 = new JPanel();
        panelEspecialidad1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        panelEspecialidad1.setBorder(null);
        panelEspecialidad1.setForeground(Color.BLACK);
       
        FlowLayout flowLayout = (FlowLayout) panelEspecialidad1.getLayout();
        flowLayout.setVgap(26);
        flowLayout.setHgap(0);
       
        JLabel especialidadLbl = new JLabel("Elige una especialidad");
        especialidadLbl.setBorder(new EmptyBorder(10,10,0,10));
        GridBagConstraints gbc_label = new GridBagConstraints();
        especialidadLbl.setHorizontalAlignment(SwingConstants.CENTER);
        panelEspecialidad1.add(especialidadLbl);
        panelEspecialidad.add(panelEspecialidad1, gbc_label);
        
        JPanel panelEspecialidad2 = new JPanel();
        panelEspecialidad2.setBorder(null);
        GridBagConstraints gbc_checkbox = new GridBagConstraints();
        panelEspecialidad2.setLayout(new GridLayout(3, 1, 5, 5));
        prograChk = new JCheckBox("Programación");
        prograChk.setBorder(new EmptyBorder(4, 0, 4, 0));
        prograChk.setBounds(21, 122, 128, 23);
        panelEspecialidad2.add(prograChk);

        adminChk = new JCheckBox("Administración");
        adminChk.setBounds(21, 122, 128, 23);
        adminChk.setBorder(new EmptyBorder(4, 0, 4, 0));
        panelEspecialidad2.add(adminChk);

        disenoChk = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
        disenoChk.setAlignmentX(Component.CENTER_ALIGNMENT);
        disenoChk.setBounds(21, 122, 128, 23);
        disenoChk.setBorder(new EmptyBorder(4, 0, 4, 0));
        panelEspecialidad2.add(disenoChk); 
       
   
        panelEspecialidad.add(panelEspecialidad2, gbc_checkbox);      
        
        JPanel panelHoras = new JPanel();
        GridBagConstraints gbc_tex = new GridBagConstraints();
        gbc_tex.weightx = 3.0 / 4.0;
        gbc_tex.weighty = 1;
        gbc_tex.gridx = 0;
        gbc_tex.gridy = 0;
        panelHoras.setLayout(new GridLayout(1, 1, 0, 0));  
        containerPanel.add(panelHoras, gbc_tex); 
        
        JPanel panelHoras1 = new JPanel();
        JLabel cantidadLbl = new JLabel("Cantidad de horas en el computador: ");
        cantidadLbl.setHorizontalAlignment(SwingConstants.CENTER);
        panelHoras1.setLayout(new FlowLayout(FlowLayout.RIGHT, 3, 11));
        panelHoras1.add(cantidadLbl);
        panelHoras.add(panelHoras1);
        
          
        //Se agregan los radio button a un grupo, para la seleccion exclusiva
        grupoRadio = new ButtonGroup();
        
        List<JRadioButton> rads = new ArrayList<>();
        
        JPanel panelSistema2 = new JPanel();
        panelSistema.add(panelSistema2);
        panelSistema2.setBorder(new LineBorder(new Color(0, 0, 0)));
        FlowLayout fl_panelSistema2 = new FlowLayout(FlowLayout.CENTER, 5, 10);
        panelSistema2.setLayout(fl_panelSistema2);
        
        JLabel sistemaLbl = new JLabel("Elige un sistema operativo");
        panelSistema2.add(sistemaLbl);
        sistemaLbl.setHorizontalAlignment(SwingConstants.CENTER);
        
        winRad = new JRadioButton("Windows");
        panelSistema2.add(winRad);
        winRad.setBounds(40, 36, 141, 23);
        grupoRadio.add(winRad);
        rads.add(winRad);
        
        macRad = new JRadioButton("Mac");
        panelSistema2.add(macRad);
        macRad.setBounds(180, 36, 141, 23);
        grupoRadio.add(macRad);
        rads.add(macRad);
        
        linRad = new JRadioButton("Linux");
        panelSistema2.add(linRad);
        linRad.setBounds(315, 36, 141, 23);
        grupoRadio.add(linRad);
        rads.add(linRad);
        
        List<JCheckBox> chks = new ArrayList<>();
        chks.add(prograChk);
        chks.add(adminChk);
        chks.add(disenoChk);
        
        JPanel panelhoras2 = new JPanel();
        panelHoras.add(panelhoras2);
        panelhoras2.setLayout(new GridLayout(0, 1, 0, 30));
        
        JPanel panel = new JPanel();
        FlowLayout flowLayout_1 = (FlowLayout) panel.getLayout();
        flowLayout_1.setAlignment(FlowLayout.LEFT);
        flowLayout_1.setHgap(3);
        panelhoras2.add(panel);
        
        horasTxt = new JTextField();
        horasTxt.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(horasTxt);
        horasTxt.setPreferredSize(new Dimension(130, 26));
        
        EventoBoton click = new EventoBoton(rads, chks, horasTxt);
        
        JPanel panel_1 = new JPanel();
        FlowLayout flowLayout_2 = (FlowLayout) panel_1.getLayout();
        flowLayout_2.setVgap(0);
        panelhoras2.add(panel_1);
        btn = new JButton("Aceptar");
        panel_1.add(btn);
        btn.setHorizontalAlignment(SwingConstants.RIGHT);
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.setHorizontalTextPosition(SwingConstants.CENTER);
        btn.setFocusPainted(false);
        btn.setBounds(193, 272, 117, 29);
        
        
        btn.addActionListener(click);
        
        getContentPane().add(containerPanel);
        this.setVisible(true);
	}
}
