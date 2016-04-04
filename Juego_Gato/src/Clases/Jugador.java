package Clases;

import java.awt.List;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Clases.Conexion;
import juego_gato.Datos;

/**
 *
 * @author Hellen Lopez A-Alejandro Salas
 */
public class Jugador {

    Conexion conexion = new Conexion();
    public static String nombre1, nombre2;

    /**
     * Este metodo me va a insertar los nombres en la tabla Datos_Jugadores
     *
     * @param Nombre
     */
    public void InsertarJugador(String Nombre) {
        Statement s;
        try {
            s = Conexion.cone.getCon().createStatement();
            s.executeUpdate("INSERT INTO dbo.Datos_Jugadores(Nombre)"
                    + " VALUES('" + Nombre + "')");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public int BuscarNombre(String Nombre) {
        int cont = 0;
        try {
            conexion.rs = conexion.st.executeQuery("SELECT * FROM dbo.Datos_Jugadores where "
                    + "Nombre = '" + Nombre + "'");
            while (conexion.rs.next()) {
                cont++;
            }
            conexion.rs.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Usuario Registrado");
        }
        return cont;
    }

    public void CargarCombo(JComboBox cmbRegis1, JComboBox cmbRegis2) {
        try {
            conexion.rs = conexion.st.executeQuery("SELECT * FROM dbo.Datos_Jugadores");
            while (conexion.rs.next()) {
                cmbRegis1.addItem(conexion.rs.getString(1));
                cmbRegis2.addItem(conexion.rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    DefaultTableModel table = new DefaultTableModel();
    Object[] dato = new Object[4];

    public void MostrarTabla(JTable jtable) {

        table.addColumn("Nombre");
        table.addColumn("Ganes");
        table.addColumn("Empates");
        table.addColumn("Perdidas");
        try {
            conexion.rs = conexion.st.executeQuery("SELECT * FROM dbo.Datos_Jugadores");
            while (conexion.rs.next()) {
                dato[0] = conexion.rs.getString("Nombre");
                dato[1] = conexion.rs.getInt("Gane");
                dato[2] = conexion.rs.getInt("Empate");
                dato[3] = conexion.rs.getInt("Perdidas");
                table.addRow(dato);
            }
            jtable.setModel(table);
        } catch (SQLException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void listaJuga(List listMostar) {
        try {
            conexion.rs = conexion.st.executeQuery("SELECT * FROM dbo.Datos_Jugadores");
            while (conexion.rs.next()) {
                listMostar.addItem(conexion.rs.getString(1));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
