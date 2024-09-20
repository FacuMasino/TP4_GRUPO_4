package ejercicio3;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.List;

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
		setTitle("Promedio");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(200, 200, 480, 360);
        getContentPane().setLayout(null);
        
        winRad = new JRadioButton("Windows");
        winRad.setBounds(40, 36, 141, 23);
        getContentPane().add(winRad);
        
        macRad = new JRadioButton("MacOs");
        macRad.setBounds(180, 36, 141, 23);
        getContentPane().add(macRad);
        
        linRad = new JRadioButton("Linux");
        linRad.setBounds(315, 36, 141, 23);
        getContentPane().add(linRad);
        
        prograChk = new JCheckBox("progra");
        prograChk.setBounds(21, 122, 128, 23);
        getContentPane().add(prograChk);
        
        adminChk = new JCheckBox("admin");
        adminChk.setBounds(182, 122, 128, 23);
        getContentPane().add(adminChk);
        
        disenoChk = new JCheckBox("diseno");
        disenoChk.setBounds(346, 122, 128, 23);
        getContentPane().add(disenoChk);
        
        horasTxt = new JTextField();
        horasTxt.setBounds(166, 193, 130, 26);
        getContentPane().add(horasTxt);
        
        btn = new JButton("btn");
        btn.setBounds(193, 272, 117, 29);
        getContentPane().add(btn);
        
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
        
        this.setVisible(true);
	}
}
