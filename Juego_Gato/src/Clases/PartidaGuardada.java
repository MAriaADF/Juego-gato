/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;
import javax.swing.*;
import juego_gato.*;

/**
 *
 *
 * @author Hellen Lopez A-Alejandro Salas
 */
public class PartidaGuardada {

    Conexion conexion = new Conexion();
    public JLabel[][] cuadros;
    public String A1, A2, A3, B1, B2, B3, C1, C2, C3;

    public void InsertarTablero(PartidaGuardada dato) {
        Statement s;
        try {
            s = Conexion.cone.getCon().createStatement();
            s.executeUpdate("INSERT INTO dbo.JUEGO(A1,A2,A3,B1,B2,B3,C1,C2,C3)"
                    + " VALUES('" + dato.A1 + "','" + dato.A2 + "','" + dato.A3 + "','" + dato.B1 + "','"
                    + dato.B2 + "','" + dato.B3 + "','" + dato.C1 + "','" + dato.C2 + "','" + dato.C3 + "')");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

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
        } else if (dec == JOptionPane.NO_OPTION) {
            //limpia el radiobutt
        }
    }

    public void MostrarJuego() {
        cuadros = new JLabel[][]{{Principal.lblA1, Principal.lblB1, Principal.lblC1}, {Principal.lblA2, Principal.lblB2, Principal.lblC2}, {Principal.lblA3, Principal.lblB3, Principal.lblC3}};//Este arreglo almacena lo label
        try {

            conexion.rs = conexion.st.executeQuery("SELECT * FROM dbo.JUEGO");
            while (conexion.rs.next()) {
                cuadros[0][0].setText(conexion.rs.getString("A1"));
                cuadros[1][0].setText(conexion.rs.getString("A2"));
                cuadros[2][0].setText(conexion.rs.getString("A3"));
                cuadros[0][1].setText(conexion.rs.getString("B1"));
                cuadros[1][1].setText(conexion.rs.getString("B2"));
                cuadros[2][1].setText(conexion.rs.getString("B3"));
                cuadros[0][2].setText(conexion.rs.getString("C1"));
                cuadros[1][2].setText(conexion.rs.getString("C2"));
                cuadros[2][2].setText(conexion.rs.getString("C3"));
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
