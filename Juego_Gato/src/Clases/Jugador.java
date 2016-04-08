package Clases;

import Clases.Conexion;
import java.awt.List;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import juego_gato.Principal;

/**
 *
 * @author Hellen Lopez, Alejandro Salas
 */
public class Jugador {

    Conexion conexion = new Conexion();
    public static String nombre1, nombre2;
    public int Ganes, Empates, Perdidas, FilasC; // Variables donde se almacenará lo que se encuentra en la DB
    public String Nombre, Cadena; // Variable Nombre para Guardar el nombre de los jugadores, Variable Cadena para el string del UPDATE
    /**
     * Este metodo me va a insertar los nombres en la tabla Datos_Jugadores
     *
     * @param Nombre
     */
    public void InsertarJugador(String Nombre) {
        //Statement s;
        try {
            //s = Conexion.cone.getCon().createStatement();
            conexion.st.executeUpdate("INSERT INTO dbo.Datos_Jugadores(Nombre)"
                    + " VALUES('" + Nombre + "')");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    /**
     *Metodo para buscar si ya esta registrado un usuario en la DB
     * @param Nombre
     * @return
     */
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

    /**
     *Muestra los nombres de los jugadores ya registrados 
     * en combobox
     * @param cmbRegis1
     * @param cmbRegis2
     */
    public void CargarCombo(JComboBox cmbRegis1, JComboBox cmbRegis2) {
        try {
            conexion.rs = conexion.st.executeQuery("SELECT * FROM dbo.Datos_Jugadores");
            while (conexion.rs.next()) {
                cmbRegis1.addItem(conexion.rs.getString(1));
                cmbRegis2.addItem(conexion.rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    DefaultTableModel table = new DefaultTableModel();
    Object[] dato = new Object[4];

    /**
     *Muestra los datos de la estadistica del jugador en una tabla 
     * @param jtable
     */
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
                dato[2] = conexion.rs.getInt("Empates");
                dato[3] = conexion.rs.getInt("Perdidas");
                table.addRow(dato);
            }
            jtable.setModel(table);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    /**
     *Muestar una lista todos los jugadores registrados 
     * @param listMostar
     */
    public void listaJuga(List listMostar) {
        try {
            conexion.rs = conexion.st.executeQuery("SELECT * FROM dbo.Datos_Jugadores");
            while (conexion.rs.next()) {
                listMostar.addItem(conexion.rs.getString(1));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    /**
     *
     * @Metodo que retorna si se logro la actualizacion del jugador 1
     */
    public boolean GuardarRegistroJugador1() {
        boolean bool = false;// variable del retorno
        Nombre = Principal.rboJugador1.getText();
        try {
            conexion.rs = conexion.st.executeQuery("SELECT * FROM dbo.Datos_Jugadores WHERE Nombre='" + Nombre + "'");
            while (conexion.rs.next()) {
                Ganes = conexion.rs.getInt("Gane"); // Almacenará en ganes los ganes del jugador
                Empates = conexion.rs.getInt("Empates");// Almacenará en Empates los empates del jugador
                Perdidas = conexion.rs.getInt("Perdidas"); // Almacenará en Perdidas las veces perdidas por el jugador
                break;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        //String para el UPDATE del jugador 2
        Cadena = ("UPDATE dbo.Datos_Jugadores SET "
                + "Gane = '" + (Integer.parseInt(Principal.lblVicJ2.getText()) + Ganes)
                + "',Empates='" + (Integer.parseInt(Principal.lblEmpates.getText()) + Empates)
                + "',Perdidas='" + (Integer.parseInt(Principal.lblVicJ2.getText()) + Perdidas) + "'"
                + "WHERE Nombre='" + Nombre + "'");
        try {
            FilasC = conexion.st.executeUpdate(Cadena);
            if (FilasC > 0) {
                bool = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        Limpiar(); // llamar al metodo limpiar
        return bool;
    }

    /**
     *
     * @Metodo que retona si se logro la actuaizacion del jugador 2
     */
    public boolean GuardarRegistroJugador2() {
        boolean bool = false; // variable el retorno
        Nombre = Principal.rboJugador2.getText();
        try {
            conexion.rs = conexion.st.executeQuery("SELECT * FROM dbo.Datos_Jugadores WHERE Nombre='" + Nombre + "'");
            while (conexion.rs.next()) {
                Ganes = conexion.rs.getInt("Gane");// Almacenará en ganes los ganes del jugador
                Empates = conexion.rs.getInt("Empates");// Almacenará en Empates los empates del jugador
                Perdidas = conexion.rs.getInt("Perdidas");// Almacenará en Perdidas las veces perdidas por el jugador
                break;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        //String para el UPDATE del jugador 2
        Cadena = ("UPDATE dbo.Datos_Jugadores SET "
                + "Gane = '" + (Integer.parseInt(Principal.lblVicJ2.getText()) + Ganes)
                + "',Empates='" + (Integer.parseInt(Principal.lblEmpates.getText()) + Empates)
                + "',Perdidas='" + (Integer.parseInt(Principal.lblVicJ1.getText()) + Perdidas) + "'"
                + "WHERE Nombre='" + Nombre + "'");
        try {
            FilasC = conexion.st.executeUpdate(Cadena);
            if (FilasC > 0) {
                bool = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        Limpiar(); // llamar al metodo limpar
        return bool;
    }

    /**
     * Metodo que limpia las variables para guardar los registros de los
     * usuarios
     */
    public void Limpiar() {
        Ganes = 0;
        Perdidas = 0;
        Empates = 0;
        FilasC = 0;
        Nombre = "";
        Cadena = "";
    }
    
}
