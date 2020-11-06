/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Tablas;

import static Finanzas.Principal.Item_Contratacion;
import static Finanzas.Principal.Item_D;
import static Finanzas.Principal.Item_P;
import static Finanzas.Principal.S_Contratacion;
import static Finanzas.Principal.S_Departamento;
import static Finanzas.Principal.S_Puesto;
import Finanzas_Clases.Empleado_Contratado;

/**
 *
 * @author Langas
 */
public class EmpleadoC_V extends javax.swing.JFrame {

    /**
     * Creates new form EmpleadoC_V
     */
    
    int x, y;
    
    public static String S_Contratacion = "Contratacion";
    public static String Item_Contratacion = "";
    
    public static String S_Puesto = "Puesto";
    public static String Item_P = "";
    
    public static String S_Departamento = "Departamento";
    public static String Item_D = "";
    
    public EmpleadoC_V() {
        initComponents();
        
        txt_id_EC.setVisible(false);
        jComboBox_CEC.setVisible(false);
        jComboBox_ECP.setVisible(false);
        jComboBox_ECD.setVisible(false);
        txt_SEC.setVisible(false);
        jLabel_CECC.setVisible(false);
        jLabel_ECPP.setVisible(false);
        jLabel_ECDD.setVisible(false);
        
        Empleado_Contratado empleado = new Empleado_Contratado (txt_id_EC, jLabel_CECC, jLabel_ECPP, jLabel_ECDD, txt_SEC, txt_BuscarEC, tbl_EC);
        empleado.Actualizar_Tabla();
        
        jComboBox_TablasEC.addItem(S_Contratacion);
        jComboBox_TablasEC.addItem(S_Puesto);
        jComboBox_TablasEC.addItem(S_Departamento);
        
        Item_Contratacion = jComboBox_TablasEC.getSelectedItem().toString();

        if (Item_Contratacion == S_Contratacion) {
            Contratacion_V C = new Contratacion_V();
            C.setVisible(true);
        }
        
        Item_P = jComboBox_TablasEC.getSelectedItem().toString();

        if (Item_P == S_Puesto) {
            Puesto_V puesto = new Puesto_V();
            puesto.setVisible(true);
        }
        
        Item_D = jComboBox_TablasEC.getSelectedItem().toString();

        if (Item_D == S_Departamento) {
            Departamento_V dep = new Departamento_V();
            dep.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Empleado_Contratado = new javax.swing.JPanel();
        jLabel_BuscarEC = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_BuscarEC = new javax.swing.JTextField();
        jScrollPane38 = new javax.swing.JScrollPane();
        tbl_EC = new javax.swing.JTable();
        Movimiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_id_EC = new javax.swing.JTextField();
        jComboBox_CEC = new javax.swing.JComboBox<>();
        jComboBox_ECP = new javax.swing.JComboBox<>();
        jComboBox_ECD = new javax.swing.JComboBox<>();
        txt_SEC = new javax.swing.JTextField();
        jLabel_CECC = new javax.swing.JLabel();
        jLabel_ECPP = new javax.swing.JLabel();
        jLabel_ECDD = new javax.swing.JLabel();
        jComboBox_TablasEC = new javax.swing.JComboBox<>();
        jLabel_Buscar_TablasEC = new javax.swing.JLabel();
        jLabel_Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Empleado_Contratado.setBackground(new java.awt.Color(28, 27, 33));
        Empleado_Contratado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Empleado_ContratadoMouseClicked(evt);
            }
        });
        Empleado_Contratado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_BuscarEC.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_BuscarEC.setText("Buscar");
        Empleado_Contratado.add(jLabel_BuscarEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 50, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar_D.png"))); // NOI18N
        Empleado_Contratado.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        txt_BuscarEC.setBackground(new java.awt.Color(40, 41, 46));
        txt_BuscarEC.setForeground(new java.awt.Color(153, 153, 153));
        txt_BuscarEC.setBorder(null);
        txt_BuscarEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarECActionPerformed(evt);
            }
        });
        txt_BuscarEC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_BuscarECKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarECKeyReleased(evt);
            }
        });
        Empleado_Contratado.add(txt_BuscarEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 240, 20));

        tbl_EC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_EC.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_EC.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_EC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ECMouseClicked(evt);
            }
        });
        jScrollPane38.setViewportView(tbl_EC);

        Empleado_Contratado.add(jScrollPane38, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 600, 190));

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
        Movimiento.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 20, 30));

        Empleado_Contratado.add(Movimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 40));

        txt_id_EC.setBackground(new java.awt.Color(40, 41, 46));
        txt_id_EC.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_EC.setBorder(null);
        txt_id_EC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_ECActionPerformed(evt);
            }
        });
        Empleado_Contratado.add(txt_id_EC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 140, 20));

        jComboBox_CEC.setBackground(new java.awt.Color(40, 41, 46));
        jComboBox_CEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_CECActionPerformed(evt);
            }
        });
        Empleado_Contratado.add(jComboBox_CEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 140, -1));

        jComboBox_ECP.setBackground(new java.awt.Color(40, 41, 46));
        jComboBox_ECP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ECPActionPerformed(evt);
            }
        });
        Empleado_Contratado.add(jComboBox_ECP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 140, -1));

        jComboBox_ECD.setBackground(new java.awt.Color(40, 41, 46));
        jComboBox_ECD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ECDActionPerformed(evt);
            }
        });
        Empleado_Contratado.add(jComboBox_ECD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 140, -1));

        txt_SEC.setBackground(new java.awt.Color(40, 41, 46));
        txt_SEC.setForeground(new java.awt.Color(153, 153, 153));
        txt_SEC.setBorder(null);
        txt_SEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SECActionPerformed(evt);
            }
        });
        Empleado_Contratado.add(txt_SEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 180, 20));

        jLabel_CECC.setForeground(new java.awt.Color(255, 255, 255));
        Empleado_Contratado.add(jLabel_CECC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 30, 20));

        jLabel_ECPP.setForeground(new java.awt.Color(255, 255, 255));
        Empleado_Contratado.add(jLabel_ECPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 30, 20));

        jLabel_ECDD.setForeground(new java.awt.Color(255, 255, 255));
        Empleado_Contratado.add(jLabel_ECDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 30, 20));

        jComboBox_TablasEC.setBackground(new java.awt.Color(40, 41, 46));
        jComboBox_TablasEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_TablasECActionPerformed(evt);
            }
        });
        Empleado_Contratado.add(jComboBox_TablasEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 170, -1));

        jLabel_Buscar_TablasEC.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Buscar_TablasEC.setText("Buscar");
        jLabel_Buscar_TablasEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Buscar_TablasECMouseClicked(evt);
            }
        });
        Empleado_Contratado.add(jLabel_Buscar_TablasEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, -1, -1));

        jLabel_Titulo.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Empleado Contratado");
        Empleado_Contratado.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 250, 40));

        getContentPane().add(Empleado_Contratado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Empleado_ContratadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Empleado_ContratadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Empleado_ContratadoMouseClicked

    private void txt_BuscarECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarECActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarECActionPerformed

    private void txt_BuscarECKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarECKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarECKeyPressed

    private void txt_BuscarECKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarECKeyReleased
        // TODO add your handling code here:
        Empleado_Contratado empleado = new Empleado_Contratado (txt_id_EC, jLabel_CECC, jLabel_ECPP, jLabel_ECDD, txt_SEC, txt_BuscarEC, tbl_EC);
        empleado.Buscar_ECE(txt_BuscarEC.getText());
    }//GEN-LAST:event_txt_BuscarECKeyReleased

    private void tbl_ECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ECMouseClicked
        // TODO add your handling code here:
        int Seleccion = tbl_EC.rowAtPoint(evt.getPoint());

        txt_id_EC.setText(String.valueOf(tbl_EC.getValueAt(Seleccion, 0)));
        jLabel_CECC.setText(String.valueOf(tbl_EC.getValueAt(Seleccion, 1)));
        jLabel_ECPP.setText(String.valueOf(tbl_EC.getValueAt(Seleccion, 2)));
        jLabel_ECDD.setText(String.valueOf(tbl_EC.getValueAt(Seleccion, 3)));
        txt_SEC.setText(String.valueOf(tbl_EC.getValueAt(Seleccion, 4)));

        Empleado_Contratado empleado = new Empleado_Contratado (txt_id_EC, jLabel_CECC, jLabel_ECPP, jLabel_ECDD, txt_SEC, txt_BuscarEC, tbl_EC);
        empleado.BuscarFila_EC("id_contratacion", "contratacion", "id_contratacion", jComboBox_CEC, jLabel_CECC);
        empleado.BuscarFila_EC("nombre_puesto", "puesto", "id_puesto", jComboBox_ECP, jLabel_ECPP);
        empleado.BuscarFila_EC("nombre_departamento", "departamento", "id_departamento", jComboBox_ECD, jLabel_ECDD);
    }//GEN-LAST:event_tbl_ECMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void MovimientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovimientoMouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_MovimientoMouseDragged

    private void MovimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovimientoMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_MovimientoMousePressed

    private void txt_id_ECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_ECActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_ECActionPerformed

    private void jComboBox_CECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_CECActionPerformed
        // TODO add your handling code here:
        Empleado_Contratado empleado = new Empleado_Contratado (txt_id_EC, jLabel_CECC, jLabel_ECPP, jLabel_ECDD, txt_SEC, txt_BuscarEC, tbl_EC);
        empleado.EncontrarID_CE("id_contratacion", "contratacion", "id_contratacion", jComboBox_CEC, jLabel_CECC);
        //60,63,65
    }//GEN-LAST:event_jComboBox_CECActionPerformed

    private void jComboBox_ECPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ECPActionPerformed
        // TODO add your handling code here:
        Empleado_Contratado empleado = new Empleado_Contratado (txt_id_EC, jLabel_CECC, jLabel_ECPP, jLabel_ECDD, txt_SEC, txt_BuscarEC, tbl_EC);
        empleado.EncontrarID_CE("id_puesto", "puesto", "nombre_puesto", jComboBox_ECP, jLabel_ECPP);
    }//GEN-LAST:event_jComboBox_ECPActionPerformed

    private void jComboBox_ECDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ECDActionPerformed
        // TODO add your handling code here:
        Empleado_Contratado empleado = new Empleado_Contratado (txt_id_EC, jLabel_CECC, jLabel_ECPP, jLabel_ECDD, txt_SEC, txt_BuscarEC, tbl_EC);
        empleado.EncontrarID_CE("id_departamento", "departamento", "nombre_departamento", jComboBox_ECD, jLabel_ECDD);
    }//GEN-LAST:event_jComboBox_ECDActionPerformed

    private void txt_SECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SECActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SECActionPerformed

    private void jComboBox_TablasECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_TablasECActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_TablasECActionPerformed

    private void jLabel_Buscar_TablasECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Buscar_TablasECMouseClicked
        // TODO add your handling code here:
        Item_Contratacion = jComboBox_TablasEC.getSelectedItem().toString();

        if (Item_Contratacion == S_Contratacion) {
            Contratacion_V empleado = new Contratacion_V();
            empleado.setVisible(true);
        }

        Item_P = jComboBox_TablasEC.getSelectedItem().toString();

        if (Item_P == S_Puesto) {
            Puesto_V puesto = new Puesto_V();
            puesto.setVisible(true);
        }

        Item_D = jComboBox_TablasEC.getSelectedItem().toString();

        if (Item_D == S_Departamento) {
            Departamento_V dep = new Departamento_V();
            dep.setVisible(true);
        }

    }//GEN-LAST:event_jLabel_Buscar_TablasECMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmpleadoC_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoC_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoC_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoC_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadoC_V().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Empleado_Contratado;
    private javax.swing.JPanel Movimiento;
    private javax.swing.JComboBox<String> jComboBox_CEC;
    private javax.swing.JComboBox<String> jComboBox_ECD;
    private javax.swing.JComboBox<String> jComboBox_ECP;
    private javax.swing.JComboBox<String> jComboBox_TablasEC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel_BuscarEC;
    private javax.swing.JLabel jLabel_Buscar_TablasEC;
    private javax.swing.JLabel jLabel_CECC;
    private javax.swing.JLabel jLabel_ECDD;
    private javax.swing.JLabel jLabel_ECPP;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JTable tbl_EC;
    private javax.swing.JTextField txt_BuscarEC;
    private javax.swing.JTextField txt_SEC;
    private javax.swing.JTextField txt_id_EC;
    // End of variables declaration//GEN-END:variables
}