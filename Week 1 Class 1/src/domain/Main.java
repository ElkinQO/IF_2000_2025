/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Scanner;
import logic.Ejecicios;

/**
 *
 * @author oliva
 */
public class Main {
    public static void main (String args []){
       // Person person = new Person();
        Scanner sc = new Scanner (System.in);
        
        Ejecicios ejercicios =new Ejecicios();
        
        System.out.println("Ingrese un numero");
        sc.nextInt();
           
        ejercicios.sunNum(1234);
       // System.out.println(ejercicios.capicua(1221));
        
    }
    
}
