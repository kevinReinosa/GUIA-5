
package guia5_progra_ii;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class Guia2 extends javax.swing.JFrame {

  String[] arreglo;
  
    public Guia2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Tamaño = new javax.swing.JTextField();
        Ordenar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        Ventana = new javax.swing.JTextField();
        Salir = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Ingresar = new javax.swing.JButton();
        MenuP = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Bienvenido a tu Menu selecciona la accion que deseas realizar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(58, 11, 440, 23);

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Tamaño del arreeglo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(58, 57, 170, 23);

        Tamaño.setBackground(new java.awt.Color(240, 240, 240));
        Tamaño.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        Tamaño.setForeground(new java.awt.Color(0, 153, 255));
        Tamaño.setText("  ");
        Tamaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TamañoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TamañoKeyTyped(evt);
            }
        });
        getContentPane().add(Tamaño);
        Tamaño.setBounds(227, 54, 160, 29);

        Ordenar.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        Ordenar.setForeground(new java.awt.Color(0, 153, 255));
        Ordenar.setText("Ordenar Arreglo");
        Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarActionPerformed(evt);
            }
        });
        getContentPane().add(Ordenar);
        Ordenar.setBounds(20, 150, 180, 31);

        Mostrar.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        Mostrar.setForeground(new java.awt.Color(0, 153, 255));
        Mostrar.setText("Mostrar arrglo");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Mostrar);
        Mostrar.setBounds(270, 150, 160, 31);

        Ventana.setBackground(new java.awt.Color(240, 240, 240));
        Ventana.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        Ventana.setForeground(new java.awt.Color(0, 153, 255));
        getContentPane().add(Ventana);
        Ventana.setBounds(68, 189, 300, 58);

        Salir.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(0, 153, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir);
        Salir.setBounds(150, 260, 120, 31);

        Limpiar.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(0, 153, 255));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar);
        Limpiar.setBounds(0, 260, 130, 31);

        Ingresar.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(0, 153, 255));
        Ingresar.setText("Ingresar datos al arreglo");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(Ingresar);
        Ingresar.setBounds(128, 114, 200, 31);

        MenuP.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        MenuP.setForeground(new java.awt.Color(0, 153, 255));
        MenuP.setText("Regresar al Menu Principal");
        MenuP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPActionPerformed(evt);
            }
        });
        getContentPane().add(MenuP);
        MenuP.setBounds(290, 260, 230, 31);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMG-20180315-WA0061.jpg"))); // NOI18N
        jLabel3.setText("IMAGEN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-120, 0, 740, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean valor(String cadena){
 int numer;
 boolean val=true;
 try{
 numer=Integer.parseInt(cadena);
val=true;
 }catch(Exception e){
 val=false;
  }
 return val;
 }    
    
    private void TamañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TamañoKeyTyped
 
    
    
    }//GEN-LAST:event_TamañoKeyTyped

    private void TamañoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TamañoKeyPressed
     
       if(evt.getKeyCode()== KeyEvent.VK_ENTER && Tamaño.getText().length()!=0){
           
   String tam=(Tamaño.getText());
   boolean v=valor(tam);      
    if(v==true){
      
     int ta=Integer.parseInt(Tamaño.getText());
      arreglo=new String[ta];
     
    }else{  evt.consume();
  JOptionPane.showMessageDialog(null,"No puesdes ingresar letras \n"
          + "ingresa el tamaño nuevamente");
     Tamaño.setText("");
   
   }
           
      
       }
    }//GEN-LAST:event_TamañoKeyPressed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
    llenar_arreglo();
    }//GEN-LAST:event_IngresarActionPerformed

    private void OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarActionPerformed
       ordenar_arreglo();
    }//GEN-LAST:event_OrdenarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
   String mostrar=" ";
 int  tamaño=Integer.parseInt(Tamaño.getText());
    for (int i = 0; i <tamaño; i++) {
    mostrar=mostrar+arreglo[i]+" ";   
    } 
        Ventana.setText(mostrar);
    }//GEN-LAST:event_MostrarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
       Ventana.setText("");
       Tamaño.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
    System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void MenuPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPActionPerformed
     Menu_Principal ob=new Menu_Principal();
     this.setVisible(false);
     ob.setVisible(true);
     ob.setLocationRelativeTo(null);
    }//GEN-LAST:event_MenuPActionPerformed

    public void llenar_arreglo(){
    
 int tamaño=Integer.parseInt(Tamaño.getText());   
 JOptionPane.showMessageDialog(null,"Llena tu arreglo de letras del alfabeto ");
 for (int i = 0; i <tamaño; i++) { 
boolean b=true;
     while(b){ 
         
   arreglo[i]=JOptionPane.showInputDialog(" Ingresa la letra numero "+(i+1));
   boolean val=valores(arreglo[i]);
   
 if(val==true){
     arreglo[i]=arreglo[i];
     b=false;
 }else{
    JOptionPane.showMessageDialog(null,"Solo puedes ingresar letras de la A-Z "
            + "\ningresa nuevamente la letra");
 }   
 }
 }
}

public boolean valores(String cadena){
 int letra;
 boolean val=true;
 try{
 letra=Integer.parseInt(cadena);
val=false;
 }catch(Exception e){
 val=true;
  }
 return val;
 }
public void ordenar_arreglo(){
    int tamaño=Integer.parseInt(Tamaño.getText());
            
     for (int i =0; i <tamaño; i++) {
            for (int j =i+1; j<tamaño; j++) {
                
                  if(arreglo[i].compareToIgnoreCase(arreglo[j])>0){
                      String N=arreglo[i];
                      arreglo[i]=arreglo[j];
                      arreglo[j]=N;               
        }
     }
  }  
}

    
 public static void main(String args[]){
     
   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guia2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton MenuP;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton Ordenar;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField Tamaño;
    private javax.swing.JTextField Ventana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
 }
