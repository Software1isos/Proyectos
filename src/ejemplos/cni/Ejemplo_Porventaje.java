/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.cni;

import java.util.Scanner;

/**
 *
 * @author Software
 */
public class Ejemplo_Porventaje {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double va;
        double por;
        double res;
        
        System.out.println(" Digite un valor: ");
        va=leer.nextDouble();
        
         System.out.println(" Digite el porcentale %: ");
        por=leer.nextDouble();
        
        
        res=va*por/100;
        
        System.out.println("EL % DE:"+va+" ES: "+res);
        
        
    }
}
