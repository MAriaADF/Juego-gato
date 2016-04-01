/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_gato;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Hellen Lopez A- Alejandro Salas 
 */
public class Rifaa extends javax.swing.JFrame {
    Random ran = new Random();
    int numero1, numero2;
    /**
     * Creates new form Rifaa
     */
    
    public Rifaa() {
        initComponents();
         this.getContentPane().setBackground(Color.black);//Hace de color negro el fondo
        btnJugador1.setLabel(Jugador.nombre1);
        btnJugador2.setLabel(Jugador.nombre2);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLbNumJuga1 = new javax.swing.JLabel();
        jLbNumJuga2 = new javax.swing.JLabel();
        btnJugador1 = new java.awt.Button();
        btnJugador2 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rifa para iniciar el juego");

        jLbNumJuga1.setBackground(new java.awt.Color(255, 255, 255));
        jLbNumJuga1.setForeground(new java.awt.Color(255, 255, 255));

        jLbNumJuga2.setBackground(new java.awt.Color(255, 255, 255));
        jLbNumJuga2.setForeground(new java.awt.Color(255, 255, 255));

        btnJugador1.setBackground(new java.awt.Color(0, 0, 0));
        btnJugador1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnJugador1.setForeground(new java.awt.Color(255, 255, 255));
        btnJugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJugador1MouseClicked(evt);
            }
        });
        btnJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugador1ActionPerformed(evt);
            }
        });

        btnJugador2.setBackground(new java.awt.Color(0, 0, 0));
        btnJugador2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnJugador2.setForeground(new java.awt.Color(255, 255, 255));
        btnJugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJugador2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(btnJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLbNumJuga1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(jLbNumJuga2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbNumJuga1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbNumJuga2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugador1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJugador1MouseClicked
        numero1 = ran.nextInt(7);// selecciona un numero del 0 al 6
        if (numero2 != numero1){
            jLbNumJuga1.setText(Integer.toString(numero1));//convierto de int a string para mostrar el numero
            btnJugador1.enable(false); 
        }
        GaneRifa();// verifica quien gana la rifa
    }//GEN-LAST:event_btnJugador1MouseClicked

    private void btnJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJugador1ActionPerformed

    private void btnJugador2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJugador2MouseClicked
        numero2 = ran.nextInt(7);// selecciona un numero del 0 al 6
        if (numero2 != numero1){
            jLbNumJuga2.setText(Integer.toString(numero2)); //convierto de int a string para mostrar el numero
            btnJugador2.enable(false);//inavilita el boton del guador 2
        }
        GaneRifa();// verifica quien gana la rifa
    }//GEN-LAST:event_btnJugador2MouseClicked

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
            java.util.logging.Logger.getLogger(Rifaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rifaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rifaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rifaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rifaa().setVisible(true);
            }
        });
    }
    public void GaneRifa(){
         
            //si jLbNumJuga1 y jLbNumJuga2 son diferente a vacio 
             
            if (!jLbNumJuga1.getText().isEmpty()&&!jLbNumJuga2.getText().isEmpty()){
               if(numero1 > numero2){
               JOptionPane.showMessageDialog(null, "El jugador que inicia es " +  Jugador.nombre1 + " con la letra X");
               } else {
               JOptionPane.showMessageDialog(null, "El jugador que inicia es " + Jugador.nombre2 + " con la letra X");
               String temp = Jugador.nombre1;
               Jugador.nombre1= Jugador.nombre2;
               Jugador.nombre2= temp;
               }
                new Principal().setVisible(true);//hace el JFrame de datos visble
                this.setVisible(false);// hace el JFrame  Menu_Principal invisible
            }
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnJugador1;
    private java.awt.Button btnJugador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLbNumJuga1;
    private javax.swing.JLabel jLbNumJuga2;
    // End of variables declaration//GEN-END:variables
}
