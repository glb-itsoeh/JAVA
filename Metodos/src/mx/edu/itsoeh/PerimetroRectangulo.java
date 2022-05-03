package mx.edu.itsoeh;

import javax.swing.JOptionPane;

public class PerimetroRectangulo {

    public static final String MENSAJE = "INGRESE UN VALOR";

    public static void main(String[] args) {
        double lado1 = Double.parseDouble(JOptionPane.showInputDialog(MENSAJE + "  largo"));
        double lado2 = Double.parseDouble(JOptionPane.showInputDialog(MENSAJE + "  ancho"));

        JOptionPane.showMessageDialog(null, " EL PERIMETRO ES:  " + (CalcularPerimetro(lado1, lado2)));

    }

    private static double CalcularPerimetro(double a, double b) {
        return 2 * (a + b);

    }

}
