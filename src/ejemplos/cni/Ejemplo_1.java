/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.cni;
import java.util.*;
/**
 *
 * @author Software
 */
public class Ejemplo_1 {

 
    public static void main(String[] args) {
      
        // Creamos un objeto de la clase Random
        //para generar números aleatorios
        //Random aleatorio = new Random();
         
        // Creamos un objeto de tipo array de 16 posiciones.
        // La primera posicion de este array será la posición 0.
        // La última posición del array será la posición 15.
        int [] vector = new int [5];
         int[]par=new int [5];
         int[]impar=new int [5];
        int posicion;
    
        // Ahora creamos un bucle for para recorrer
        // cada una de las posicionees del vector desde la 0 hasta la 15
         
        for( posicion=0;posicion<vector.length;posicion++){
             
            // Dentro del bucle generamos el número aleatorio entre 0 y 100
            int num = (int )(Math.random()*10);             
            // Ahora colocamos el número generado
            // en la posición que corresponda a cada vuelta de bucle
            vector[posicion]=num;  
           
            if (vector[posicion]%2==0) {
                 par[posicion]=vector[posicion];
           
               
                   
                
               }else{
                  impar[posicion]=vector[posicion];
                 
               }
                                
        }
        for (int i = 0; i < vector.length; i++) {
             System.out.print("par:"+par[i]+"\n");
             System.out.print("impar:"+impar[i]+"\n");
        }
       
          
    
       
    }
}
