/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;

/**
 *
 * @author Diego Canon
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JPanel panel = new JPanel(new GridLayout(0, 2));
        JTextField campo1 = new JTextField();
        JTextField campo2 = new JTextField();
        panel.add(new JLabel("Valor 1:"));
        panel.add(campo1);
        panel.add(new JLabel("Valor 2:"));
        panel.add(campo2);

        int opcion = JOptionPane.showOptionDialog(null, panel, "Ingrese dos valores", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

        if (opcion == JOptionPane.OK_OPTION) {
            int valor1 = Integer.parseInt(campo1.getText());
            int valor2 = Integer.parseInt(campo2.getText());
            JOptionPane.showMessageDialog(null, "Los valores ingresados son: " + valor1 + " y " + valor2);
        }
    }

}
