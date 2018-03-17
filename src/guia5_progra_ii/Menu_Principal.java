
package guia5_progra_ii;


public class Menu_Principal extends javax.swing.JFrame {

  
    public Menu_Principal() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Guia1 = new javax.swing.JButton();
        Guia2 = new javax.swing.JButton();
        Guia3 = new javax.swing.JButton();
        Guia4 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        preguntas2 = new javax.swing.JButton();
        preguntas1 = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("MENU DE APLICACIONES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 10, 262, 33);

        Guia1.setFont(new java.awt.Font("MV Boli", 0, 20)); // NOI18N
        Guia1.setText("APP GUIA 1");
        Guia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guia1ActionPerformed(evt);
            }
        });
        getContentPane().add(Guia1);
        Guia1.setBounds(120, 60, 190, 40);

        Guia2.setFont(new java.awt.Font("MV Boli", 0, 20)); // NOI18N
        Guia2.setText("APP GUIA 2");
        Guia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guia2ActionPerformed(evt);
            }
        });
        getContentPane().add(Guia2);
        Guia2.setBounds(120, 160, 190, 40);

        Guia3.setFont(new java.awt.Font("MV Boli", 0, 20)); // NOI18N
        Guia3.setText("APP GUIA 3");
        Guia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guia3ActionPerformed(evt);
            }
        });
        getContentPane().add(Guia3);
        Guia3.setBounds(120, 251, 190, 40);

        Guia4.setFont(new java.awt.Font("MV Boli", 0, 20)); // NOI18N
        Guia4.setText("APP GUIA 4");
        Guia4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guia4ActionPerformed(evt);
            }
        });
        getContentPane().add(Guia4);
        Guia4.setBounds(120, 301, 190, 40);

        Salir.setFont(new java.awt.Font("MV Boli", 0, 20)); // NOI18N
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir);
        Salir.setBounds(150, 351, 120, 40);

        preguntas2.setFont(new java.awt.Font("MV Boli", 0, 20)); // NOI18N
        preguntas2.setText("APP GUIA 2 PREGUNTAS");
        preguntas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preguntas2ActionPerformed(evt);
            }
        });
        getContentPane().add(preguntas2);
        preguntas2.setBounds(50, 210, 340, 30);

        preguntas1.setFont(new java.awt.Font("MV Boli", 0, 20)); // NOI18N
        preguntas1.setText("APP GUIA 1 PREGUNTAS");
        preguntas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preguntas1ActionPerformed(evt);
            }
        });
        getContentPane().add(preguntas1);
        preguntas1.setBounds(50, 110, 340, 30);

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMG-20180315-WA0061.jpg"))); // NOI18N
        imagen.setText("Imagen");
        getContentPane().add(imagen);
        imagen.setBounds(-320, 0, 780, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
    System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void Guia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guia1ActionPerformed
    Guia01 G1=new Guia01();
    this.setVisible(false);
    G1.setVisible(true);
    G1.setLocationRelativeTo(null);
    }//GEN-LAST:event_Guia1ActionPerformed

    private void Guia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guia3ActionPerformed
    Guia_03 G3=new Guia_03();
    this.setVisible(false);
    G3.setVisible(true);
    G3.setLocationRelativeTo(null);
    
    }//GEN-LAST:event_Guia3ActionPerformed

    private void Guia4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guia4ActionPerformed
     Guia4 G4=new Guia4();
    this.setVisible(false);
    G4.setVisible(true);
    G4.setLocationRelativeTo(null);
    
    }//GEN-LAST:event_Guia4ActionPerformed

    private void Guia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guia2ActionPerformed
      Guia2 G2=new Guia2();
    this.setVisible(false);
    G2.setVisible(true);
    G2.setLocationRelativeTo(null);
      
    }//GEN-LAST:event_Guia2ActionPerformed

    private void preguntas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preguntas1ActionPerformed
       Preguntas G1P=new Preguntas();
    this.setVisible(false);
    G1P.setVisible(true);
    G1P.setLocationRelativeTo(null);
    }//GEN-LAST:event_preguntas1ActionPerformed

    private void preguntas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preguntas2ActionPerformed
     Guia2_Preguntas G2P=new Guia2_Preguntas();
    this.setVisible(false);
    G2P.setVisible(true);
    G2P.setLocationRelativeTo(null);
    }//GEN-LAST:event_preguntas2ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guia1;
    private javax.swing.JButton Guia2;
    private javax.swing.JButton Guia3;
    private javax.swing.JButton Guia4;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton preguntas1;
    private javax.swing.JButton preguntas2;
    // End of variables declaration//GEN-END:variables
}
