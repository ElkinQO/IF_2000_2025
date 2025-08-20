/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author oliva
 */
public class Ejecicios {

    
    // Te amoooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo
    public Ejecicios() {
    }
    

    public boolean capicua(int n) {
        
        int numOriginal = 0;
        int numInvertido = 0;
        int digito = 0;
        while (n > 0) {
            digito = n % 10;
            numInvertido = (numInvertido * 10) + digito;
            n = n / 10;
        }

        if (numInvertido == numOriginal) {

        }
     return true;

    
     
       
    }
public void sunNum(int n){
     int numOriginal = n;
        int numSumado = 0;
        int digito = 0;
        while (n > 0) {
            digito = n % 10;
            numSumado = numSumado + digito;
            n = n / 10;
        }
        System.out.println("La suma de los digitos sumados: " +numOriginal+ "Es: " + numSumado);
}

}


