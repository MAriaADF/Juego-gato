/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_gato;

import java.sql.Statement;
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
            s.executeUpdate("INSERT INTO dbo.Datos_Jugador(Jugador_1)"
                + " VALUES('"+ Nombre +"')");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }         
    }
    public int BuscarNombre(String Nombre){
     int cont = 0;
        try{
            conexion.rs = conexion.st.executeQuery("SELECT * FROM dbo.Datos_Jugadores where "
                    + "Jugador_1 = '" + Nombre + "'");
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
}
