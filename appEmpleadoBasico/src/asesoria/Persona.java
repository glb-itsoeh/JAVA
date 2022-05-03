package asesoria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
//Definir la estructura completa en una aplicacion en java desde el inicio
public class Persona {
    
   //variables globales
    private String nombrePersona;
    private String direccionPersona;
    private int edadPersona;//se va a heredar
    
    //constructor: permite inicializar

    public Persona() {
        nombrePersona="";
        edadPersona=0;
        direccionPersona="";
    }
    //bloque setter permite modificar y getter para obtener

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getDireccionPersona() {
        return direccionPersona;
    }

    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }
    
}
