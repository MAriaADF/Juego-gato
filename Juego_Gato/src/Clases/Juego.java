/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Conexion;
import Clases.PartidaGuardada;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import juego_gato.*;

/**
 *
 * @author Hellen Lopez, Alejandro Salas
 */
public class Juego {

    public boolean gano = false; // Variable booleana para el gane del jugador 
    public JLabel[][] cuadros; // Matriz de tipo JLabel del juego
    public int J1Victoria, J2Victoria, Empates; // Cnotadores de victorias y empates de los jugadores
    public static int empate; // variable que llevara el contador de los empates 
    Conexion conex = new Conexion();

    /**
     *
     * @param cuadro, Metodo que elije si es "X" o "O" dependediendo de los radiobuttons
     */
    public void Dato(JLabel cuadro) {
        cuadros = new JLabel[][]{{Principal.lblA1, Principal.lblB1, Principal.lblC1}, {Principal.lblA2, Principal.lblB2, Principal.lblC2}, {Principal.lblA3, Principal.lblB3, Principal.lblC3}};//Este arreglo almacena lo label
        if (!gano)//verifica si no se gano el juego 
        {
            if (cuadro.getText().equals(""))//comprueba que el label no tenga letras
            {
                if (Principal.rboJugador1.isSelected())//verifica el valor del turno para saber que letra asigna 
                {
                    empate++;
                    cuadro.setText("x");
                    verificar("x");//verifica si la x ya esta en tablero
                    Principal.rboJugador2.setSelected(true);
                } else {
                    empate++;
                    cuadro.setText("o");
                    verificar("o");//verifica si la o ya esta en el tablero
                    Principal.rboJugador1.setSelected(true);
                }

            }
        }
    }

    /**
     *
     * @param parametro, se envia la "X" o las "O" y se evalua paraa saber si
     * gano, o empataron los jugadores
     */
    public void verificar(String parametro) {
        int contador = 0;
        int a, b;
        boolean reinicio = false;//inidica si ya se reinicio el juego
        if (empate == 9) {
            Empates++;
            Principal.lblEmpates.setText(String.valueOf(Empates));
            if (JOptionPane.showConfirmDialog(null, "EMPATE \n Desea iniciar un nuevo juego? ", "EMPATE",
                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0) {
                nuevo();//reinicia el juego
            } else {
                nuevo();
                new PartidaGuardada().GuardarJuego();
            }
        } else {
            for (int x = 0; x < 2; x++) {
                for (int i = 0; i < cuadros.length; i++) {
                    for (int j = 0; j < cuadros.length; j++) {
                        if (x == 0) {
                            a = i;//posicion de la fila
                            b = j;//posicion de la columna 
                        } else {
                            a = j;//posicion de la fila
                            b = i;//posicion de la columna 
                        }
                        if (cuadros[a][b].getText().equals(parametro)) {
                            contador++;//cuenta las de una misma letra
                        }
                    }
                    if (!gano && contador == 3) //if si el gane se encontro vertical u horizontamente
                    {
                        if (Principal.rboJugador1.isSelected()) { // if para las victorias del jugador 1
                            J1Victoria = J1Victoria + 1; // contador de victorias del jugador 1
                            gano = true; // booleano que devuelve true para cerrar el for
                            Principal.lblVicJ1.setText(String.valueOf(J1Victoria));
                            if (JOptionPane.showConfirmDialog(null, "GANASTE: " + Principal.rboJugador1.getText() + " \n Desea iniciar un nuevo juego? ", "Tablero",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0) {
                                nuevo();//reinicia el juego
                                reinicio = true;//inidica q el juego se reinicio
                                Principal.rboJugador1.setSelected(true);
                            } else {
                                nuevo();
                            }
                        } else {
                            J2Victoria = J2Victoria + 1; // contador de victorias del jugador 2
                            gano = true; // booleano que devuelve true para cerrar el for
                            Principal.lblVicJ2.setText(String.valueOf(J2Victoria));
                            if (JOptionPane.showConfirmDialog(null, "GANASTE: " + Principal.rboJugador2.getText() + " \n Desea iniciar un nuevo juego? ", "Tablero",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0) {
                                nuevo();//reinicia el juego
                                reinicio = true;//inidica q el juego se reinicio
                                Principal.rboJugador2.setSelected(true);
                            } else {
                                nuevo();
                            }
                        }
                    }
                    contador = 0;
                }
                if (gano) {
                    gano = false;
                    break;
                }
            }
            if (!reinicio) {// if si el gane se encuentra de esquina a esquina
                int pos;
                for (int i = 0; i < cuadros.length; i++) {
                    for (int j = 0; j < cuadros.length; j++) {
                        if (i == 0) {
                            pos = j;
                        } else {
                            pos = 2 - j;
                        }
                        if (cuadros[j][pos].getText().equals(parametro)) {
                            contador++;
                        }
                    }
                    if (contador == 3) {
                        if (Principal.rboJugador1.isSelected()) {
                            J1Victoria = J1Victoria + 1; // contador de victorias del jugador 1
                            Principal.lblVicJ1.setText(String.valueOf(J1Victoria));
                            if (JOptionPane.showConfirmDialog(null, "GANASTE: " + Principal.rboJugador1.getText() + " \n Desea iniciar un nuevo juego? ", "Tablero",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0) {
                                nuevo();
                                break;
                            } else {
                                break;
                            }
                        } else {
                            J2Victoria = J2Victoria + 1; // contador de victorias del jugador 2
                            Principal.lblVicJ2.setText(String.valueOf(J2Victoria));
                            if (JOptionPane.showConfirmDialog(null, "GANASTE: " + Principal.rboJugador2.getText() + " \n Desea iniciar un nuevo juego? ", "Tablero",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0) {
                                nuevo();
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    contador = 0;
                }
            }
        }
    }

    /**
     *metodo para reiniciar el juego
     */
    public void nuevo() {
        empate = 0; // reinicia el contador de empates 
        for (int i = 0; i < cuadros.length; i++) {
            for (int j = 0; j < cuadros.length; j++) {
                cuadros[i][j].setText("");
            }
        }
    }
}
