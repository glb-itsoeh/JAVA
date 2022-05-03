
package mx.edu.itsoeh;

import javax.swing.JOptionPane;


public class MetodoMayor {

   
    public static void main(String[] args) {
        
        double valorA=valor();
        double valorB=valor();
        double valorC=valor();
    
        Mayor(valorA,valorB,valorC);
    
    }
    private static double valor(){
        return Double.parseDouble(JOptionPane.showInputDialog("Introduce un valor"));
    }
    
    private static void Mayor(double a, double b, double c){
        if(a>b && a>c){
            imprimir(a);
        }
        else if (b>c && b>a){
            imprimir(b);
        }
        else if (c>a && c>b){
            imprimir(c);
        }
    }
    
    private static void imprimir(double d){
        JOptionPane.showMessageDialog(null, d);
    }
            
}
