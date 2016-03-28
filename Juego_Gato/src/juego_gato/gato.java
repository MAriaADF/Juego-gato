   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_gato;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Hellen Lopez A
 */
public class gato {
    Conexion conexion = new Conexion();
    public void MosEstadi(JComboBox cmbRegis1,JComboBox cmbRegis2){
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
   
//    public void Mostrar()
//        {
//           
//        }
//        
//    public String ModiPuntua(String puntuacion_1, String puntuacion_2){
//      String salida = "Se modificarón correctamente los datos del vehiculo de la placa " ;
//        try{
//            conexion.getSt().executeUpdate("UPDATE dbo.Datos_Jugador SET "
//            + "Puntuacion_1= "+puntuacion_1 + "' WHERE Puntuacion_2='" + puntuacion_2+ "'");
//        }catch (Exception ex){
//            salida = "No se pudo modificar los datos del vehiculo de la placa " ;
//        }
//       return salida;
//    }
//public String BorrarJuego( ){
//  String salida = "Datos borrados exitosamente";
//    try{//elimina los datos de la tabla
//        conexion.getSt().executeUpdate("DELETE FROM dbo.Juego ");
//    }catch (Exception ex){
//        salida = "No se pudo borrar por favor intentelo de nuevo" ;
//    }
//        return salida;
//    }
}
