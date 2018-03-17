package guia5_progra_ii;

import javax.swing.JOptionPane;


public class Guia_03 extends javax.swing.JFrame {
    private String Resultado;
 
       public Guia_03() {
        initComponents();
        principal.setEnabled(false);
        secundaria.setEnabled(false);
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tamaño_Pantalla = new javax.swing.JTextField();
        Nucleos = new javax.swing.JTextField();
        RAM = new javax.swing.JTextField();
        Garantia = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        LOGO = new javax.swing.JLabel();
        PCMarcas = new javax.swing.JComboBox<>();
        secundaria = new javax.swing.JTextField();
        principal = new javax.swing.JTextField();
        CamaraP = new javax.swing.JCheckBox();
        CamaraS = new javax.swing.JCheckBox();
        Flash = new javax.swing.JCheckBox();
        Comonzar = new javax.swing.JButton();
        AreaT = new javax.swing.JTextArea();
        Limpiar1 = new javax.swing.JButton();
        Salida = new javax.swing.JButton();
        MenuP = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Cpu numero de nucleos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 30, 160, 14);

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Tamaño de pantalla");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 70, 140, 14);

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Cantidad de RAM");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 100, 130, 14);

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Tiempo de Garantia");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 130, 140, 14);

        jLabel5.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Precio");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 160, 120, 14);

        jLabel6.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Marca");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 190, 80, 14);

        jLabel7.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("Camaras: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 230, 65, 23);

        Tamaño_Pantalla.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        Tamaño_Pantalla.setForeground(new java.awt.Color(0, 153, 255));
        Tamaño_Pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tamaño_PantallaActionPerformed(evt);
            }
        });
        Tamaño_Pantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tamaño_PantallaKeyTyped(evt);
            }
        });
        getContentPane().add(Tamaño_Pantalla);
        Tamaño_Pantalla.setBounds(222, 69, 140, 20);

        Nucleos.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        Nucleos.setForeground(new java.awt.Color(0, 153, 255));
        Nucleos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NucleosActionPerformed(evt);
            }
        });
        Nucleos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NucleosKeyTyped(evt);
            }
        });
        getContentPane().add(Nucleos);
        Nucleos.setBounds(222, 31, 140, 20);

        RAM.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        RAM.setForeground(new java.awt.Color(0, 153, 255));
        RAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAMActionPerformed(evt);
            }
        });
        RAM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RAMKeyTyped(evt);
            }
        });
        getContentPane().add(RAM);
        RAM.setBounds(222, 100, 140, 20);

        Garantia.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        Garantia.setForeground(new java.awt.Color(0, 153, 255));
        Garantia.setText(" ");
        Garantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GarantiaActionPerformed(evt);
            }
        });
        Garantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GarantiaKeyTyped(evt);
            }
        });
        getContentPane().add(Garantia);
        Garantia.setBounds(222, 131, 140, 20);

        Precio.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        Precio.setForeground(new java.awt.Color(0, 153, 255));
        Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioActionPerformed(evt);
            }
        });
        Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PrecioKeyTyped(evt);
            }
        });
        getContentPane().add(Precio);
        Precio.setBounds(222, 162, 140, 20);

        LOGO.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        LOGO.setForeground(new java.awt.Color(0, 153, 255));
        LOGO.setText("PUNTAJE DE MOVILES");
        getContentPane().add(LOGO);
        LOGO.setBounds(140, 10, 200, 23);

        PCMarcas.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        PCMarcas.setForeground(new java.awt.Color(0, 153, 255));
        PCMarcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEXUS", "PIXIE", "LENOVO", "HUAWEI", "SONY", "APPLE", "SAMSUNG", "ALCATEL", "LG", "OTRA" }));
        PCMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCMarcasActionPerformed(evt);
            }
        });
        getContentPane().add(PCMarcas);
        PCMarcas.setBounds(222, 188, 116, 20);
        PCMarcas.getAccessibleContext().setAccessibleName("");
        PCMarcas.getAccessibleContext().setAccessibleDescription("");

        secundaria.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        secundaria.setForeground(new java.awt.Color(0, 153, 255));
        secundaria.setText("0");
        secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secundariaActionPerformed(evt);
            }
        });
        secundaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                secundariaKeyTyped(evt);
            }
        });
        getContentPane().add(secundaria);
        secundaria.setBounds(230, 260, 82, 20);

        principal.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        principal.setForeground(new java.awt.Color(0, 153, 255));
        principal.setText("0");
        principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalActionPerformed(evt);
            }
        });
        principal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                principalKeyTyped(evt);
            }
        });
        getContentPane().add(principal);
        principal.setBounds(120, 260, 80, 20);

        CamaraP.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        CamaraP.setForeground(new java.awt.Color(0, 153, 255));
        CamaraP.setText("Principal");
        CamaraP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamaraPActionPerformed(evt);
            }
        });
        getContentPane().add(CamaraP);
        CamaraP.setBounds(120, 230, 90, 20);

        CamaraS.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        CamaraS.setForeground(new java.awt.Color(0, 153, 255));
        CamaraS.setText("Secundaria");
        CamaraS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamaraSActionPerformed(evt);
            }
        });
        getContentPane().add(CamaraS);
        CamaraS.setBounds(230, 230, 95, 20);

        Flash.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        Flash.setForeground(new java.awt.Color(0, 153, 255));
        Flash.setText("Flash");
        Flash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlashActionPerformed(evt);
            }
        });
        getContentPane().add(Flash);
        Flash.setBounds(350, 230, 59, 20);

        Comonzar.setText("Ejecutar");
        Comonzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComonzarActionPerformed(evt);
            }
        });
        getContentPane().add(Comonzar);
        Comonzar.setBounds(120, 290, 90, 23);

        AreaT.setColumns(20);
        AreaT.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        AreaT.setRows(5);
        getContentPane().add(AreaT);
        AreaT.setBounds(21, 321, 490, 190);

        Limpiar1.setText("Limpiar");
        Limpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar1);
        Limpiar1.setBounds(20, 290, 80, 23);

        Salida.setText("Salir");
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });
        getContentPane().add(Salida);
        Salida.setBounds(230, 290, 70, 23);

        MenuP.setText("Regresar al menu principal");
        MenuP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPActionPerformed(evt);
            }
        });
        getContentPane().add(MenuP);
        MenuP.setBounds(320, 290, 190, 23);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMG-20180315-WA0061.jpg"))); // NOI18N
        jLabel9.setText("Imagen");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-430, -30, 1010, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void PCMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCMarcasActionPerformed

    }//GEN-LAST:event_PCMarcasActionPerformed

    private void FlashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FlashActionPerformed

    private void NucleosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NucleosActionPerformed

    }//GEN-LAST:event_NucleosActionPerformed

    private void Tamaño_PantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tamaño_PantallaActionPerformed
    
    }//GEN-LAST:event_Tamaño_PantallaActionPerformed

    private void RAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAMActionPerformed
    
    }//GEN-LAST:event_RAMActionPerformed

    private void GarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GarantiaActionPerformed
        
    }//GEN-LAST:event_GarantiaActionPerformed

    private void PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioActionPerformed
    
    }//GEN-LAST:event_PrecioActionPerformed

    private void CamaraPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamaraPActionPerformed

        if(CamaraP.isSelected()){
     principal.setEnabled(true);
     }else
      if(CamaraP.isSelected()==false){
      principal.setEnabled(false);
     }
    }//GEN-LAST:event_CamaraPActionPerformed
