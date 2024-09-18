package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class UtilsSeleccion
{
	public static JRadioButton selectedRadioButton(List<JRadioButton> radsList)
	{		
		for (int i = 0; i < radsList.size(); i++)
		{
			JRadioButton rad = radsList.get(i);
            
            if (rad.isSelected())
            {
            	return rad;
            }
        }
		
		return null;
	}

	public static List<JCheckBox> selectedCheckBoxes(List<JCheckBox> chksList)
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

		return selectedCheckBoxes;
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
}
