/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Tablas;

import Finanzas_Clases.Experiencia_Laboral_Detallada;

/**
 *
 * @author Langas
 */
public class ExpLD_V extends javax.swing.JFrame {

    /**
     * Creates new form ExpLD
     */
    
    int x, y;
    public ExpLD_V() {
        initComponents();
        
        //AWTUtilities.setWindowOpacity();
        
        Experiencia_Laboral_Detallada ExpLD = new Experiencia_Laboral_Detallada(txt_id_ExpLD, txt_NombreExpLD, txt_Nombre_EmpresaExpLD, txt_Tiempo_InicioExpLD, txt_Tiempo_FinalizacionExpLD, txt_Buscar_ExpLD, tbl_ExpLD);
        ExpLD.Actualizar_Tabla();
        
        txt_id_ExpLD.setVisible(false);
        txt_NombreExpLD.setVisible(false);
        txt_Nombre_EmpresaExpLD.setVisible(false);
        txt_Tiempo_FinalizacionExpLD.setVisible(false);
        txt_Tiempo_InicioExpLD.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExpLD = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        tbl_ExpLD = new javax.swing.JTable();
        txt_Buscar_ExpLD = new javax.swing.JTextField();
        jLabel_Buscar_ExpLD = new javax.swing.JLabel();
        txt_id_ExpLD = new javax.swing.JTextField();
        txt_NombreExpLD = new javax.swing.JTextField();
        txt_Nombre_EmpresaExpLD = new javax.swing.JTextField();
        txt_Tiempo_FinalizacionExpLD = new javax.swing.JTextField();
        txt_Tiempo_InicioExpLD = new javax.swing.JTextField();
        jLabel_Titulo = new javax.swing.JLabel();
        Movimiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        icono_BuscarELD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExpLD.setBackground(new java.awt.Color(28, 27, 33));
        ExpLD.setEnabled(false);
        ExpLD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_ExpLD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_ExpLD.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_ExpLD.setSelectionBackground(new java.awt.Color(40, 41, 46));
        tbl_ExpLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ExpLDMouseClicked(evt);
            }
        });
        jScrollPane24.setViewportView(tbl_ExpLD);

        ExpLD.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 490, 190));

        txt_Buscar_ExpLD.setBackground(new java.awt.Color(40, 41, 46));
        txt_Buscar_ExpLD.setForeground(new java.awt.Color(153, 153, 153));
        txt_Buscar_ExpLD.setBorder(null);
        txt_Buscar_ExpLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Buscar_ExpLDActionPerformed(evt);
            }
        });
        txt_Buscar_ExpLD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Buscar_ExpLDKeyReleased(evt);
            }
        });
        ExpLD.add(txt_Buscar_ExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 290, 20));

        jLabel_Buscar_ExpLD.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Buscar_ExpLD.setText("Buscar");
        ExpLD.add(jLabel_Buscar_ExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        txt_id_ExpLD.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_ExpLD.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_ExpLD.setBorder(null);
        txt_id_ExpLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_ExpLDActionPerformed(evt);
            }
        });
        ExpLD.add(txt_id_ExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 190, 20));

        txt_NombreExpLD.setBackground(new java.awt.Color(231, 231, 231));
        txt_NombreExpLD.setForeground(new java.awt.Color(153, 153, 153));
        txt_NombreExpLD.setBorder(null);
        txt_NombreExpLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreExpLDActionPerformed(evt);
            }
        });
        ExpLD.add(txt_NombreExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 230, 20));

        txt_Nombre_EmpresaExpLD.setBackground(new java.awt.Color(231, 231, 231));
        txt_Nombre_EmpresaExpLD.setForeground(new java.awt.Color(153, 153, 153));
        txt_Nombre_EmpresaExpLD.setBorder(null);
        txt_Nombre_EmpresaExpLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nombre_EmpresaExpLDActionPerformed(evt);
            }
        });
        ExpLD.add(txt_Nombre_EmpresaExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 290, 20));

        txt_Tiempo_FinalizacionExpLD.setBackground(new java.awt.Color(231, 231, 231));
        txt_Tiempo_FinalizacionExpLD.setForeground(new java.awt.Color(153, 153, 153));
        txt_Tiempo_FinalizacionExpLD.setBorder(null);
        txt_Tiempo_FinalizacionExpLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Tiempo_FinalizacionExpLDActionPerformed(evt);
            }
        });
        ExpLD.add(txt_Tiempo_FinalizacionExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 320, 20));

        txt_Tiempo_InicioExpLD.setBackground(new java.awt.Color(231, 231, 231));
        txt_Tiempo_InicioExpLD.setForeground(new java.awt.Color(153, 153, 153));
        txt_Tiempo_InicioExpLD.setBorder(null);
        txt_Tiempo_InicioExpLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Tiempo_InicioExpLDActionPerformed(evt);
            }
        });
        ExpLD.add(txt_Tiempo_InicioExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 280, 20));

        jLabel_Titulo.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setText("Experiencia Laboral Detallada");
        ExpLD.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 280, 40));

        Movimiento.setBackground(new java.awt.Color(28, 27, 33));
        Movimiento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MovimientoMouseDragged(evt);
            }
        });
        Movimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MovimientoMousePressed(evt);
            }
        });
        Movimiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Movimiento.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 20, 30));

        ExpLD.add(Movimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 40));

        icono_BuscarELD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar_D.png"))); // NOI18N
        ExpLD.add(icono_BuscarELD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 20, 20));

        getContentPane().add(ExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 410));

        setBounds(0, 0, 578, 410);
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_ExpLDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ExpLDMouseClicked
        // TODO add your handling code here:
        int Seleccion = tbl_ExpLD.rowAtPoint(evt.getPoint());
        txt_id_ExpLD.setText(String.valueOf(tbl_ExpLD.getValueAt(Seleccion, 0)));
        txt_NombreExpLD.setText(String.valueOf(tbl_ExpLD.getValueAt(Seleccion, 1)));
        txt_Nombre_EmpresaExpLD.setText(String.valueOf(tbl_ExpLD.getValueAt(Seleccion, 2)));
        txt_Tiempo_InicioExpLD.setText(String.valueOf(tbl_ExpLD.getValueAt(Seleccion, 3)));
        txt_Tiempo_FinalizacionExpLD.setText(String.valueOf(tbl_ExpLD.getValueAt(Seleccion, 4)));
    }//GEN-LAST:event_tbl_ExpLDMouseClicked

    private void txt_Buscar_ExpLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Buscar_ExpLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_ExpLDActionPerformed

    private void txt_Buscar_ExpLDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Buscar_ExpLDKeyReleased

        // TODO add your handling code here:
        Experiencia_Laboral_Detallada ExpLD = new Experiencia_Laboral_Detallada(txt_id_ExpLD, txt_NombreExpLD, txt_Nombre_EmpresaExpLD, txt_Tiempo_InicioExpLD, txt_Tiempo_FinalizacionExpLD, txt_Buscar_ExpLD, tbl_ExpLD);
        ExpLD.Buscar_ExpLDF(txt_Buscar_ExpLD.getText());
    }//GEN-LAST:event_txt_Buscar_ExpLDKeyReleased

    private void txt_id_ExpLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_ExpLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_ExpLDActionPerformed

    private void txt_NombreExpLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreExpLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreExpLDActionPerformed

    private void txt_Nombre_EmpresaExpLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nombre_EmpresaExpLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombre_EmpresaExpLDActionPerformed

    private void txt_Tiempo_FinalizacionExpLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Tiempo_FinalizacionExpLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Tiempo_FinalizacionExpLDActionPerformed

    private void txt_Tiempo_InicioExpLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Tiempo_InicioExpLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Tiempo_InicioExpLDActionPerformed

    private void MovimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovimientoMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_MovimientoMousePressed

    private void MovimientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovimientoMouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_MovimientoMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExpLD_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExpLD_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExpLD_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExpLD_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExpLD_V().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ExpLD;
    private javax.swing.JPanel Movimiento;
    private javax.swing.JLabel icono_BuscarELD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Buscar_ExpLD;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JTable tbl_ExpLD;
    private javax.swing.JTextField txt_Buscar_ExpLD;
    private javax.swing.JTextField txt_NombreExpLD;
    private javax.swing.JTextField txt_Nombre_EmpresaExpLD;
    private javax.swing.JTextField txt_Tiempo_FinalizacionExpLD;
    private javax.swing.JTextField txt_Tiempo_InicioExpLD;
    private javax.swing.JTextField txt_id_ExpLD;
    // End of variables declaration//GEN-END:variables
}
