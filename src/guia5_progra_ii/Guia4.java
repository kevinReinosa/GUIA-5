package guia5_progra_ii;

import javax.swing.JOptionPane;


public class Guia4 extends javax.swing.JFrame {
  
       public Guia4() {
        initComponents();
        principal.setEnabled(false);
        secundaria.setEnabled(false);
        
        
    }
 private String Calculo(){
 String resultado="";
     
 int BT=BateriaPantalla();
 int Mar=refDeMarca();
 int Pre=rangoPrecio();
 int Gar=garantia();
 int Pix=pixelaje();
 int CPU=Cpu();
 int Ram=Ram();
 
 int puntaje=BT+Pre+Gar+Pix+CPU+Ram;
     if (puntaje<=7) {
  resultado=("El puntaje es de : "+puntaje+"\n"
          + " Bateria: "+BT+" Marca: "+Mar+" Precio: "+Pre
          +" Garantia: "+Gar+"\n Pixelaje: "+Pix+" Cpu: "+CPU+" Ram: "+Ram
          +"\nEl terminal no es buena inversión.");        
     }else if (puntaje>7 || puntaje<=14) {
  resultado=("El puntaje es de : "+puntaje+"\n"
          + " Bateria: "+BT+" Marca: "+Mar+" Precio: "+Pre
          +" Garantia: "+Gar+"\n Pixelaje: "+Pix+" Cpu: "+CPU+" Ram: "+Ram
          +" La inversión es de riesgo");        
     }else if (puntaje>14 || puntaje<=21) {
         resultado+=("El puntaje es de : "+puntaje+"\n"
          + " Bateria: "+BT+" Marca: "+Mar+" Precio: "+Pre
          +"Garantia: "+Gar+"\n  Pixelaje: "+Pix+" Cpu: "+CPU+" Ram: "+Ram
          +"\n La la inversión es viable"); 
         
     }else if (puntaje>21) {
  resultado=("El puntaje es de : "+puntaje+"\n"
          + " Bateria: "+BT+" Marca: "+Mar+" Precio: "+Pre
          +"Garantia: "+Gar+"\nPixelaje: "+Pix+" Cpu: "+CPU+" Ram: "+Ram
          +"\nLa inversion es buena");               
     }
 return resultado;
 }      

private int BateriaPantalla(){
 int res=0;
double panta=Double.parseDouble(Tamaño_Pantalla.getText());
 
if(panta<=4){
 double bateria=Double.parseDouble(Cbateria.getText());    
     if (bateria<=1200) {
         res=3;
       }else if(bateria>1200 || bateria<2400){
     res=4;
     }else if (bateria>2400 || bateria<3100) {
         res=5;
     }else if (bateria>3100) {
         res=6;
     }
  }else if (panta>4 || panta<=8) {
      double bateria=Double.parseDouble(Cbateria.getText());
        if (bateria<=1200) {
         res=1;
       }else if(bateria>1200 || bateria<2400){
     res=2;
     }else if (bateria>2400 || bateria<3100) {
         res=3;
     }else if (bateria>3100) {
         res=4;
     }
    }else if (panta>8 || panta<=12) {
      double bateria=Double.parseDouble(Cbateria.getText());
        if (bateria<=1200) {
         res=0;
       }else if(bateria>1200 || bateria<2400){
     res=1;
     }else if (bateria>2400 || bateria<3100) {
         res=2;
     }else if (bateria>3100) {
         res=3;
     }
    }
  return res;  
}

private int refDeMarca(){
int res=0;
int mar=PCMarcas.getSelectedIndex();

if(mar<=6){
 res=4;       
 }else if (mar>6 || mar<=9) {
  res=3;      
    }else if (mar==10) {
      res=2;  
    }
return res;
} 
      

private int rangoPrecio(){

    int res=0;
double preci=Double.parseDouble(Precio.getText());
    if (preci<100){
   res=2;        
    }else if(preci>100 || preci<350){
    res=3;
    }else if(preci>350){
    res=4;
    }
return res;
}

private int garantia(){
    int res=0;
double garan=Double.parseDouble(Garantia.getText());
    if (garan<=3){
   res=1;        
    }else if(garan>3 || garan<6){
    res=2;
    }else if(garan>6){
    res=4;
    }
return res;
}

private int pixelaje(){
int r1,r;
int res=0;
double camarap=Double.parseDouble(principal.getText());
    if (camarap<=5){
        double camaras=Double.parseDouble(secundaria.getText());
        if (camaras<2) {
           res=1;
           if(Flash.isSelected()==false) {
   r1=res-1;
   res=r1;
    }
        }else{
        res=2;
        if(Flash.isSelected()==false) {
   r1=res-1;
   res=r1;
    }
        }
         
  }else if(camarap>5 || camarap<=8){
     double camaras=Double.parseDouble(secundaria.getText());
        if (camaras<2) {
           res=1; 
  if(Flash.isSelected()==false) {
   r1=res-1;
   res=r1;
    }
        }else if(camaras>=2 || camaras<3){
        res=2;
        if(Flash.isSelected()==false) {
   r1=res-1;
   res=r1;
    }
        }else if(camaras>=3){
        res=3;
   if(Flash.isSelected()==false) {
   r1=res-1;
   res=r1;
    }
        }
    
     
    }else if(camarap>8){
        double camaras=Double.parseDouble(secundaria.getText());
        if (camaras<=2) {
           res=1; 
        if(Flash.isSelected()==false) {  
   r1=res-1;
   res=r1; }
        }else if(camaras>2 || camaras<=5){
        res=2;
        if(Flash.isSelected()==false) {  
   r1=res-1;
   res=r1;}
        }else if(camaras>5){
        res=3;
        if(Flash.isSelected()==false) {
   r1=res-1;
   res=r1;}
        }
         
    }
 
   return res;
 }
private int Cpu(){
    int res=0;
double nucleo=Double.parseDouble(Nucleos.getText());
    if (nucleo<=2) {
    res=0;    
    }else if (nucleo>2 || nucleo<=4) {
    res=1;    
    }else if (nucleo>4 || nucleo<=6) {
     res=2;   
    }else if (nucleo>6 || nucleo<=8) {
     res=3;   
    }
return res;
}
private int Ram(){
    
int res=0;

double ram=Double.parseDouble(RAM.getText());
if (ram<=1) {
    res=0;    
    }else if (ram>1 || ram<2) {
    res=2;    
    }else if (ram>2 || ram<4) {
     res=4;   
    }else if (ram>4) {
     res=6;   
    }
return res;
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
        jLabel8 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();
        Cbateria = new javax.swing.JTextField();
        MenuP = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 200));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Cpu numero de nucleos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(75, 40, 200, 22);

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Tamaño de pantalla");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 70, 180, 22);

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Cantidad de RAM");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 100, 170, 22);

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Tiempo de Garantia");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 130, 180, 22);

        jLabel5.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Capacidad de la batería ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 190, 160, 20);

        jLabel6.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Marca");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 230, 50, 22);

        jLabel7.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("Camaras: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 250, 70, 22);

        Tamaño_Pantalla.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
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
        Tamaño_Pantalla.setBounds(280, 70, 116, 20);

        Nucleos.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
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
        Nucleos.setBounds(278, 41, 116, 20);

        RAM.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
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
        RAM.setBounds(280, 100, 116, 20);

        Garantia.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
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
        Garantia.setBounds(280, 130, 116, 20);

        LOGO.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        LOGO.setForeground(new java.awt.Color(0, 153, 153));
        LOGO.setText("PUNTAJE DE MOVILES");
        getContentPane().add(LOGO);
        LOGO.setBounds(190, 10, 160, 23);

        PCMarcas.setFont(new java.awt.Font("MV Boli", 0, 11)); // NOI18N
        PCMarcas.setForeground(new java.awt.Color(0, 153, 255));
        PCMarcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEXUS", "PIXIE", "LENOVO", "HUAWEI", "SONY", "APPLE", "SAMSUNG", "ALCATEL", "LG", "OTRA" }));
        PCMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCMarcasActionPerformed(evt);
            }
        });
        getContentPane().add(PCMarcas);
        PCMarcas.setBounds(140, 220, 116, 25);
        PCMarcas.getAccessibleContext().setAccessibleName("");
        PCMarcas.getAccessibleContext().setAccessibleDescription("");

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
        secundaria.setBounds(250, 290, 82, 20);

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
        principal.setBounds(150, 290, 80, 20);

        CamaraP.setFont(new java.awt.Font("MV Boli", 0, 11)); // NOI18N
        CamaraP.setForeground(new java.awt.Color(0, 153, 255));
        CamaraP.setText("Principal");
        CamaraP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamaraPActionPerformed(evt);
            }
        });
        getContentPane().add(CamaraP);
        CamaraP.setBounds(150, 250, 80, 27);

        CamaraS.setFont(new java.awt.Font("MV Boli", 0, 11)); // NOI18N
        CamaraS.setForeground(new java.awt.Color(0, 153, 255));
        CamaraS.setText("Secundaria");
        CamaraS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamaraSActionPerformed(evt);
            }
        });
        getContentPane().add(CamaraS);
        CamaraS.setBounds(250, 250, 79, 27);

        Flash.setFont(new java.awt.Font("MV Boli", 0, 11)); // NOI18N
        Flash.setForeground(new java.awt.Color(0, 153, 255));
        Flash.setText("Flash");
        Flash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlashActionPerformed(evt);
            }
        });
        getContentPane().add(Flash);
        Flash.setBounds(350, 250, 51, 27);

        Comonzar.setText("Ejecutar");
        Comonzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComonzarActionPerformed(evt);
            }
        });
        getContentPane().add(Comonzar);
        Comonzar.setBounds(140, 320, 110, 23);

        AreaT.setColumns(20);
        AreaT.setRows(5);
        getContentPane().add(AreaT);
        AreaT.setBounds(40, 350, 500, 200);

        Limpiar1.setText("Limpiar");
        Limpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar1);
        Limpiar1.setBounds(30, 320, 100, 23);

        Salida.setText("Salir");
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });
        getContentPane().add(Salida);
        Salida.setBounds(270, 320, 70, 23);

        jLabel8.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("Precio");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 160, 160, 22);

        Precio.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
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
        Precio.setBounds(280, 160, 116, 20);

        Cbateria.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        Cbateria.setForeground(new java.awt.Color(0, 153, 255));
        Cbateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CbateriaKeyTyped(evt);
            }
        });
        getContentPane().add(Cbateria);
        Cbateria.setBounds(280, 190, 120, 20);

        MenuP.setText("Regresar al menu principal");
        MenuP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPActionPerformed(evt);
            }
        });
        getContentPane().add(MenuP);
        MenuP.setBounds(350, 320, 200, 23);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMG-20180315-WA0061.jpg"))); // NOI18N
        jLabel9.setText("Imagen");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-420, 0, 990, 590);

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
      res =" Principal de "+principal.getText()+" mpx ";
    }if(CamaraS.isSelected()){
       res =" Secundaria de "+secundaria.getText()+" mpx ";
    }if(Flash.isSelected()){
            res =" \n Y flash";
        }
    return res;

}
    
    private void ComonzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComonzarActionPerformed
 

  
   AreaT.setText("La Marca es :"+PCMarcas.getSelectedItem()+"\nEl numero de nucleos es : "+Nucleos.getText()+" nucleos del cpu"+
            "\nLa RAM es de : "+RAM.getText()+" memoria RAM"+ "\n El tiempo de garantia : "+Garantia.getText()+" años"
            +"\nEl precio es : $ "+ Precio.getText()+"\n El tamaño de pantalla es: "+Tamaño_Pantalla.getText()+" pulgadas"+
            "\n Posee camaras: "+operacion()+
            "\nLa puntuacion por tu compra es "+Calculo());
   
  
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
   evt.consume();
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
    evt.consume();
    JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de dos caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_NucleosKeyTyped


    
    
    private void principalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_principalKeyTyped
     
      char CP=evt.getKeyChar();
       if((CP<'0'|| CP>'9')&& (CP!='.') || (CP=='.' && principal.getText().contains("."))){
     evt.consume();        
    }else if(principal.getText().length()>4){
    evt.consume();
    JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de cuatro caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
    principal.setText("");
    }   
        
    }//GEN-LAST:event_principalKeyTyped

    private void secundariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secundariaKeyTyped

        char CS=evt.getKeyChar();
       if((CS<'0'|| CS>'9')&& (CS!='.') || (CS=='.' && secundaria.getText().contains("."))){
     evt.consume();        
    }else if(secundaria.getText().length()>4){
    evt.consume();
    JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de cuatro caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
    secundaria.setText("");   
    }  
        
    }//GEN-LAST:event_secundariaKeyTyped

    private void Limpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiar1ActionPerformed
       Cbateria.setText("");
       Nucleos.setText(" ");
       Tamaño_Pantalla.setText(" ");
       RAM.setText(" ");
       Garantia.setText(" ");
       Precio.setText(" ");
       PCMarcas.setSelectedIndex(0);
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

    private void PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioActionPerformed

    }//GEN-LAST:event_PrecioActionPerformed

    private void PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioKeyTyped
      char preci=evt.getKeyChar();
       if((preci<'0'|| preci>'9')&& (preci!='.') || (preci=='.' && Precio.getText().contains("."))){
          double pre=Double.parseDouble(Precio.getText());
           if ( pre>999.99 || pre<0.01){
           JOptionPane.showMessageDialog(null,"El  precio ingresado no es valido","ERROR",JOptionPane.ERROR_MESSAGE);    
           }else{
           evt.consume();
           }
    }else if(Precio.getText().length()>6){
    evt.consume();
    JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de seis caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
    Precio.setText("");
    }       
    }//GEN-LAST:event_PrecioKeyTyped

    private void CbateriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CbateriaKeyTyped
       
       char Cbate=evt.getKeyChar();
       if(Cbate<'0'|| Cbate>'9'){
          double bate=Double.parseDouble(Cbateria.getText());
           if (bate<1 || bate>4000) {
           JOptionPane.showMessageDialog(null,"El tamaño de la bateria ingresado no es valido","ERROR",JOptionPane.ERROR_MESSAGE);   
           Cbateria.setText("");
           }else{
          evt.consume();
           } 
          }else if(Cbateria.getText().length()>=4){
        evt.consume();
        JOptionPane.showMessageDialog(null,"Lo maximo de caracteres es de 4 ","ERROR",JOptionPane.ERROR_MESSAGE);         
         Cbateria.setText("");
    } 
       
    }//GEN-LAST:event_CbateriaKeyTyped

    private void MenuPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPActionPerformed
        Menu_Principal ob=new Menu_Principal();
        this.setVisible(false);
        ob.setVisible(true);
        ob.setLocationRelativeTo(null);
    }//GEN-LAST:event_MenuPActionPerformed

    
    public static void main(String args[]) {
  
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guia4().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaT;
    private javax.swing.JCheckBox CamaraP;
    private javax.swing.JCheckBox CamaraS;
    private javax.swing.JTextField Cbateria;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField principal;
    private javax.swing.JTextField secundaria;
    // End of variables declaration//GEN-END:variables
}