private String operacion(){

    String res = "";
    if(CamaraP.isSelected()){
      res +=("Principal de "+principal.getText()+" mpx ");
    }if(CamaraS.isSelected()){
       res +=(" Secundaria de "+secundaria.getText()+" mpx ");
    }if(Flash.isSelected()){
            res +=("\n Y flash");
        }
    return res;

}
    
    private void ComonzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComonzarActionPerformed
   
        Resultado="La Marca es :"+PCMarcas.getSelectedItem()+"\nEl numero de nucleos es : "+Nucleos.getText()+" nucleos del cpu"+
            "\nLa RAM es de : "+RAM.getText()+" memoria RAM"+ "\n El tiempo de garantia : "+Garantia.getText()+" años"
            +"\nEl precio es : $ "+ Precio.getText()+"\n El tamaño de pantalla es: "+Tamaño_Pantalla.getText()+" pulgadas"+
            "\n Posee camaras: "+operacion();
    
    AreaT.setText(Resultado);
    }//GEN-LAST:event_ComonzarActionPerformed

    private void CamaraSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamaraSActionPerformed
     
        if(CamaraS.isSelected()){
     secundaria.setEnabled(true);
     }else if(CamaraS.isSelected()==false){
     secundaria.setEnabled(false);
     }     
    }//GEN-LAST:event_CamaraSActionPerformed

    private void principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalActionPerformed
      
    }//GEN-LAST:event_principalActionPerformed

    private void secundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secundariaActionPerformed
      
    }//GEN-LAST:event_secundariaActionPerformed

    
    private void PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioKeyTyped
        char precio1=evt.getKeyChar();
        if((precio1<'0'|| precio1>'9') && (precio1!='.') || (precio1=='.' && Precio.getText().contains("."))){
         
            double preci=Double.parseDouble(Precio.getText());
            if (preci<0.01 || preci>999.99) {
                JOptionPane.showMessageDialog(null,"La cantidad de Precio ingresada no es valida","ERROR",JOptionPane.ERROR_MESSAGE);
              Precio.setText(" ");
            }else{
            evt.consume();
            }

        }else if(Precio.getText().length()>6){
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de seis caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
     
    }//GEN-LAST:event_PrecioKeyTyped
 
    private void GarantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GarantiaKeyTyped
    char Garan=evt.getKeyChar();
       if((Garan<'0'|| Garan>'9') && (Garan!='.') || (Garan=='.' && Garantia.getText().contains("."))){
         
            double G=Double.parseDouble(Garantia.getText());
            if (G<1 || G>24) {
                JOptionPane.showMessageDialog(null,"La cantidad de Garantia ingresada no es valida","ERROR",JOptionPane.ERROR_MESSAGE);
             Garantia.setText(" ");
            }else{
            evt.consume();
            }

        }else if(Garantia.getText().length()>3){
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de tres caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_GarantiaKeyTyped

    private void RAMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RAMKeyTyped
    
       char ram2=evt.getKeyChar();
       if((ram2<'0'|| ram2>'9') && (ram2!='.') || (ram2=='.' && RAM.getText().contains("."))){
            double G=Double.parseDouble(RAM.getText());
            if (G<0.5|| G>6.0) {
                JOptionPane.showMessageDialog(null,"La cantidad de RAM ingresada no es valida","ERROR",JOptionPane.ERROR_MESSAGE);
           RAM.setText("");
            }else{
            evt.consume();
            }

        }else if(RAM.getText().length()>=3){
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de dos caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_RAMKeyTyped

    private void Tamaño_PantallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tamaño_PantallaKeyTyped
       char tama=evt.getKeyChar();
       if((tama<'0' || tama>'9')&& (tama!='.') || (tama=='.' && Tamaño_Pantalla.getText().contains("."))){
      
        double Te =Double.parseDouble(Tamaño_Pantalla.getText());
       if (Te<3.0 || Te>6.7) {
       JOptionPane.showMessageDialog(null," La cantidad de tamaño de pantalla ingresada no es valida ","ERROR",JOptionPane.ERROR_MESSAGE);           
          Tamaño_Pantalla.setText("");
       }else{
      evt.consume();
           }
       }else if(Tamaño_Pantalla.getText().length()>2){
   JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de dos caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);    
       }
       
    }//GEN-LAST:event_Tamaño_PantallaKeyTyped

    private void NucleosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NucleosKeyTyped
     char nucle=evt.getKeyChar();
       if(nucle<'0' || nucle>'9'){
      
        double N =Double.parseDouble(Nucleos.getText());
       if (N<0 || N>12) {
       JOptionPane.showMessageDialog(null," La cantidad de nuemros de Nucleos ingresada no es valida ","ERROR",JOptionPane.ERROR_MESSAGE);           
          Nucleos.setText("");
       }else{
      evt.consume();
       }
       }else if(Nucleos.getText().length()>2){
    JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de dos caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_NucleosKeyTyped


    
    
    private void principalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_principalKeyTyped
     
      char CP=evt.getKeyChar();
       if((CP<'0'|| CP>'9')&& (CP!='.') || (CP=='.' && principal.getText().contains("."))){
     evt.consume();        
    }else if(principal.getText().length()>4){
    JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de cuatro caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
    principal.setText("");
    }   
        
    }//GEN-LAST:event_principalKeyTyped

    private void secundariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secundariaKeyTyped

        char CS=evt.getKeyChar();
       if((CS<'0'|| CS>'9')&& (CS!='.') || (CS=='.' && secundaria.getText().contains("."))){
     evt.consume();        
    }else if(secundaria.getText().length()>4){
    JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de cuatro caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
     secundaria.setText("");   
    }  
        
    }//GEN-LAST:event_secundariaKeyTyped

    private void Limpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiar1ActionPerformed
       Nucleos.setText(" ");
       Tamaño_Pantalla.setText(" ");
       RAM.setText(" ");
       Garantia.setText(" ");
       Precio.setText(" ");
       PCMarcas.getSelectedItem();
       principal.setText(" ");
       secundaria.setText(" ");
       AreaT.setText(" ");
       CamaraP.setSelected(false);
       CamaraS.setSelected(false);
       Flash.setSelected(false);
    }//GEN-LAST:event_Limpiar1ActionPerformed

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalidaActionPerformed

    private void MenuPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPActionPerformed
     Menu_Principal ob=new Menu_Principal();
     this.setVisible(false);
     ob.setVisible(true);
     ob.setLocationRelativeTo(null);
    }//GEN-LAST:event_MenuPActionPerformed

    
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
            java.util.logging.Logger.getLogger(Guia_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guia_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guia_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guia_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guia_03().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaT;
    private javax.swing.JCheckBox CamaraP;
    private javax.swing.JCheckBox CamaraS;
    private javax.swing.JButton Comonzar;
    private javax.swing.JCheckBox Flash;
    private javax.swing.JTextField Garantia;
    private javax.swing.JLabel LOGO;
    private javax.swing.JButton Limpiar1;
    private javax.swing.JButton MenuP;
    private javax.swing.JTextField Nucleos;
    private javax.swing.JComboBox<String> PCMarcas;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField RAM;
    private javax.swing.JButton Salida;
    private javax.swing.JTextField Tamaño_Pantalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField principal;
    private javax.swing.JTextField secundaria;
    // End of variables declaration//GEN-END:variables
}
