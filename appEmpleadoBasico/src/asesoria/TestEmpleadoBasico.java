/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asesoria;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class TestEmpleadoBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int NoEmpleadoTotal=Integer.parseInt(JOptionPane.showInputDialog("Ingresa nùmero total de empleado"));
        Empleado EmpleadoArray[]=new Empleado[NoEmpleadoTotal];//nuevo empleado que el usuari diga
        
        for (int posArray = 0; posArray < EmpleadoArray.length; posArray++) {
            String nomEmpl=JOptionPane.showInputDialog("Ingresa el nombre del empleado: "+"("+posArray+")");
            int edadEmpl=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del empleado: "+"("+posArray+")"));
            String dirEmpl=JOptionPane.showInputDialog("Ingresa la dirección del empleado: "+"("+posArray+")");
            String depEmpl=JOptionPane.showInputDialog("Ingresa el departamento del empleado: "+"("+posArray+")");
            String puesEmpl=JOptionPane.showInputDialog("Ingresa el puesto del empleado: "+"("+posArray+")"+"("+posArray+")");
            double suelEmpl=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el suedlo del empleado"+"("+posArray+")"));
            
            
            
         EmpleadoArray[posArray]=new Empleado();
         EmpleadoArray[posArray].setNombrePersona(nomEmpl);
         EmpleadoArray[posArray].setEdadPersona(edadEmpl);
         EmpleadoArray[posArray].setDireccionPersona(dirEmpl);
         EmpleadoArray[posArray].setDepartamentoEmpledo(depEmpl);
         EmpleadoArray[posArray].setPuestoEmpleado(puesEmpl);
         EmpleadoArray[posArray].setSueldoEmpleado(suelEmpl);
         
         
        }
        for (int posArray = 0; posArray < EmpleadoArray.length; posArray++) {
            JOptionPane.showMessageDialog(null, "Nombre del empleado: "+EmpleadoArray[posArray].getNombrePersona()+ 
                    "\n Edad del empleado:"+EmpleadoArray[posArray].getEdadPersona()+
                    "\n Dirección del empleado"+EmpleadoArray[posArray].getDireccionPersona()+
                    "\n Departamento del empleado"+EmpleadoArray[posArray].getDepartamentoEmpledo()+
                    "\n Puesto del empleado"+EmpleadoArray[posArray].getPuestoEmpleado()+
                    "\n Sueldo del empleado"+EmpleadoArray[posArray].getSueldoEmpleado(),
                    "Datos del empleado("+posArray+")",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
