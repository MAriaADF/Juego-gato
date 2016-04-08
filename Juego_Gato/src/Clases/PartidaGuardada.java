/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Conexion;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import juego_gato.*;

/**
 *
 * @author Hellen Lopez, Alejandro Salas
 */
public class PartidaGuardada {

    Conexion conexion = new Conexion();
    Juego juego = new Juego();
    public JLabel[][] cuadros;
    public String A1, A2, A3, B1, B2, B3, C1, C2, C3;

    public void InsertarTablero(PartidaGuardada dato) {
        //Statement s;
        int a = Juego.empate;
        try {
            // s = Conexion.cone.getCon().createStatement();
            new Conexion().st.executeUpdate("INSERT INTO dbo.JUEGO(A1,A2,A3,B1,B2,B3,C1,C2,C3,NombreJ1,NombreJ2,VictoriaJ1,VictoriaJ2,Empates,Empate)"
                    + " VALUES('" + dato.A1 + "','" + dato.A2 + "','" + dato.A3 + "','" + dato.B1 + "','"
                    + dato.B2 + "','" + dato.B3 + "','" + dato.C1 + "','" + dato.C2 + "','" + dato.C3 + "','" + Principal.rboJugador1.getText() + "','" + Principal.rboJugador2.getText() + "','" + Integer.parseInt(Principal.lblVicJ1.getText()) + "','" + Integer.parseInt(Principal.lblVicJ2.getText()) + "','" + Integer.parseInt(Principal.lblEmpates.getText()) + "','"+a+"')");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    /**
     *Guarda el tablero en la base de datos 
     */
    public void GuardarJuego() {
        PartidaGuardada tablero = new PartidaGuardada();
        int dec = JOptionPane.showConfirmDialog(null, "Desea guadar el juego?", "Advertencia ",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (dec == JOptionPane.YES_OPTION) {
            tablero.A1 = Principal.lblA1.getText();
            tablero.A2 = Principal.lblA2.getText();
            tablero.A3 = Principal.lblA3.getText();
            tablero.B1 = Principal.lblB1.getText();
            tablero.B2 = Principal.lblB2.getText();
            tablero.B3 = Principal.lblB3.getText();
            tablero.C1 = Principal.lblC1.getText();
            tablero.C2 = Principal.lblC2.getText();
            tablero.C3 = Principal.lblC3.getText();
            tablero.InsertarTablero(tablero);
            System.exit(0);// cierra el programa
        } else {
            new Jugador().GuardarRegistroJugador1();
            new Jugador().GuardarRegistroJugador2();
            new Menu_Principal().setVisible(true);
            new Principal().setVisible(false);
        }
    }

    /**
     *Muestra el Juego que a sido guardado en la base de datos 
     */
    public void MostrarJuego() {
        cuadros = new JLabel[][]{{Principal.lblA1, Principal.lblB1, Principal.lblC1}, {Principal.lblA2, Principal.lblB2, Principal.lblC2}, {Principal.lblA3, Principal.lblB3, Principal.lblC3}};//Este arreglo almacena lo label
        try {
            conexion.rs = conexion.st.executeQuery("SELECT * FROM dbo.JUEGO");
            int contador = 1;
            while (conexion.rs.next()) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        cuadros[j][i].setText(conexion.rs.getString(contador));
                        contador++;
                    }
                }
                Principal.rboJugador1.setText(conexion.rs.getString("NombreJ1"));
                Principal.rboJugador2.setText(conexion.rs.getString("NombreJ2"));
                Principal.lblVicJ1.setText(conexion.rs.getString("VictoriaJ1"));
                Principal.lblVicJ2.setText(conexion.rs.getString("VictoriaJ2"));
                Principal.lblEmpates.setText(conexion.rs.getString("Empates"));
                Juego.empate = Integer.parseInt(conexion.rs.getString("Empate"));
            }
            try {
                new Conexion().st.execute("DELETE FROM dbo.JUEGO");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    /**
     *
     * @Metodo que retorna si hay o no una partida guardada en la DB
     */
    public boolean BuscarPartida() {
        try {
            conexion.rs = conexion.st.executeQuery("SELECT * FROM dbo.JUEGO");
            while (conexion.rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encuentra ninguna partida");
        }
        return false;
    }
}
