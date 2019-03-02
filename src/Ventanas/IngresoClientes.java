
package Ventanas;


public class IngresoClientes extends javax.swing.JFrame {

    
    public IngresoClientes() {
        initComponents();
        limpiar();
        bloquear();
    }

    void limpiar(){
    txt_Nom.setText("");
    txt_ape.setText("");
    txt_dir.setText("");
    txt_mail.setText("");
    txt_tel.setText("");
    txt_cel.setText("");
    txt_edad.setText("");
    txt_alt.setText("");
    txt_peso.setText("");
    txt_obs.setText("");
    cb_apto.setText("");
    rbtn_hom.setText("");
    rbtn_muj.setText("");
    ftx_fecha.setText("");
        }
    void bloquear(){
    txt_Nom.setEnabled(false);
    txt_ape.setEnabled(false);
    txt_dir.setEnabled(false);
    txt_mail.setEnabled(false);
    txt_tel.setEnabled(false);
    txt_cel.setEnabled(false);
    txt_edad.setEnabled(false);
    txt_alt.setEnabled(false);
    txt_peso.setEnabled(false);
    txt_obs.setEnabled(false);
    cb_apto.setEnabled(false);
    rbtn_hom.setEnabled(false);
    rbtn_muj.setEnabled(false);
    ftx_fecha.setEnabled(false);
    BTN_new.setEnabled(true);
    btn_guardar.setEnabled(false);
    btn_cancelar.setEnabled(false);
            
    }
    
    void desbloquear(){
    txt_Nom.setEnabled(true);
    txt_ape.setEnabled(true);
    txt_dir.setEnabled(true);
    txt_mail.setEnabled(true);
    txt_tel.setEnabled(true);
    txt_cel.setEnabled(true);
    txt_edad.setEnabled(true);
    txt_alt.setEnabled(true);
    txt_peso.setEnabled(true);
    txt_obs.setEnabled(true);
    cb_apto.setEnabled(true);
    rbtn_hom.setEnabled(true);
    rbtn_muj.setEnabled(true);
    ftx_fecha.setEnabled(true);
    BTN_new.setEnabled(false);
    btn_guardar.setEnabled(true);
    btn_cancelar.setEnabled(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNom = new javax.swing.JLabel();
        jLabelApe = new javax.swing.JLabel();
        jLabelDir = new javax.swing.JLabel();
        jLabelMail = new javax.swing.JLabel();
        txt_Nom = new javax.swing.JTextField();
        jLabelTel = new javax.swing.JLabel();
        jLabelCel = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelAlt = new javax.swing.JLabel();
        jLabelPeso = new javax.swing.JLabel();
        jLabelApto = new javax.swing.JLabel();
        jLabelGen = new javax.swing.JLabel();
        jLabelFdi = new javax.swing.JLabel();
        jLabelObs = new javax.swing.JLabel();
        txt_ape = new javax.swing.JTextField();
        txt_dir = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        txt_cel = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        txt_alt = new javax.swing.JTextField();
        txt_peso = new javax.swing.JTextField();
        cb_apto = new javax.swing.JCheckBox();
        rbtn_hom = new javax.swing.JRadioButton();
        rbtn_muj = new javax.swing.JRadioButton();
        ftx_fecha = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_obs = new javax.swing.JTextArea();
        BTN_new = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelmitre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNom.setForeground(new java.awt.Color(51, 255, 0));
        jLabelNom.setText("NOMBRE: ");
        getContentPane().add(jLabelNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 20));

        jLabelApe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelApe.setForeground(new java.awt.Color(51, 255, 0));
        jLabelApe.setText("APELLIDOS:");
        getContentPane().add(jLabelApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabelDir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDir.setForeground(new java.awt.Color(51, 255, 51));
        jLabelDir.setText("DIRECCION:");
        getContentPane().add(jLabelDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabelMail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMail.setForeground(new java.awt.Color(51, 255, 0));
        jLabelMail.setText("EMAIL:");
        getContentPane().add(jLabelMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txt_Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 280, -1));

        jLabelTel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTel.setForeground(new java.awt.Color(51, 255, 0));
        jLabelTel.setText("TELEFONO:");
        getContentPane().add(jLabelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabelCel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCel.setForeground(new java.awt.Color(51, 255, 0));
        jLabelCel.setText("CELULAR:");
        getContentPane().add(jLabelCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabelEdad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEdad.setForeground(new java.awt.Color(51, 255, 0));
        jLabelEdad.setText("EDAD:");
        getContentPane().add(jLabelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabelAlt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAlt.setForeground(new java.awt.Color(51, 255, 0));
        jLabelAlt.setText("ALTURA:");
        getContentPane().add(jLabelAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabelPeso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPeso.setForeground(new java.awt.Color(51, 255, 0));
        jLabelPeso.setText("PESO:");
        getContentPane().add(jLabelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabelApto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelApto.setForeground(new java.awt.Color(51, 255, 0));
        jLabelApto.setText("APTO FISICO:");
        getContentPane().add(jLabelApto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabelGen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelGen.setForeground(new java.awt.Color(51, 255, 0));
        jLabelGen.setText("GENERO:");
        getContentPane().add(jLabelGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabelFdi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelFdi.setForeground(new java.awt.Color(51, 255, 0));
        jLabelFdi.setText("FECHA DE INGRESO:");
        getContentPane().add(jLabelFdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabelObs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelObs.setForeground(new java.awt.Color(51, 255, 0));
        jLabelObs.setText("OBSERVACIONES:");
        getContentPane().add(jLabelObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        txt_ape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apeActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ape, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 280, -1));

        txt_dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dirActionPerformed(evt);
            }
        });
        getContentPane().add(txt_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 280, -1));

        txt_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 280, -1));

        txt_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 280, -1));

        txt_cel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_celActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 280, -1));

        txt_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_edadActionPerformed(evt);
            }
        });
        getContentPane().add(txt_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 50, -1));

        txt_alt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_altActionPerformed(evt);
            }
        });
        getContentPane().add(txt_alt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 50, -1));

        txt_peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 50, -1));

        cb_apto.setText("si!");
        cb_apto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_aptoActionPerformed(evt);
            }
        });
        getContentPane().add(cb_apto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        rbtn_hom.setText("H");
        rbtn_hom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_homActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_hom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        rbtn_muj.setText("M");
        rbtn_muj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_mujActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_muj, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        ftx_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftx_fechaActionPerformed(evt);
            }
        });
        getContentPane().add(ftx_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 110, -1));

        txt_obs.setColumns(20);
        txt_obs.setRows(5);
        jScrollPane1.setViewportView(txt_obs);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 420, -1));

        BTN_new.setText("NUEVO");
        BTN_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_newActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 110, 30));

        btn_guardar.setText("GUARDAR");
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 110, 30));

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 110, 30));

        btn_salir.setText("SALIR");
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 110, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setText("H");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 20, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setText("M");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 20, 20));

        jLabelmitre.setForeground(new java.awt.Color(51, 255, 0));
        jLabelmitre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMG-20190220-WA0136.jpg"))); // NOI18N
        getContentPane().add(jLabelmitre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 611));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomActionPerformed
