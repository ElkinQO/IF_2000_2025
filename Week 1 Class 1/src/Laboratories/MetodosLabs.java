/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratories;

/**
 *
 * @author oliva
 */
public class MetodosLabs {

    public MetodosLabs() {
    }

    public int parImpar(int n) {

        if (n % 2 == 0) {
            System.out.println(n + " Es un numero par");

        } else {
            System.out.println(n + " Es un numero impar");
        }

        return n;
    }

    public int numeroAdsoluto(int n) {

        if (n < 0) {
            return -n;
        } else {
            return n;

        }

    }    
    
    
    public void sumaDeSeries (int n){
        
        for (int i = 3; i <= n; i += 3) {
            System.out.println(i);
            n += i;
            
         
        }
    
    }
  
    
    
}
