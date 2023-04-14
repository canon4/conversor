/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

/**
 *
 * @author Diego Canon
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PesoToDolar = 0.00022;
        final double PesoToEuro = 0.00020;
        final double DolarToPeso = 4584.75;
        final double EuroToPeso = 5001.27;
        //creamos el arreglo del menú
        String[] options = {"Conversor de Moneda"};
        String[] moneda = {"peso(COP) a Dolar(USD)", "Peso(COP) a Euro(EUR)", "Dolar(USD) a Peso(COP)", "Euro (EUR) a Peso(COP)", "salir"};
//        System.out.println("---");
        boolean salir = true;
        Object opcion = JOptionPane.showInputDialog(null, "Selecciona un color", "Elegir", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        do {

            Object conversion;

            if (opcion.equals("Conversor de Moneda")) {
                conversion = JOptionPane.showInputDialog(null, "Selecciona un tipo de cambio", "Elegir", JOptionPane.QUESTION_MESSAGE, null, moneda, moneda[0]);
                try {
                    if (conversion.equals("peso(COP) a Dolar(USD)")) {
                        calcularDivisa(PesoToDolar, conversion, "USD");
                    } else if (conversion.equals("Peso(COP) a Euro(EUR)")) {
                        calcularDivisa(PesoToEuro, conversion, "EUR");
                    } else if (conversion.equals("Dolar(USD) a Peso(COP)")) {
                        calcularDivisa(DolarToPeso, conversion, "COP");
                    } else if (conversion.equals("Euro (EUR) a Peso(COP)")) {
                        calcularDivisa(DolarToPeso, conversion, "COP");
                    }
                    String[] opciones = {"Yes", "No", "Cancel"};
                    int o = JOptionPane.showOptionDialog(null, "¿Desea continuar usando el programa?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                    if (o == JOptionPane.YES_OPTION) {

                    } else {

                        JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        salir = false;
                    }

                } catch (NumberFormatException S) {
                    JOptionPane.showMessageDialog(null, S.getMessage());
                }

            }
        } while (salir);

//        System.out.println(opcion);
    }

    public static void calcularDivisa(double Divisa, Object conversion, String acronimo) {

        String valorCambio = JOptionPane.showInputDialog(null, "Ingrese el valor de cambio");
        double valor = Integer.parseInt(valorCambio);
        JOptionPane.showMessageDialog(null, "Su cambio de divisa es igual a $ " + (valor * Divisa) + " " + acronimo);

    }

}
