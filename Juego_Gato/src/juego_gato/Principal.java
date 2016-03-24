package juego_gato;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.Connection;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deiver Alejandro Acuña Salas, Hellen Maria Lopez Arrieta
 */
public class Principal extends javax.swing.JFrame {
int turno,contp,contimp;
    boolean gano=false;//indica si ya hubo o no un gane
    boolean prueba=false;
    public JLabel[][] cuadros;//matriz para guardar los label
    public  int J1Victoria = 0;
    public  int J2Victoria = 0;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        turno=contp=contimp=1;
        cuadros=new JLabel[][]{{lblA1,lblB1,lblC1},{lblA2,lblB2,lblC2},{lblA3,lblB3,lblC3}};//Este arreglo almacena lo label
  
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
        btnVmenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rboJugador1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rboJugador1.setSelected(true);
        rboJugador1.setText("Jugador1");
        rboJugador1.setEnabled(false);
        rboJugador1.setName("rboJugador1"); // NOI18N

        rboJugador2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rboJugador2.setText("Jugador2");
        rboJugador2.setEnabled(false);
        rboJugador2.setName("rboJugador2"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VICTORIAS");
        jLabel1.setName("lblVictorias"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jugador1");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jugador2");

        lblVicJ1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblVicJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVicJ1.setText("0");
        lblVicJ1.setName("lblVicJ1"); // NOI18N

        lblVicJ2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblVicJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVicJ2.setText("0");
        lblVicJ2.setName("lblVicJ2"); // NOI18N

        btnSalir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setName("btnSalir"); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblA1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA1.setAlignmentY(0.0F);
        lblA1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblA1MouseClicked(evt);
            }
        });

        lblA2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblA2MouseClicked(evt);
            }
        });

        lblA3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblA3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblA3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblA3MouseClicked(evt);
            }
        });

        lblB1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblB1MouseClicked(evt);
            }
        });

        lblB2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblB2MouseClicked(evt);
            }
        });

        lblB3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblB3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblB3MouseClicked(evt);
            }
        });

        lblC1.setBackground(new java.awt.Color(255, 255, 255));
        lblC1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblC1MouseClicked(evt);
            }
        });

        lblC2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblC2MouseClicked(evt);
            }
        });

        lblC3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblC3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblC3MouseClicked(evt);
            }
        });

        btnVmenu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnVmenu.setText("Menu");
        btnVmenu.setName("btnSalir"); // NOI18N
        btnVmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblA2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblB2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblB3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblC2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblC3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblB1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblC1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(rboJugador2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rboJugador1)
                        .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(btnVmenu))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(lblVicJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVicJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVicJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVicJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(rboJugador1)
                        .addGap(18, 18, 18)
                        .addComponent(rboJugador2)
                        .addGap(33, 33, 33)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblA1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblB1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblC1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblA2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblB2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblC2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblA3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblB3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblC3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblA1MouseClicked
        Dato(lblA1);
    }//GEN-LAST:event_lblA1MouseClicked

    private void lblB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblB1MouseClicked
        Dato(lblB1);
    }//GEN-LAST:event_lblB1MouseClicked

    private void lblC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblC1MouseClicked
        Dato(lblC1);
    }//GEN-LAST:event_lblC1MouseClicked

    private void lblA2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblA2MouseClicked
        Dato(lblA2);
    }//GEN-LAST:event_lblA2MouseClicked

    private void lblB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblB2MouseClicked
        Dato(lblB2);
    }//GEN-LAST:event_lblB2MouseClicked

    private void lblC2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblC2MouseClicked
        Dato(lblC2);
    }//GEN-LAST:event_lblC2MouseClicked

    private void lblA3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblA3MouseClicked
        Dato(lblA3);
    }//GEN-LAST:event_lblA3MouseClicked

    private void lblB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblB3MouseClicked
        Dato(lblB3);
    }//GEN-LAST:event_lblB3MouseClicked

    private void lblC3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblC3MouseClicked
       Dato(lblC3);
    }//GEN-LAST:event_lblC3MouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       if(JOptionPane.showConfirmDialog(null, "Deseab guardar el juego? ")==0){
           System.exit(0);
           
       }
       
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVmenuActionPerformed
        new Menu_Principal().setVisible(true);//hace el JFrame de datos visble
        this.setVisible(false);// hace el JFrame  Menu_Principal invisible
    }//GEN-LAST:event_btnVmenuActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                 Connection miConexion;
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVmenu;
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
 public void Dato(JLabel cuadro) 
    {
        if (!gano)//verifica si no se gano el juego 
        {
            if(cuadro.getText().equals(""))//comprueba que el label no tenga letras
            {
                if (rboJugador1.isSelected())//verifica el valor del turno para saber que letra asigna 
                {
                    cuadro.setText("x");
                    if (contimp>=3)//comprueba que ya esten almenos 3 x en el tablero 
                    {
                        verificar("x");//verifica si la x ya esta en tablero
                        
                    }
                    contimp++;//cuenta las x
                    rboJugador1.setSelected(false);
                    rboJugador2.setSelected(true);
                } 
                else
                {
                    cuadro.setText("o");
                    if (contp>=3) //comprueba que ya esten almenos 3 "0" en el tablero 
                    {
                        verificar("o");//verifica si la o ya esta en el tablero
                        
                    }
                    rboJugador1.setSelected(true);
                    rboJugador2.setSelected(false);
                    contp++;
                }
                turno++;//cuenta las o
            }
        }        
    }
