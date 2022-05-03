package mx.edu.itsoeh;
/*PROBLEMA: programa que muestre menu de texto con opciones de convertir grados °C a °F o °f a °C, 
solicite el valor y ,muestre resultado.*/
import javax.swing.JOptionPane;

public class ConversionGrados {

    public static void main(String[] args) {

        double grados = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la opción para convertir Grados:" + "\n" + "  1 (ºF a ºC )  O  2 (ºC a ºF)"));//ES ES NUMERO 1 O 2 DEPENDE
        double valor = Double.parseDouble(JOptionPane.showInputDialog("ingresa los grados a convertir "));//NUMERO QUE INGRESA EL USUARIO, ES PARA HACER LAS OPRECIONES

        if (grados == 1) {
            JOptionPane.showMessageDialog(null, "grados farenheit:   " + CalcularCel(valor));//llamada de METODO con argumento

        }
        if (grados == 2) {
            JOptionPane.showMessageDialog(null, "Grados Celsius:    " + CalcularFaren(valor));//llamada de METODO con argumento
        }
        if (grados <1 || grados > 2)//es extra para decir que es diferente a 1 o 2
        {
            JOptionPane.showMessageDialog(null, "Es incorrecta su opción");//EXTRA POR SI EL USUARIO INGRESA OTRO NUMERO
        }
    }

    private static double CalcularCel(double f) {
        return ((f - 32) + 1.8);//ES LA FORMULA DE FARENHEIT A CELCIUS
    }

    private static double CalcularFaren(double c) {
        return ((c * 1.8) + 32);//ES LA FORMULA DE CELCISUS A FARENHEIT

    }

}
