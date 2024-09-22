package ejercicio3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class UtilsSeleccion
{

	public static JRadioButton selectedRadioButton(List<JRadioButton> radsList) throws IOException
	{		
		for (int i = 0; i < radsList.size(); i++)
		{
			JRadioButton rad = radsList.get(i);
            
            if (rad.isSelected())
            {
            	return rad;
            }
                    }
		// Si llegó a este punto es que no hay ningun radio button seleccionado
		throw new IOException("No se seleccionó ninguna opción.");
	}

	public static List<JCheckBox> selectedCheckBoxes(List<JCheckBox> chksList) throws IOException
	{
		List<JCheckBox> selectedCheckBoxes = new ArrayList<>();
		
		for (int i = 0; i < chksList.size(); i++)
		{
            JCheckBox chk = chksList.get(i);
            
            if (chk.isSelected())
            {
            	selectedCheckBoxes.add(chk);
            }
        }

			if (!selectedCheckBoxes.isEmpty())
		
			{
				return selectedCheckBoxes; 
			}
		
		else {throw new IOException("No se seleccionó ninguna check");	}
		
		
	}
	


	public static String chksToString(List<JCheckBox> chks)
	{
		String str = "";

		for (int i = 0; i < chks.size(); i++)
		{
		    JCheckBox chk = chks.get(i);

		    str += chk.getText() + " - ";
		}

		return str;
	}
	
	public static String horasTextVerificarNumero(JTextField horasTxt) throws IOException
	
	{
		String texto = horasTxt.getText();
			 
		if (esNumero(texto))
		{
			return  horasTxt.getText();
		}
		
		else 
		{
			throw new IOException("valor no númerico o campo vacío");			
	
	     }
		
	  }
		
	
	public static boolean esNumero(String texto) {
		
	  
	    try {
	        Double.parseDouble(texto);
	        return true;
	    } 
	    
	    catch (NumberFormatException e) {
	        return false;
	    }
	}
		
	}
		
		



		
		