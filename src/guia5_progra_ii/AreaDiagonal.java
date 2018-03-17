
package guia5_progra_ii;
public class AreaDiagonal extends javax.swing.JFrame {

   
    public AreaDiagonal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dato1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dato2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Area = new javax.swing.JButton();
        Diagonal = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        MenuPrincipal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        resultadoArea = new javax.swing.JTextField();
        resutadoDiagonal = new javax.swing.JLabel();
        resultadoDiagonal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Ingrese el dato del primer lado");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 190, 22);

        dato1.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        dato1.setForeground(new java.awt.Color(0, 153, 255));
        getContentPane().add(dato1);
        dato1.setBounds(10, 40, 190, 28);

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Ingrese el dato del segundo lado");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 80, 190, 22);

        dato2.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        dato2.setForeground(new java.awt.Color(0, 153, 255));
        getContentPane().add(dato2);
        dato2.setBounds(10, 110, 190, 28);

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Calcular area");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 10, 75, 22);

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Calcular diagonal");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 90, 96, 22);

        Area.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        Area.setForeground(new java.awt.Color(0, 153, 255));
        Area.setText("ELEGIR");
        Area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaActionPerformed(evt);
            }
        });
        getContentPane().add(Area);
        Area.setBounds(380, 40, 100, 31);

        Diagonal.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        Diagonal.setForeground(new java.awt.Color(0, 153, 255));
        Diagonal.setText("ELEGIR");
        Diagonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagonalActionPerformed(evt);
            }
        });
        getContentPane().add(Diagonal);
        Diagonal.setBounds(380, 120, 100, 31);

        Limpiar.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(0, 153, 255));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar);
        Limpiar.setBounds(370, 280, 120, 31);

        MenuPrincipal.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        MenuPrincipal.setForeground(new java.awt.Color(0, 153, 255));
        MenuPrincipal.setText("Menu Guia1");
        MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(MenuPrincipal);
        MenuPrincipal.setBounds(340, 330, 150, 31);

        jLabel6.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("resultado area");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 180, 110, 23);
        getContentPane().add(resultadoArea);
        resultadoArea.setBounds(40, 210, 110, 20);

        resutadoDiagonal.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        resutadoDiagonal.setForeground(new java.awt.Color(0, 102, 204));
        resutadoDiagonal.setText("resultado diagonal");
        getContentPane().add(resutadoDiagonal);
        resutadoDiagonal.setBounds(40, 260, 120, 23);
        getContentPane().add(resultadoDiagonal);
        resultadoDiagonal.setBounds(40, 290, 170, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMG-20180315-WA0061.jpg"))); // NOI18N
        jLabel5.setText("imagen");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-240, -20, 810, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents
  double lado1, lado2, area, suma, diagonal;
    private void AreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaActionPerformed
      lado1 = Double.parseDouble(dato1.getText());
       lado2 = Double.parseDouble(dato2.getText());
       
       area = lado1 * lado2;
       
       resultadoArea.setText("" + area);
       resultadoDiagonal.setText("");
    }//GEN-LAST:event_AreaActionPerformed

    private void DiagonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagonalActionPerformed
      lado1 = Double.parseDouble(dato1.getText());
       lado2 = Double.parseDouble(dato2.getText());
       
       suma = Math.pow(lado1, 2) + Math.pow(lado2, 2);
       diagonal = Math.sqrt(suma);
       
       resultadoDiagonal.setText("" + diagonal);
       resultadoArea.setText("");
    }//GEN-LAST:event_DiagonalActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
       dato1.setText("");
       dato2.setText("");
       resultadoDiagonal.setText("");
       resultadoArea.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
     Guia01 G1=new Guia01();
    this.setVisible(false);
    G1.setVisible(true);
    G1.setLocationRelativeTo(null); 
    }//GEN-LAST:event_MenuPrincipalActionPerformed
   
    
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
            java.util.logging.Logger.getLogger(AreaDiagonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaDiagonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaDiagonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaDiagonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaDiagonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Area;
    private javax.swing.JButton Diagonal;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton MenuPrincipal;
    private javax.swing.JTextField dato1;
    private javax.swing.JTextField dato2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField resultadoArea;
    private javax.swing.JTextField resultadoDiagonal;
    private javax.swing.JLabel resutadoDiagonal;
    // End of variables declaration//GEN-END:variables
}
