package asesoria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Godìnez Lozano Brenda
 */
//Es una clase que hereda de la clase persona
//subclase de la clase persona

public class Empleado extends Persona{//de la clase persona
    //variables globales
   private double sueldoEmpleado;
   private String departamentoEmpledo;
   private String puestoEmpleado;
   //constructor
    public Empleado() {
        super();//los parentesis vacìos es que que queremos todas variables
        departamentoEmpledo="";
        puestoEmpleado="";
        sueldoEmpleado=0.0;    
        
    }
   

    public double getSueldoEmpleado() {
        return sueldoEmpleado;
    }

    public void setSueldoEmpleado(double sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }

    public String getDepartamentoEmpledo() {
        return departamentoEmpledo;
    }

    public void setDepartamentoEmpledo(String departamentoEmpledo) {
        this.departamentoEmpledo = departamentoEmpledo;
    }

    public String getPuestoEmpleado() {
        return puestoEmpleado;
    }

    public void setPuestoEmpleado(String puestoEmpleado) {
        this.puestoEmpleado = puestoEmpleado;
    }
   
    
}