public void verificar(String parametro) 
    {
        int contador=0;
        int a,b; 
        boolean reinicio=false;//inidica si ya se reinicio el juego
        for (int x = 0; x < 2; x++) 
        {
            for (int i = 0; i < cuadros.length; i++) 
            {  
                for (int j = 0; j < cuadros.length; j++) 
                {
                    if (x==0) {
                      a=i;//posicion de la fila
                      b=j;//posicion de la columna 
                    }else
                    {
                        a=j;//posicion de la fila
                        b=i;//posicion de la columna 
                    }
                    if (cuadros[a][b].getText().equals(parametro)) {
                        contador++;//cuenta las de una misma letra
                    }
                }
                if (!gano&&contador==3)  //if si el gane se encontro vertical u horizontamente
                {
                    if(rboJugador1.isSelected()){ // if para las victorias del jugador 1
                      JOptionPane.showMessageDialog(null, "Ganaste");
                      J1Victoria = J1Victoria+1; // contador de victorias del jugador 1
                      prueba = true; // booleano que devuelve true para cerrar el for
                      lblVicJ1.setText(String.valueOf(J1Victoria));
                       if(JOptionPane.showConfirmDialog(null, "Desea iniciar un nuevo juego? ")==0)
                    {
                        nuevo();//reinicia el juego
                        reinicio=true;//inidica q el juego se reinicio
                    }
                    else
                    {
                        gano=false;                        
                    }
                    break;
                    }
                    if(rboJugador2.isSelected()){ // if para contar las victorias del jugador 2
                      JOptionPane.showMessageDialog(null, "Ganaste");
                      J2Victoria = J2Victoria+1; // contador de victorias del jugador 2
                      prueba = true; // booleano que devuelve true para cerrar el for
                      lblVicJ2.setText(String.valueOf(J2Victoria)); 
                       if(JOptionPane.showConfirmDialog(null, "Desea iniciar un nuevo juego? ")==0)
                    {
                        nuevo();//reinicia el juego
                        reinicio=true;//inidica q el juego se reinicio
                    }
                    else
                    {
                        gano=false;                        
                    }
                    break;
                    }
                }
                contador=0;
            } 
            if(prueba){
                prueba = false;
                break;
                
            }
        }
        if (!reinicio) {// if si el gane se encuentra de esquina a esquina
            int pos;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < cuadros.length; j++) {
                   if (i==0) {
                        pos=j;
                    } else {
                        pos=2-j;
                    }
                    if (cuadros[j][pos].getText().equals(parametro)) {
                        contador++;
                    }
                }
                if (contador==3) {
                    if (rboJugador1.isSelected()){
                        JOptionPane.showMessageDialog(null, "Ganaste");
                        J1Victoria = J1Victoria+1; // contador de victorias del jugador 1
                        prueba = true; // booleano que devuelve true para cerrar el for
                        lblVicJ1.setText(String.valueOf(J1Victoria));
                        JOptionPane.showMessageDialog(null, "ganaste");
                        if(JOptionPane.showConfirmDialog(null, "Desea iniciar un nuevo juego? ")==0)
                    {
                        nuevo();
                        break;
                    }
                    else
                    {
                        gano=false;
                        break;
                    }
                    }else{
                        JOptionPane.showMessageDialog(null, "Ganaste");
                        J2Victoria = J2Victoria+1; // contador de victorias del jugador 2
                        prueba = true; // booleano que devuelve true para cerrar el for
                        lblVicJ2.setText(String.valueOf(J2Victoria));  
                    if(JOptionPane.showConfirmDialog(null, "Desea iniciar un nuevo juego? ")==0)
                    {
                        nuevo();
                        break;
                    }
                    else
                    {
                        gano=false;
                        break;
                    }
                    }
                }
                contador=0;
            }
        }
    }
// Meotodo para reiniciar el juego
 public void nuevo() {
        gano=false;
        turno=contp=contimp=2;
        for (int i = 0; i < cuadros.length; i++) {
            for (int j = 0; j < cuadros.length; j++) {
                cuadros[i][j].setText("");
            }
        }
    }
}