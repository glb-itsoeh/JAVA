
package mx.edu.itsoeh;
//desarrollar un algoritmo que realice n operaciones de sumar, 2 valores introducidos por el usuario.

import javax.swing.JOptionPane;


public class MetodoParametrosOperaciones {
    private static final String MENSAJE_SUMAS="CUANTAS SUMAS DESEAS REALIZAR";
    private static final String MENSAJE_A= "INGRESA UN VALOR A";
    private static final String MENSAJE_B="INGRESA UN VALOR B";
    
    
    
   
    public static void main(String[] args) 
    {
        int vueltas=Integer.parseInt(JOptionPane.showInputDialog(MENSAJE_SUMAS));
        String c= JOptionPane.showInputDialog(MENSAJE_A);
        String j=JOptionPane.showInputDialog(MENSAJE_B);
        
        DarVueltas(vueltas, c, j);
    }
    private static void Imprimir (double res)
    {
        JOptionPane.showMessageDialog(null,res);
    }
    private static double Sumar(String valorUno, String valorDos)
    {
       
        double primeraconversion=Double.parseDouble(valorUno);
        double segundaconversion=Double.parseDouble(valorDos);
        
        return primeraconversion+segundaconversion;
        
    }
    private static void DarVueltas(int vueltas, String variableUno, String variableDos )
    {
        for(int c=1; c<=vueltas; c++)
        {
        JOptionPane.showMessageDialog(null,"la suma es:"+Sumar (variableUno, variableDos));
        JOptionPane.showMessageDialog(null,"la resta es:"+Restar(variableUno, variableDos) );
        JOptionPane.showMessageDialog(null,"la multiplicacion es:"+ Multiplicar(variableUno, variableDos) );
        JOptionPane.showMessageDialog(null,"la division es:"+Dividir (variableUno, variableDos) );
        JOptionPane.showMessageDialog(null,"la potencia es:"+ Potencia (variableUno, variableDos) );
        JOptionPane.showMessageDialog(null,"la raiz es:"+Raiz (variableUno, variableDos) );
        }
    }
    private static double Restar(String a, String b)
    {
        double conv1 = Double.parseDouble(a);
        double conv2= Double.parseDouble(b);
        
        return conv1-conv2;
        
    }
    private static double Multiplicar (String c, String d)
    {
        double valor1 = Double.parseDouble(c);
        double valor2= Double.parseDouble(d);
        
        return (valor1*valor2);
    }
    private static double Dividir(String e, String f)
    {
        double uno=Double.parseDouble(e);
        double dos=Double.parseDouble(e);
        
        return (uno/dos);    
    }
    private static double Potencia(String g,String h)
    {
        double vuno= Double.parseDouble(g);
        double vdos= Double.parseDouble(h);
        
        return Math.pow(vdos, vdos);
    }
    private static double Raiz(String g,String h)
    {
        double vuno= Double.parseDouble(g);
        double vdos= Double.parseDouble(h);
        
        return Math.sqrt(vuno)+(Math.sqrt(vdos));
        
    }
            
    
}
