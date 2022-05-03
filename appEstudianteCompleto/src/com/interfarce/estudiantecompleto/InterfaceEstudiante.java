
package com.interfarce.estudiantecompleto;

import com.dato.estudiantecompleto.Estudiante;
import javax.swing.table.DefaultTableModel;

public interface InterfaceEstudiante {
    public void Escribir(Estudiante estudiante);//no se va a activar hasta que la interfaz diga que se active
    public DefaultTableModel listar();   
}
