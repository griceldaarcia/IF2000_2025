/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author Griss
 */
public class Ejercicios_semana2_PracticaEnClase {

    public Ejercicios_semana2_PracticaEnClase() {
    }
   
      
    public void quiz2_B_piramide(int n){
        
        for (int i = 1; i <= n; i++) {
            //controla los espacios vacios
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");          
                
                
        }//endForInterno_A
         //controla los *s de la piramide
        for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
         }//endForInterno_B
        System.out.println();
                
            }//endForexterno
        }//endMetodo
        
        
    /*Realice un algoritmo que permita formar la siguiente forma
     * * * * *
     *       *
     *       *
     *       *
     * * * * *
    */
    
    

 // Método principal 
    public void ejercicioA() {
        int n = 5; // Tamaño del cuadrado
        Ejercicio_A_cuadrado(n);
    }

    // Método
    public void Ejercicio_A_cuadrado(int n) {
        for (int i = 1; i <= n; i++) {          
            for (int j = 1; j <= n; j++) {      
               
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");// espacio en el centro
                }
            }
            System.out.println(); // salto de línea
        }
    }


     /*Realice un algoritmo que permita formar la siguiente figura
     ************
     ***********
     **********
     *********
     ********
     *******
     ******
     *****
     ****
     ***
     **
     * 
    */

    // Método principal
    public void ejercicioB() {
        int n = 12; // tamaño inicial de la base
        Ejercicio_B_triangulo_invertido(n);
    }

  
    public void Ejercicio_B_triangulo_invertido(int n) {
        for (int i = n; i >= 1; i--) {       
            for (int j = 1; j <= i; j++) { 
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*Realice un algoritmo que permita formar la siguiente figura
    **********
     *********
      ********
       *******
        ******
         *****
          ****
           ***
            **
             *
    */
    // Método principal para probar
    public void ejercicioC() {
        int n = 10; // tamaño inicial de la base
        Ejercicio_C_triangulo(n);
    }

    // Dibuja el triángulo invertido desplazado
    public void Ejercicio_C_triangulo(int n) {
        for (int i = n; i >= 1; i--) {
            // espacios a la izquierda
            for (int e = 0; e < n - i; e++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public void ejercicioD() {
        Ejercicio_D_arreglo();
    }

    public void Ejercicio_D_arreglo() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros); // Orden ascendente

        System.out.println("\nArreglo ordenado ascendentemente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }



    public void ejercicioE() {
        Ejercicio_E_arreglo();
    }

    public void Ejercicio_E_arreglo() {
        Integer[] numeros = new Integer[100];

        // Generar 100 números aleatorios entre 1 y 400
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 400 + 1);
        }

        // Orden descendente
        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println("\nArreglo ordenado descendentemente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }



    public void ejercicioF() {
        Ejercicio_F_tablero();
    }

    public void Ejercicio_F_tablero() {
        char[][] tablero = new char[8][8];

        // Inicializar con espacios vacíos
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = ' ';
            }
        }

        // Colocar fichas Negras (N) en A, B, C
        for (int i = 0; i < 3; i++) {
            for (int j = (i + 1) % 2; j < 8; j += 2) {
                tablero[i][j] = 'N';
            }
        }

        // Colocar fichas Rojas (R) en F, G, H
        for (int i = 5; i < 8; i++) {
            for (int j = (i + 1) % 2; j < 8; j += 2) {
                tablero[i][j] = 'R';
            }
        }

        // Imprimir tablero
        System.out.println("  1 2 3 4 5 6 7 8");
        for (int i = 0; i < 8; i++) {
            char fila = (char) ('A' + i);
            System.out.print(fila + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}


