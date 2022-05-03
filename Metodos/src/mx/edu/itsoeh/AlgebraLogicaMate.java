
package mx.edu.itsoeh;

import javax.swing.JOptionPane;


public class AlgebraLogicaMate {
  
    public static void main(String[] args) {
       
            double a=Double.parseDouble(JOptionPane.showInputDialog("Ingresa calificacion 1er parcial(algebra)"));
            double b=Double.parseDouble(JOptionPane.showInputDialog("Ingresa calificacion 2er parcial(algebra)"));
            double c=Double.parseDouble(JOptionPane.showInputDialog("Ingresa calificacion 3er parcial(algebra)"));
            
            double d=Double.parseDouble(JOptionPane.showInputDialog("Ingresa calificacion 1er parcial(logica)"));
            double e=Double.parseDouble(JOptionPane.showInputDialog("Ingresa calificacion 2er parcial(logica)"));
            double f=Double.parseDouble(JOptionPane.showInputDialog("Ingresa calificacion 3er parcial(logica)"));
            
            double g=Double.parseDouble(JOptionPane.showInputDialog("Ingresa calificacion 1er parcial(mate)"));
            double h=Double.parseDouble(JOptionPane.showInputDialog("Ingresa calificacion 2er parcial(mate)"));
            double i=Double.parseDouble(JOptionPane.showInputDialog("Ingresa calificacion 3er parcial(mate)"));
        
        
        Promedio (Algebra (a,b,c) ,Logica (d,e,f), Mate (g,h,i));
        
        
         
    }
    public static double Algebra(double a, double b, double c)//regesar un valor return operacion;
    {
     return (a+b+c)/3;
    }
    public static double Logica(double d, double e, double f)
    {
        return (d+e+f)/3;
    }
    public static double Mate(double g, double h, double i)
    {
        return (g+h+i)/3;
    }
    public static void Promedio (double algebra, double logica, double mate)//de acuerdo a los metodos
    {
     JOptionPane.showMessageDialog(null,"promedio de algebra "+algebra);
     JOptionPane.showMessageDialog(null,"promedio de logica "+logica);
     JOptionPane.showMessageDialog(null,"promedio de matematicas "+mate);
        
     JOptionPane.showMessageDialog(null, "el promedio final es: "+(algebra+logica+mate)/3);
    }
}
 