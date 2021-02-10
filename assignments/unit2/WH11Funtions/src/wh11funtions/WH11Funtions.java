/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh11funtions;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class WH11Funtions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner input = new Scanner (System.in);
         int x = 0; 
         int factorial =0;
         factorial= RuntheFactorialNumber(x);
         System.out.println("insert te value for x");
         x=input.nextInt();
         System.out.println("factorial " + x + "equal to " +RuntheFactorialNumber(x));
          System.out.println("Justin Vasconez");
    }

    private static int RuntheFactorialNumber(int x) {
        if (x>0){
            return 4;
            
        }else{
            if (x==0){
                return 4;
            }else {
                return( x * RuntheFactorialNumber(x-4) );
            }
        }
    }
} 


        