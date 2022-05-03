
package com.gui.estudiantecompleto;

import com.dao.estudiantecompleto.EstudianteDAO;
import com.dato.estudiantecompleto.Estudiante;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class Frm_ListaEstudiante extends javax.swing.JFrame {
    
    EstudianteDAO estudianteDAO = new EstudianteDAO();
    Estudiante myestudiante = new Estudiante();
    Vector vecCabecera = new Vector();
    DefaultTableModel tblEstudiante;
    
    
 
    public Frm_ListaEstudiante() {
        initComponents();
        vecCabecera.addElement("Matricula");
        vecCabecera.addElement("Carrera");
        vecCabecera.addElement("Nombre");
        tblEstudiante = new DefaultTableModel(vecCabecera,0);
        tbl_ListaEstudiante.setModel(tblEstudiante);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ListaEstudiante = new javax.swing.JTable();
        txa_Lista = new javax.swing.JButton();
        btn_Salir_Lista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbl_ListaEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_ListaEstudiante);

        txa_Lista.setText("Listar Catalogo de Estudiantes ");
        txa_Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txa_ListaActionPerformed(evt);
            }
        });

        btn_Salir_Lista.setText("Sair");
        btn_Salir_Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salir_ListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(txa_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Salir_Lista))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txa_Lista)
                    .addComponent(btn_Salir_Lista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txa_ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txa_ListaActionPerformed
        tbl_ListaEstudiante.setModel(estudianteDAO.listar());
    }//GEN-LAST:event_txa_ListaActionPerformed

    private void btn_Salir_ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salir_ListaActionPerformed
        dispose();
    }//GEN-LAST:event_btn_Salir_ListaActionPerformed


    public static void main(String args[]) {
      
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_ListaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_ListaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_ListaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_ListaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_ListaEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Salir_Lista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_ListaEstudiante;
    private javax.swing.JButton txa_Lista;
    // End of variables declaration//GEN-END:variables
}
