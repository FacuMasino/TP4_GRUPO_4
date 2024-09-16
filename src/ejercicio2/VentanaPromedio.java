package ejercicio2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class VentanaPromedio extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JPanel contentPanel;

    public VentanaPromedio()
    {
    	setTitle("Promedio");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(200, 200, 600, 400);

        // Panel contenedor

        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new GridBagLayout());

        // Definir subPanelL

        JPanel subPanelL = new JPanel();
        subPanelL.setBackground(Color.CYAN); // Provisorio para maquetado, Maxi lo borra al final
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.fill = GridBagConstraints.BOTH; // Los subpaneles ocupan todo el espacio disponible en ambos ejes
        gbc1.weightx = 3.0 / 4.0;
        gbc1.weighty = 1;
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        containerPanel.add(subPanelL, gbc1);

        // Definir subPanelR

        JPanel subPanelR = new JPanel();
        subPanelR.setBackground(Color.ORANGE); // Provisorio para maquetado, Maxi lo borra al final
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.fill = GridBagConstraints.BOTH; // Los subpaneles ocupan todo el espacio disponible en ambos ejes
        gbc2.weightx = 1.0 / 4.0;
        gbc2.weighty = 1.0;
        gbc2.gridx = 1;
        gbc2.gridy = 0;
        containerPanel.add(subPanelR, gbc2);

        // Agregar panel contenedor al frame

        this.add(containerPanel);
        this.setVisible(true);
    }
}
