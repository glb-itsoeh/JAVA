
package mx.edu.itsoeh;
//dado un valor introducido por el usuario, determinar su factorial

import javax.swing.JOptionPane;


public class ProblemaWhile {

    
    public static void main(String[] args) {
        
        int mensaje= Integer.parseInt(JOptionPane.showInputDialog("Introuce un valor a calcular"));
      Calcular(mensaje);
        
    }
    private static void Calcular(int a){
        int contador=0;
        int multiplicacion=1;
        while(contador<=a){
            multiplicacion=multiplicacion*a;
            a--;
            contador++;
            
        }
        
            JOptionPane.showMessageDialog(null,multiplicacion);
        
    }//checar
    
}