txt_Nom.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomActionPerformed

    private void txt_apeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apeActionPerformed
      txt_ape.transferFocus();  // TODO add your handling code here:
    }//GEN-LAST:event_txt_apeActionPerformed

    private void txt_altActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_altActionPerformed
     txt_alt.transferFocus();   // TODO add your handling code here:
    }//GEN-LAST:event_txt_altActionPerformed

    private void txt_pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesoActionPerformed
     txt_peso.transferFocus();   // TODO add your handling code here:
    }//GEN-LAST:event_txt_pesoActionPerformed

    private void BTN_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_newActionPerformed
    desbloquear();
    txt_Nom.requestFocus();
    }//GEN-LAST:event_BTN_newActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
    limpiar();
    bloquear();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_dirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dirActionPerformed
     txt_dir.transferFocus();   // TODO add your handling code here:
    }//GEN-LAST:event_txt_dirActionPerformed

    private void txt_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mailActionPerformed
txt_mail.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mailActionPerformed

    private void txt_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telActionPerformed
txt_tel.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telActionPerformed

    private void txt_celActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_celActionPerformed
txt_cel.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_celActionPerformed

    private void txt_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_edadActionPerformed
txt_edad.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edadActionPerformed

    private void cb_aptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_aptoActionPerformed
cb_apto.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_cb_aptoActionPerformed

    private void rbtn_homActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_homActionPerformed
     rbtn_hom.transferFocus();   // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_homActionPerformed

    private void rbtn_mujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_mujActionPerformed
      rbtn_muj.transferFocus();  // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_mujActionPerformed

    private void ftx_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftx_fechaActionPerformed
       ftx_fecha.transferFocus(); // TODO add your handling code here:
    }//GEN-LAST:event_ftx_fechaActionPerformed

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
            java.util.logging.Logger.getLogger(IngresoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_new;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JCheckBox cb_apto;
    private javax.swing.JFormattedTextField ftx_fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAlt;
    private javax.swing.JLabel jLabelApe;
    private javax.swing.JLabel jLabelApto;
    private javax.swing.JLabel jLabelCel;
    private javax.swing.JLabel jLabelDir;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelFdi;
    private javax.swing.JLabel jLabelGen;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelObs;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JLabel jLabelmitre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtn_hom;
    private javax.swing.JRadioButton rbtn_muj;
    private javax.swing.JTextField txt_Nom;
    private javax.swing.JTextField txt_alt;
    private javax.swing.JTextField txt_ape;
    private javax.swing.JTextField txt_cel;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextArea txt_obs;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
