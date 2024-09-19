package ejercicio2;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class UtilsPromedio {

	
	// Devuelve un array tipo double con las 3 notas
	public static double[] obtenerNotas(JTextField[] notas) {
		try {
			double[] arrNotas = new double[3];
			
			for(int i = 0; i < 3; i++) {
				arrNotas[i] = Double.parseDouble(notas[i].getText());
			}
			return arrNotas; 
		} catch (Exception ex) {
			throw ex; 
		}
	}
	
	public static String obtenerCondicion(double[] notas, JComboBox<String> cboCondicion) throws CampoSeleccionadoException {
		String condicion = (String) cboCondicion.getSelectedItem();
		JTextField a = null; 
		
	    if (condicion.equals("Seleccionar"))
		{
			CampoSeleccionadoException excepcionSeleccion = new CampoSeleccionadoException();
			throw excepcionSeleccion;
		}
		
		if(notas[0] < 6 || notas[1] < 6 || notas[2] < 6 || condicion.equals("Desaprobado")) 
		{
			return "Libre";
		} 
		else if (notas[0] >= 8 && notas[1] >= 8 && notas[2] >= 8 && condicion.equals("Aprobado")) 
		{
			return "Promocionado";
		} 
				
		return "Regular";
	}


	
}
