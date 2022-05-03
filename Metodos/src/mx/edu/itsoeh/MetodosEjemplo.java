
package mx.edu.itsoeh;

import javax.swing.JOptionPane;


public class MetodosEjemplo {
    private static String MENSAJE= "INGRESA UN VALOR";
   
    public static void main(String[] args) {
        String valor= JOptionPane.showInputDialog(MENSAJE);
        int vueltas = Integer.parseInt(valor);
        
        ImprimirWhile(vueltas);
        ImprimirFor(vueltas);
    }
    private static void ImprimirWhile(int numvueltas)
    {
        int contador=0;
        while(contador<=numvueltas)
        {
            JOptionPane.showMessageDialog(null, "Numero de vueltas totales:"+numvueltas+"num.vuelta"+contador);
            contador++;
        }
    }
    private static void ImprimirFor(int numvueltas)
    {
        for(int contador=0; contador<=numvueltas; contador++)
        {
            JOptionPane.showMessageDialog(null,"numero de vueltas totales:"+numvueltas+"num.vueltas"+ contador);
        }
    }
}
