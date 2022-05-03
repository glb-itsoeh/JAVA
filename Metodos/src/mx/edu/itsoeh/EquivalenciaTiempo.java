
package mx.edu.itsoeh;
//equivalecia
import javax.swing.JOptionPane;



public class EquivalenciaTiempo {
    public static final String MENSAJE= "Ingrese el tiempo a calcular";

    public static void main(String[] args) {
        
        double dias= Double.parseDouble(JOptionPane.showInputDialog("Ingrese un dias a calcular"));
        
        JOptionPane.showMessageDialog(null , "Equivalencia en semana: "+ Semana(dias));
        JOptionPane.showMessageDialog(null , "Equivalencia en mes: "+ Mes (dias));
        JOptionPane.showMessageDialog(null ,"Equivalencia en año: "+ Año (dias));
        
      
    }
    public static double Semana(double dias)
    {
        return dias/ 7;
    }
    public static double Mes (double dias)
    {
        
        return dias/30;
        
    }
   public static double Año (double dias)
   {
        return dias/360;
   }

    
}
