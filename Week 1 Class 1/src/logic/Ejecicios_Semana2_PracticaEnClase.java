/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author oliva
 */
public class Ejecicios_Semana2_PracticaEnClase {

    public Ejecicios_Semana2_PracticaEnClase() {
    }

    public void quiz2_A_primos() {

    }

    public void quiz2_A_Piramide(int n) {

        for (int i = 1; i <= n; i++) {
            //controla los espacios vacios
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("");

            }//endForInterno_A
            //controla los *s de la piramide
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }//endForInterno_B
            System.out.println("");
        }//endForExterno
    }

    public void ejercioA(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
            for (int j = 1; j <= n; j++) {
                System.out.print("*     ");
            }
            // System.out.println(" * ");

            /* for (int j = 1; j <= (n - i); j++) {
                System.out.print("");

            }
            for (int k = 1; k <= (2 * n); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }//endForExterno*/
        }
    }

    public void imprimirFiguraConCentro(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else if (i == n / 2 + 1 && j == n / 2 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
