
package juego_gato;

import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hellen Lopez A-Alejandro salas
 */
public class Tablero {
    
    int turno,contp,contimp;
    boolean gano=false;//indica si ya hubo o no un gane
    boolean prueba=false;
    public String A1,A2,A3,B1,B2,B3,C1,C2,C3;
    public JLabel[][] cuadros;//matriz para guardar los label
    public  int J1Victoria = 0;
    public  int J2Victoria = 0;
     public void Dato(JLabel cuadro) 
    {
        if (!gano)//verifica si no se gano el juego 
        {
            if(cuadro.getText().equals(""))//comprueba que el label no tenga letras
            {
                if (Principal.rboJugador1.isSelected())//verifica el valor del turno para saber que letra asigna 
                {
                    cuadro.setText("x");
                    if (contimp>=3)//comprueba que ya esten almenos 3 x en el tablero 
                    {
                        verificar("x");//verifica si la x ya esta en tablero
                        
                    }
                    contimp++;//cuenta las x
                    Principal.rboJugador1.setSelected(false);
                    Principal.rboJugador2.setSelected(true);
                } 
                else
                {
                    cuadro.setText("o");
                    if (contp>=3) //comprueba que ya esten almenos 3 "0" en el tablero 
                    {
                        verificar("o");//verifica si la o ya esta en el tablero
                        
                    }
                    Principal.rboJugador1.setSelected(true);
                    Principal.rboJugador2.setSelected(false);
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
                    if(Principal.rboJugador1.isSelected()){ // if para las victorias del jugador 1
                      JOptionPane.showMessageDialog(null, "Ganaste");
                      J1Victoria = J1Victoria+1; // contador de victorias del jugador 1
                      prueba = true; // booleano que devuelve true para cerrar el for
                      Principal.lblVicJ1.setText(String.valueOf(J1Victoria));
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
                    if(Principal.rboJugador2.isSelected()){ // if para contar las victorias del jugador 2
                      JOptionPane.showMessageDialog(null, "Ganaste");
                      J2Victoria = J2Victoria+1; // contador de victorias del jugador 2
                      prueba = true; // booleano que devuelve true para cerrar el for
                      Principal.lblVicJ2.setText(String.valueOf(J2Victoria)); 
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
                    if (Principal.rboJugador1.isSelected()){
                        JOptionPane.showMessageDialog(null, "Ganaste");
                        J1Victoria = J1Victoria+1; // contador de victorias del jugador 1
                        prueba = true; // booleano que devuelve true para cerrar el for
                        Principal.lblVicJ1.setText(String.valueOf(J1Victoria));
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
                        Principal.lblVicJ2.setText(String.valueOf(J2Victoria));  
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
    public void InsertarTablero(Tablero dato){
        Statement s;
        try {
            s= Conexion.cone.getCon().createStatement();
            s.executeUpdate("INSERT INTO dbo.Juego(A1,A2,A3,B1,B2,B3,C1,C2,C3)"
                + " VALUES('"+ dato.A1+ "','"+ dato.A2+"','"+ dato.A3+"','"+ dato.B1+"','"+
                    dato.B2+"','"+ dato.B3+"','"+ dato.C1+"','"+ dato.C2+"','"+ dato.C3+"')");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }         
    }
}
