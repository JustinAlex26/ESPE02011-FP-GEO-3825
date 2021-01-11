/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh02;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class WH02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner in = new Scanner(System.in);
   int B=0,b=0,h=0,A=0;
   System.out.println("Ingrese el valor de la base mayor del trapecio");
   B=in.nextInt();
   System.out.println("Ingrese el valor de la base menor del trapecio");
   b=in.nextInt();
   System.out.println("Ingrese el valor de la altura del trapecio");
   h=in.nextInt();
   A=((B+b)/2)*h;
   System.out.println("El valor de area del trapecio es " +A);
    }
    
    }
  
