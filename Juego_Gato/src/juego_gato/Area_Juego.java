/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_gato;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hellen Lopez A
 */
public class Area_Juego extends javax.swing.JFrame {
   
    /**
     * Creates new form Area_Juego
     */
    public Area_Juego() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rboJugador1 = new javax.swing.JRadioButton();
        rboJugador2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblVicJ1 = new javax.swing.JLabel();
        lblVicJ2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblA1 = new javax.swing.JLabel();
        lblA2 = new javax.swing.JLabel();
        lblA3 = new javax.swing.JLabel();
        lblB1 = new javax.swing.JLabel();
        lblB2 = new javax.swing.JLabel();
        lblB3 = new javax.swing.JLabel();
        lblC1 = new javax.swing.JLabel();
        lblC2 = new javax.swing.JLabel();
        lblC3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rboJugador1.setBackground(new java.awt.Color(0, 0, 0));
        rboJugador1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rboJugador1.setForeground(new java.awt.Color(255, 255, 255));
        rboJugador1.setSelected(true);
        rboJugador1.setText("Jugador1");
        rboJugador1.setEnabled(false);
        rboJugador1.setName("rboJugador1"); // NOI18N

        rboJugador2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rboJugador2.setForeground(new java.awt.Color(255, 255, 255));
        rboJugador2.setText("Jugador2");
        rboJugador2.setEnabled(false);
        rboJugador2.setName("rboJugador2"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VICTORIAS");
        jLabel1.setName("lblVictorias"); // NOI18N

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jugador1");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jugador2");

        lblVicJ1.setBackground(new java.awt.Color(0, 0, 0));
        lblVicJ1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblVicJ1.setForeground(new java.awt.Color(255, 255, 255));
        lblVicJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVicJ1.setText("1");
        lblVicJ1.setName("lblVicJ1"); // NOI18N

        lblVicJ2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblVicJ2.setForeground(new java.awt.Color(255, 255, 255));
        lblVicJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVicJ2.setText("1");
        lblVicJ2.setName("lblVicJ2"); // NOI18N

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setName("btnSalir"); // NOI18N

        lblA1.setBackground(new java.awt.Color(255, 255, 255));
        lblA1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblA1.setForeground(new java.awt.Color(255, 255, 255));
        lblA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA1.setAlignmentY(0.0F);
        lblA1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        lblA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblA1MouseClicked(evt);
            }
        });

        lblA2.setBackground(new java.awt.Color(255, 255, 255));
        lblA2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblA2.setForeground(new java.awt.Color(255, 255, 255));
        lblA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        lblA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblA2MouseClicked(evt);
            }
        });

        lblA3.setBackground(new java.awt.Color(255, 255, 255));
        lblA3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblA3.setForeground(new java.awt.Color(255, 255, 255));
        lblA3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        lblA3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblA3MouseClicked(evt);
            }
        });

        lblB1.setBackground(new java.awt.Color(255, 255, 255));
        lblB1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblB1.setForeground(new java.awt.Color(255, 255, 255));
        lblB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        lblB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblB1MouseClicked(evt);
            }
        });

        lblB2.setBackground(new java.awt.Color(255, 255, 255));
        lblB2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblB2.setForeground(new java.awt.Color(255, 255, 255));
        lblB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB2.setAutoscrolls(true);
        lblB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        lblB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblB2MouseClicked(evt);
            }
        });

        lblB3.setBackground(new java.awt.Color(255, 255, 255));
        lblB3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblB3.setForeground(new java.awt.Color(255, 255, 255));
        lblB3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        lblB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblB3MouseClicked(evt);
            }
        });

        lblC1.setBackground(new java.awt.Color(255, 255, 255));
        lblC1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblC1.setForeground(new java.awt.Color(255, 255, 255));
        lblC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        lblC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblC1MouseClicked(evt);
            }
        });

        lblC2.setBackground(new java.awt.Color(255, 255, 255));
        lblC2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblC2.setForeground(new java.awt.Color(255, 255, 255));
        lblC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        lblC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblC2MouseClicked(evt);
            }
        });

        lblC3.setBackground(new java.awt.Color(255, 255, 255));
        lblC3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblC3.setForeground(new java.awt.Color(255, 255, 255));
        lblC3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        lblC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblC3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(jLabel2)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(lblC1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblA1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(lblB1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblA2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(lblC2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(lblB2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addComponent(lblVicJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblVicJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rboJugador1)
                            .addComponent(rboJugador2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblA3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(lblB3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(lblC3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(98, 98, 98)
                        .addComponent(btnSalir)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblC1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblA1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblB1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblA2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblC2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblB2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblVicJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVicJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(rboJugador1)
                        .addGap(18, 18, 18)
                        .addComponent(rboJugador2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblA3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblB3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblA1MouseClicked
        
    }//GEN-LAST:event_lblA1MouseClicked

    private void lblA2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblA2MouseClicked
        
    }//GEN-LAST:event_lblA2MouseClicked

    private void lblA3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblA3MouseClicked
       
    }//GEN-LAST:event_lblA3MouseClicked

    private void lblB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblB1MouseClicked
       
    }//GEN-LAST:event_lblB1MouseClicked

    private void lblB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblB2MouseClicked
        
    }//GEN-LAST:event_lblB2MouseClicked

    private void lblB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblB3MouseClicked
        
    }//GEN-LAST:event_lblB3MouseClicked

    private void lblC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblC1MouseClicked
       
    }//GEN-LAST:event_lblC1MouseClicked

    private void lblC2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblC2MouseClicked
     
    }//GEN-LAST:event_lblC2MouseClicked

    private void lblC3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblC3MouseClicked
       
    }//GEN-LAST:event_lblC3MouseClicked

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
            java.util.logging.Logger.getLogger(Area_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Area_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Area_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Area_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Area_Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblA1;
    private javax.swing.JLabel lblA2;
    private javax.swing.JLabel lblA3;
    private javax.swing.JLabel lblB1;
    private javax.swing.JLabel lblB2;
    private javax.swing.JLabel lblB3;
    private javax.swing.JLabel lblC1;
    private javax.swing.JLabel lblC2;
    private javax.swing.JLabel lblC3;
    private javax.swing.JLabel lblVicJ1;
    private javax.swing.JLabel lblVicJ2;
    private javax.swing.JRadioButton rboJugador1;
    private javax.swing.JRadioButton rboJugador2;
    // End of variables declaration//GEN-END:variables


}
