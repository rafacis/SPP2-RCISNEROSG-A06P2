/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rcisnerosg.a06p2;
import java.util.Scanner;

/**
 *
 * @author MayteCorripio
 */
public class SPP2RCisnerosGA06P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, mult=1;
        Scanner T = new Scanner (System.in);
        
        System.out.println("Introduce un número entero entre 0 y 10");
        num = T.nextInt();
        
        if (num>0 && num<=10){
        for (int i=1; i<=num ; i++){
            
             mult = mult * i;
        }
        
        System.out.println("El factorial es " +mult);
        }else System.out.println("El número no esta en el rango");
    }
    
}
