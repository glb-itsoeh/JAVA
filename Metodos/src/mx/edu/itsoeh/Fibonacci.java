
package mx.edu.itsoeh;

import javax.swing.JOptionPane;
//problema: algoritmo que calcule n cantidad de digitos de la serie Fibonacci

public class Fibonacci {

   
    public static void main(String[] args) {
        int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingresa valor a calcular"));
        
        Fi(valor);//llamada de metodo
        
        
    }
    private static void Fi(int a)//valor donde se guarda el valor que ingresa el usuario
    {
        int b = 0;//inicia en 0 la serie
        int c = 1;//despues 1 asi comienza
        int res;//resulatdo de sumar 0+1= 1
        for(int i=0; i<a; i++)//es el ciclo es el que controla nadamas, se declara int i, en este caso
        {
            System.out.println(b);
            
            res=(b+c);
            b=c;
            c=res;
            
            
            
        }
    }
    
}
