/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_gato;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Hellen Lopez A -Alejandro salas
 */
public class Menu_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Principal
     */
    public Menu_Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
         this.getContentPane().setBackground(Color.black);//Hace de color negro el fondo
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_rbn = new javax.swing.ButtonGroup();
        rbnContinua = new javax.swing.JRadioButton();
        rbnInicia = new javax.swing.JRadioButton();
        rbnResvisar = new javax.swing.JRadioButton();
        rbnEstadistica = new javax.swing.JRadioButton();
        rbnSalir = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        rbnContinua.setBackground(new java.awt.Color(0, 0, 0));
        rbnContinua.setFont(new java.awt.Font("Corbel", 3, 18)); // NOI18N
        rbnContinua.setForeground(new java.awt.Color(255, 255, 255));
        rbnContinua.setText("Continuar juego anterior");
        rbnContinua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnContinuaActionPerformed(evt);
            }
        });

        rbnInicia.setBackground(new java.awt.Color(0, 0, 0));
        rbnInicia.setFont(new java.awt.Font("Corbel", 3, 18)); // NOI18N
        rbnInicia.setForeground(new java.awt.Color(255, 255, 255));
        rbnInicia.setText("Inicia un nuevo  juego");
        rbnInicia.setBorder(null);
        rbnInicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnIniciaActionPerformed(evt);
            }
        });

        rbnResvisar.setBackground(new java.awt.Color(0, 0, 0));
        rbnResvisar.setFont(new java.awt.Font("Corbel", 3, 18)); // NOI18N
        rbnResvisar.setForeground(new java.awt.Color(255, 255, 255));
        rbnResvisar.setText("Revisar lista de jugadores");

        rbnEstadistica.setBackground(new java.awt.Color(0, 0, 0));
        rbnEstadistica.setFont(new java.awt.Font("Corbel", 3, 18)); // NOI18N
        rbnEstadistica.setForeground(new java.awt.Color(255, 255, 255));
        rbnEstadistica.setText("Estadistica del jugador");

        rbnSalir.setBackground(new java.awt.Color(0, 0, 0));
        rbnSalir.setFont(new java.awt.Font("Corbel", 3, 18)); // NOI18N
        rbnSalir.setForeground(new java.awt.Color(255, 255, 255));
        rbnSalir.setText("Salir");
        rbnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(105, 30, 77));
        jLabel1.setText("Juego de gato");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hellen Lopez A\\Documents\\NetBeansProjects\\Menu\\Imagenes\\gato.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbnContinua, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbnResvisar)
                    .addComponent(rbnEstadistica)
                    .addComponent(rbnSalir)
                    .addComponent(rbnInicia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbnInicia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbnContinua)
                        .addGap(9, 9, 9)
                        .addComponent(rbnResvisar)
                        .addGap(9, 9, 9)
                        .addComponent(rbnEstadistica)
                        .addGap(9, 9, 9)
                        .addComponent(rbnSalir)))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnSalirActionPerformed
       int dec= JOptionPane.showConfirmDialog(null,"Seguro que deseas salir del "
               + "juego?","Error ",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE );
        if(dec == JOptionPane.YES_OPTION){
            System.exit(0);// cierra el programa
        }else if(dec == JOptionPane.NO_OPTION){
           //limpia el radiobutt
        } 
    }//GEN-LAST:event_rbnSalirActionPerformed

    private void rbnIniciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnIniciaActionPerformed
        Datos ins = new Datos();
        ins.setVisible(true);//hace el JFrame de datos visble
        this.setVisible(false);// hace el JFrame  Menu_Principal invisible
    }//GEN-LAST:event_rbnIniciaActionPerformed

    private void rbnContinuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnContinuaActionPerformed
        Area_Juego area = new Area_Juego();
        area.setVisible(true);//hace el JFrame de area de juego visble
        this.setVisible(false);// hace el JFrame  Menu_Principal invisible
    }//GEN-LAST:event_rbnContinuaActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo_rbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rbnContinua;
    private javax.swing.JRadioButton rbnEstadistica;
    private javax.swing.JRadioButton rbnInicia;
    private javax.swing.JRadioButton rbnResvisar;
    private javax.swing.JRadioButton rbnSalir;
    // End of variables declaration//GEN-END:variables
}
