/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.util.Random; //Para poner las minas aleatoriamente en el tablero

/**
 *
 * @
 */
public class Tablero {
    private int filas; //num de filas del tablerp
    private int columnas; //num de columnas del tablero
    private int minas; //num de minas en el tablero
    private boolean[][] minasLugar; //matriz para saber si hay una mina en las casillas
    private int[][] cantidadMinas; //matriz con el conteo de minas adyacentes de las casillas
    private boolean[][] encontradas; //matriz que dice si una casilla fue descubierta
    
public Tablero(int filas, int columnas, int minas){
    this.filas = filas;
    this.columnas = columnas;
    this.minas = minas;
    this.minasLugar = new boolean[filas][columnas]; //Inicializa la matriz
    this.cantidadMinas = new int [filas][columnas]; //Inicializa la matriz
    this.encontradas = new boolean [filas][columnas]; //Inicializa la matriz
    ponerMinas(); //pone las minas en el tablero
    calcularCantidadMinas(); //calcula la cantidad de minas adyacentes
}

private void ponerMinas() {
    Random random = new Random(); //generador de numeros aleatorios
    int minasPuestas = 0; //cantidad de minas puestas en el tablero
    while (minasPuestas < minas) { //mientras que minasPuestas sea menor que las minas en el tablero
        int fila = random.nextInt(filas); //Se crea una fila aleatoria
        int columna = random.nextInt(columnas); //Se crea una columna aleatoria
        if (!minasLugar[fila][columna]) { //Ver si no hay minas en esa posicion
            minasLugar[fila][columna] = true; //Pone la mina
            minasPuestas++; //aumenta la cantidad de minas puestas en el tablero
        }
    }       
}


}
