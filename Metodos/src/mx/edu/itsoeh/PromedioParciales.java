
package mx.edu.itsoeh;

import javax.swing.JOptionPane;


public class PromedioParciales {
    
    private static final String MENSAJE="INGRESE CALIFICACION";
    private static final String PARUNO="  1ER PARCIAL";
    private static final String PARDOS="  2DO PARCIAL";
    private static final String PARTRES="  3ER PARCIAL";
     
     

    
    public static void main(String[] args) {
        double cal1= Leer (MENSAJE + PARUNO);
        double cal2= Leer (MENSAJE + PARUNO);
        double cal3= Leer (MENSAJE + PARUNO);
        double cal4= Leer (MENSAJE + PARDOS);
        double cal5= Leer (MENSAJE + PARDOS);
        double cal6= Leer (MENSAJE + PARDOS);
        double cal7= Leer (MENSAJE + PARTRES);
        double cal8= Leer (MENSAJE + PARTRES);
        double cal9= Leer (MENSAJE + PARTRES);
        
        
    JOptionPane.showMessageDialog(null,Promedio(Promedio(cal1,cal2,cal3),Promedio(cal4,cal5,cal6),Promedio(cal7,cal8,cal9)));
        
    }
    private static double Leer (String mensaje)
    {
        return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
    }
    private static double Promedio (double calificacion1, double calificacion2, double calificacion3)
    {
        return ((calificacion1 + calificacion2 + calificacion3)/3);
    }
            
            
    
}
