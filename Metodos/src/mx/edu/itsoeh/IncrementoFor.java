
package mx.edu.itsoeh;
//dado un nummero n determinado por el usuario, incrementar n veces un variable en 5

import javax.swing.JOptionPane;



public class IncrementoFor {

   
    public static void main(String[] args) {
        int numero=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
        CicloFor(numero);
   
    }
    private static void CicloFor(int a){
        int numero=0;
        for(int x=0; x<a; x++){
            numero= numero+5;
            
            Imprimir(numero);
        }
        
    }
    private static void Imprimir(int b){
        JOptionPane.showMessageDialog(null, b);
    }
    
}
