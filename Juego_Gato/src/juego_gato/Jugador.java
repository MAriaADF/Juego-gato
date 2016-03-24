/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_gato;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Hellen Lopez AAlejandro Salas
 */
public class Jugador {
     Conexion conexion = new Conexion();
     
    public void InsertarJugador(String Nombre){
        Statement s;
        try {
            s= Conexion.cone.getCon().createStatement();
            s.executeUpdate("INSERT INTO dbo.Datos_Jugadores(Nombre)"
                + " VALUES('"+ Nombre +"')");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }         
    }
    public int BuscarNombre(String Nombre){
     int cont = 0;
        try{
            conexion.rs = conexion.st.executeQuery("SELECT * FROM dbo.Datos_Jugadores where "
                    + "Nombre = '" + Nombre + "'");
                while(conexion.rs.next())
                {
                    cont++;
                }
               conexion.rs.close();
            }
            catch (Exception ex)
            {
               JOptionPane.showConfirmDialog(null,"Ya estas registrado " );
            }
         return cont;
    }
    public void CargarCombo(JComboBox cmbRegis1,JComboBox cmbRegis2){
     try {
            conexion.rs = conexion.st.executeQuery("SELECT * FROM dbo.Datos_Jugadores");
            while(conexion.rs.next())
            {
           cmbRegis1.addItem(conexion.rs.getString(1));
           cmbRegis2.addItem(conexion.rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
