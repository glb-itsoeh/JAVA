
package com.dao.estudiantecompleto;

import com.dato.estudiantecompleto.Estudiante;
import com.interfarce.estudiantecompleto.InterfaceEstudiante;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class EstudianteDAO extends Estudiante implements InterfaceEstudiante
{
    Vector vectorEstduante = new Vector();//
    public EstudianteDAO() {//objetos vacìos
        super();
    }

    @Override
    public void Escribir(Estudiante myestudiante) { //Escribir
        vectorEstduante.addElement(myestudiante);//agregar un elemento que diga el usuario
  
    }

    @Override
    public DefaultTableModel listar() {
        Vector vectorListaEstudiante = new Vector();
        vectorListaEstudiante.addElement("matricula");
        vectorListaEstudiante.addElement("carrera");
        vectorListaEstudiante.addElement("nombre");
        DefaultTableModel tblEstudiante = new DefaultTableModel(vectorListaEstudiante,0);
        
        try {
            FileReader fileLeeEstudiante = new FileReader("estudiante.txt");  //cargar archivo
            BufferedReader bufReadEstudiante = new BufferedReader(fileLeeEstudiante);
            String dato;
            while ((dato = bufReadEstudiante.readLine()) != null) {
                StringTokenizer linea = new StringTokenizer(dato,",");//crear lineas
                Vector lineaEstudiante = new Vector();
                while (linea.hasMoreTokens()) {                    
                    lineaEstudiante.addElement(linea.nextToken());
                }
            tblEstudiante.addRow(lineaEstudiante);    
            }
        } catch (java.io.IOException ioexlista) {
            JOptionPane.showMessageDialog(null, ioexlista.toString());
        }
        return tblEstudiante;    
    }
    
    public void GuardarArchivo(Estudiante estudiante){
        try {
            FileWriter fileEscribeEstudiante = new FileWriter("estudiante.txt",true);
            BufferedWriter  bufWritEscribeEstudiante = new BufferedWriter(fileEscribeEstudiante);
            PrintWriter printWritEscribeEstudiante = new PrintWriter(bufWritEscribeEstudiante);//escribir dentro del fichero en d.duro
            
            printWritEscribeEstudiante.print(estudiante.getMatricula().toString());
            printWritEscribeEstudiante.print("," + estudiante.getCarrera().toString());
            printWritEscribeEstudiante.println("," + estudiante.getNombre().toString());
            printWritEscribeEstudiante.close();//cerrar archivo
            
        } catch (java.io.IOException ioexarchivo) {
            JOptionPane.showMessageDialog(null, ioexarchivo.toString());
        }
    } 
}
