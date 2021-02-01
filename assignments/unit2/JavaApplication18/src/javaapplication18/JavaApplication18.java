/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication18 {
    
    int fact,num=0;
    public void factorial() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = entrada.nextInt();
        fact=num;
        for (int i=1; i<num; i++){
            fact=fact*i;
        }
        System.out.println("el factorial del nùmero" +num+ "es igual a" + fact); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   JavaApplication18 f = new JavaApplication18 ();
   f.factorial();
    }
}
