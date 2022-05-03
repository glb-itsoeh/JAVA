
package mx.edu.itsoeh;

import javax.swing.JOptionPane;


public class PerimetroTriangulos {
    private static final String MENSAJE = "INGRESE UN VALOR ";
    private static final String MENSAJE1 = " lado a";
    private static final String MENSAJE2 = " lado b";
    private static final String MENSAJE3 = " lado c";
    

    
    public static void main(String[] args) {
        
        double ladoUno=Double.parseDouble(JOptionPane.showInputDialog(MENSAJE+MENSAJE1));
        double ladoDos=Double.parseDouble(JOptionPane.showInputDialog(MENSAJE+MENSAJE2));
        double ladoTres=Double.parseDouble(JOptionPane.showInputDialog(MENSAJE+MENSAJE3));
        
        
        
        if (ladoUno>0 && ladoUno<10 && ladoDos>0 && ladoDos<10 && ladoTres>0 && ladoTres<10)
        {
            if(ladoUno == ladoDos || ladoDos == ladoTres)
            {
                JOptionPane.showMessageDialog(null," Isosceles  "+ Isosceles(ladoDos,ladoDos,ladoTres));
            }
            if (ladoUno != ladoDos && ladoDos!=ladoTres)
            {
                JOptionPane.showMessageDialog(null, "escaleno  "+ Escaleno(ladoUno, ladoDos,ladoTres));
            }
        }
        
        if (ladoUno>0 && ladoUno<10 && ladoDos>0 && ladoDos<10 && ladoTres == 0)
        {
            JOptionPane.showMessageDialog(null, "Rectangulo  "+ Rectangulo(ladoUno,ladoDos));
            
        }
    }//los metodos van afuera de la clase main
            
        private static double Isosceles(double a, double b, double c )
                
        {
         return 2*(a+b);   
        }
        
        private static double Escaleno (double  a, double b, double c)//siempre inician con llaves
        {
          return  (a+b+c);
        }
        private static double Rectangulo(double a, double b)
        {
            double A= Math.pow(a, 2);
            double B= Math.pow(b, 2);
            double C= Math.sqrt((A+B));
            return A+B+C;
        }
}//es la general
         
        
    

    

