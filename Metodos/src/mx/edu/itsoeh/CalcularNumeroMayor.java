
package mx.edu.itsoeh;
import javax.swing.JOptionPane;



public class CalcularNumeroMayor {
    
    public static final String MENSAJE= "INGRESA UN VALOR"; 
    
    public static void main(String[] args) {
        
        
        int a=Integer.parseInt(JOptionPane.showInputDialog(MENSAJE+"  a"));
        int b=Integer.parseInt(JOptionPane.showInputDialog(MENSAJE+"  b"));
        int c=Integer.parseInt(JOptionPane.showInputDialog(MENSAJE+"  c"));
        int d=Integer.parseInt(JOptionPane.showInputDialog(MENSAJE+"  d"));
        
        Calcular(a, b,c,d);
       
    }
    private static void Calcular (int a, int b, int c, int d )
    {
        if(a>b && a>c && a>d )
        {
        JOptionPane.showMessageDialog(null,a +" es mayor ");
        }
        else if (b>a && b>c && b>d)
        {
            JOptionPane.showMessageDialog(null,b+ " es mayor ");
        }
        else if(c>a && c>b && c>d)
        {
            JOptionPane.showMessageDialog(null,c+" es mayor  ");
        }
        else if(d>a && d>b && d>c)
        {
            JOptionPane.showMessageDialog(null,d+" es mayor  ");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Son iguales  ");
        }
        
        
        
        
    }
    
}

