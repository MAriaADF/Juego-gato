   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_gato;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

/**
 *
 * @author Hellen Lopez A
 */
public class gato {
 
    public void Insertar(String jugador1,String jugador2){
        Statement s;
        try {
            s= Conexion.cone.getCon().createStatement();
            s.executeUpdate("INSERT INTO dbo.Datos_Jugador(Jugador_1, Jugador_2)"
                + " VALUES('"+ jugador1 +"','"+ jugador2+"')");
        } catch (Exception ex) {
        }         
    }
//    public int BuscarNombre(String jugador1){
//     int cont = 0;
//        try{
//            conexion.rs = conexion.st.executeQuery("SELECT * FROM dbo.Datos_Jugador where "
//                    + "Jugador_1 = '" + jugador1 + "'");
//                while(conexion.rs.next())
//                {
//                    cont++;
//                }
//               conexion.rs.close();
//            }
//            catch (Exception ex)
//            {
//               JOptionPane.showConfirmDialog(null,"Ya estas registrado " );
//            }
//         return cont;
//    }
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
