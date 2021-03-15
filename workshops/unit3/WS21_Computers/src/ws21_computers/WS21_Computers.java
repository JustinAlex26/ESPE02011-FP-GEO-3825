/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21_computers;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class WS21_Computers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner input = new Scanner(System.in);
       int divd = 0;
        int divr = 0;
        float quotient = 0;
        int x = 0;
        int y = 0;
        int multiplying =0;
        int multiplier = 0;
        int product = 0;
        int table=0; 
        quotient = divideTwoNumbers(divd, divr);
         System.out.println("enter the value of the ram memory, this is the divd ");
        divd = input.nextInt();
        System.out.println(" Enter the number of computer applications this is the divr");
        divr = input.nextInt();
        quotient= divideTwoNumbers(divd, divr);
        System.out.println("The quotient is  -> " + quotient);       
        
        System.out.println(" put your percentage of the batery please");
        multiplying= input.nextInt();
        System.out.println(" add the number of hours you use the coputer please-->");
        table = input.nextInt();
        for (int j = 1; j <= multiplying ; j ++ ){
       product= table* j;
            System.out.println(+ table +" * " + j + " = " + product);
            
           
        }
       System.out.println("<<<Justin Vasconez>>>");
            System.out.println("===============Hasta la proxima=============="); 
    }

    public static float divideTwoNumbers(int dividend, int divisor) {
  
        float quotient = 0.0F;

       
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }
public static int showTheMultiplicationTable( int multiplyig ,  int multiplier) {   
    int multiplying =0;
    int product=0;
    int table=0;
    
    for (int j = 1 ; j <= multiplying ; j ++){
    product = table * j;
    System.out.println( + table + " * " + j + " = " + product);
      
     } 
         return +product;
}
}

      
    
