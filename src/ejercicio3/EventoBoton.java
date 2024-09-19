package ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class EventoBoton implements ActionListener
{
	private List<JRadioButton> sistemasOperativosRads;
	private List<JCheckBox> especialidadesChks;
	private JTextField horasTxt;

	public EventoBoton(
			List<JRadioButton> sistemasOperativosRads,
			List<JCheckBox> especialidadesChks,
			JTextField horasTxt)
	{
		this.sistemasOperativosRads = sistemasOperativosRads;
		this.especialidadesChks = especialidadesChks;
		this.horasTxt = horasTxt;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		try {
		String mensaje = UtilsSeleccion.selectedRadioButton(sistemasOperativosRads).getText() + " - ";
		
		mensaje += UtilsSeleccion.chksToString(UtilsSeleccion.selectedCheckBoxes(especialidadesChks));
		
		mensaje += horasTxt.getText();
		
		JOptionPane.showMessageDialog(null, mensaje, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		
		} catch (Exception ex) {
			System.out.println(ex.toString());
			JOptionPane.showMessageDialog(null, "Por favor complete todos los datos", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
