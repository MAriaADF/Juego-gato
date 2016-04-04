/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.*;
import juego_gato.*;

/**
 *
 * @author Hellen Lopez A-Alejandro Salas
 */
public class Juego {

    public boolean gano = false;
    public boolean prueba = false;
    public JLabel[][] cuadros;
    public int J1Victoria = 0;
    public int J2Victoria = 0;

    Conexion conex = new Conexion();

    //Meotodo q inicia el juego
    public void Dato(JLabel cuadro) {
        cuadros = new JLabel[][]{{Principal.lblA1, Principal.lblB1, Principal.lblC1}, {Principal.lblA2, Principal.lblB2, Principal.lblC2}, {Principal.lblA3, Principal.lblB3, Principal.lblC3}};//Este arreglo almacena lo label
        if (!gano)//verifica si no se gano el juego 
        {
            if (cuadro.getText().equals(""))//comprueba que el label no tenga letras
            {
                if (Principal.rboJugador1.isSelected())//verifica el valor del turno para saber que letra asigna 
                {
                    cuadro.setText("x");
                    verificar("x");//verifica si la x ya esta en tablero
                    Principal.rboJugador1.setSelected(false);
                    Principal.rboJugador2.setSelected(true);
                } else {
                    cuadro.setText("o");
                    verificar("o");//verifica si la o ya esta en el tablero
                    Principal.rboJugador1.setSelected(true);
                    Principal.rboJugador2.setSelected(false);
                }

            }
        }
    }

    public void verificar(String parametro) {
        int contador = 0;
        int a, b;
        boolean reinicio = false;//inidica si ya se reinicio el juego
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
                        JOptionPane.showMessageDialog(null, "Ganaste: " + Principal.rboJugador1.getText());
                        J1Victoria = J1Victoria + 1; // contador de victorias del jugador 1
                        prueba = true; // booleano que devuelve true para cerrar el for
                        Principal.lblVicJ1.setText(String.valueOf(J1Victoria));
                        if (JOptionPane.showConfirmDialog(null, "Desea iniciar un nuevo juego? ", "Tablero",
                                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0) {
                            nuevo();//reinicia el juego
                            reinicio = true;//inidica q el juego se reinicio
                        } else {
                            gano = false;
                        }
                        break;
                    }
                    if (Principal.rboJugador2.isSelected()) { // if para contar las victorias del jugador 2
                        JOptionPane.showMessageDialog(null, "Ganaste");
                        J2Victoria = J2Victoria + 1; // contador de victorias del jugador 2
                        prueba = true; // booleano que devuelve true para cerrar el for
                        Principal.lblVicJ2.setText(String.valueOf(J2Victoria));
                        if (JOptionPane.showConfirmDialog(null, "Desea iniciar un nuevo juego? ") == 0) {
                            nuevo();//reinicia el juego
                            reinicio = true;//inidica q el juego se reinicio
                        } else {
                            gano = false;
                        }
                        break;
                    }
                }
                if (!gano && contador == 4) {
                    if (JOptionPane.showConfirmDialog(null, "EMPATE") == 0) {
                        nuevo();
                        reinicio = true;
                    } else {
                        gano = false;
                    }
                }
                contador = 0;
            }
            if (prueba) {
                prueba = false;
                break;

            }
        }
        if (!reinicio) {// if si el gane se encuentra de esquina a esquina
            int pos;
            for (int i = 0; i < 3; i++) {
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
                        JOptionPane.showMessageDialog(null, "Ganaste: " + Principal.rboJugador1.getText());
                        J1Victoria = J1Victoria + 1; // contador de victorias del jugador 1
                        prueba = true; // booleano que devuelve true para cerrar el for
                        Principal.lblVicJ1.setText(String.valueOf(J1Victoria));
                        JOptionPane.showMessageDialog(null, "ganaste");
                        if (JOptionPane.showConfirmDialog(null, "Desea iniciar un nuevo juego? ") == 0) {
                            nuevo();
                            break;
                        } else {
                            gano = false;
                            break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ganaste" + Principal.rboJugador2.getText());
                        J2Victoria = J2Victoria + 1; // contador de victorias del jugador 2
                        prueba = true; // booleano que devuelve true para cerrar el for
                        Principal.lblVicJ2.setText(String.valueOf(J2Victoria));
                        if (JOptionPane.showConfirmDialog(null, "Desea iniciar un nuevo juego? ") == 0) {
                            nuevo();
                            break;
                        } else {
                            gano = false;
                            break;
                        }
                    }
                }
                contador = 0;
            }
        }
    }

    public void nuevo() {
        gano = false;
        for (int i = 0; i < cuadros.length; i++) {
            for (int j = 0; j < cuadros.length; j++) {
                cuadros[i][j].setText("");
            }
        }
    }

}
