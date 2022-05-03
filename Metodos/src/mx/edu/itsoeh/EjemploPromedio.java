
package mx.edu.itsoeh;

import javax.swing.JOptionPane;


public class EjemploPromedio {

    
    public static void main(String[] args) {
       
        double cal1=Double.parseDouble(JOptionPane.showInputDialog("INGRESA LA CALIFICAION DE 1 PARCIAL"+"\n"+"1er trabajo"));
        double cal2=Double.parseDouble(JOptionPane.showInputDialog("INGRESA LA CALIFICAION DE 1 PARCIAL"+"\n"+"2er trabajo"));
        double cal3=Double.parseDouble(JOptionPane.showInputDialog("INGRESA LA CALIFICAION DE 1 PARCIAL"+"\n"+"3er trabajo"));
        
        double cal4=Double.parseDouble(JOptionPane.showInputDialog("INGRESA LA CALIFICAION DE 2 PARCIAL"+"\n"+"1er trabajo"));
        double cal5=Double.parseDouble(JOptionPane.showInputDialog("INGRESA LA CALIFICAION DE 2 PARCIAL"+"\n"+"2er trabajo"));
        double cal6=Double.parseDouble(JOptionPane.showInputDialog("INGRESA LA CALIFICAION DE 2 PARCIAL"+"\n"+"3er trabajo"));
        
        double cal7=Double.parseDouble(JOptionPane.showInputDialog("INGRESA LA CALIFICAION DE 3 PARCIAL"+"\n"+"1er trabajo"));
        double cal8=Double.parseDouble(JOptionPane.showInputDialog("INGRESA LA CALIFICAION DE 4 PARCIAL"+"\n"+"2er trabajo"));
        double cal9=Double.parseDouble(JOptionPane.showInputDialog("INGRESA LA CALIFICAION DE 5 PARCIAL"+"\n"+"3er trabajo"));
        
        
        
        JOptionPane.showMessageDialog(null,"tu promedio final es:  "+Promedio(ParcialUno(cal1,cal2,cal3),ParcialDos(cal4,cal5,cal6),ParcialTres(cal7,cal8,cal9)));
    }
    private static double ParcialUno(double a, double b, double c)
    {
        return (a+b+c)/3;
    }
    private static double ParcialDos(double c, double d, double e)
    {
        return (c+d+e)/3;
    }
    private static double ParcialTres(double f, double g, double h)
    {
            return (f+g+h)/3;
    }
    private static double Promedio(double a, double b, double c)
    {
        return (a+b+c)/3;
    }        
}

