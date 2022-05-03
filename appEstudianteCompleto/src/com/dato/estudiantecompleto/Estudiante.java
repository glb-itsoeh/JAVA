package com.dato.estudiantecompleto;


public class Estudiante {
    private String matricula;
    private String carrera;
    private String nombre;

    public Estudiante() {//CONSTRUCTOR SIN PARAMETROS, MOMENTOS DE UTILIZAR OBJETOS VACIOS
    }

        
    public Estudiante(String matricula, String carrera, String nombre) {//CONSTRUCTOR CON PARAMETROS sino no funciona
        this.matricula = matricula;
        this.carrera = carrera;
        this.nombre = nombre;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getMatricula() {
        return matricula;
    }
    
    public String getCarrera() {
        return carrera;
    }

    public String getNombre() {
        return nombre;
    }
       
}
