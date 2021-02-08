/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11changestheverbs;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class WS11ChangesTheVerbs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input= new Scanner(System.in);
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

        System.out.println("Chose the numer fot the dividend ");
        divd = input.nextInt();
        System.out.println("this is the number fot the divr");
        divr = input.nextInt();
        quotient= divideTwoNumbers(divd, divr);
        System.out.println("Quotient of 5 and 10 is -> " + quotient); 
        System.out.println("add the number");
        x= input.nextInt();
        y = f(x);
        System.out.println(+ x + "^2 -> " + y);
        System.out.println("add the number");
        x = input.nextInt();
        y = f(x);
        System.out.println( + x +"^2 -> " + y); 
        System.out.println("add the number");
        x= input.nextInt();
        y = f(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);
        x= input.nextInt();
        y=f(x);
        System.out.println("y = " + x + "*" + x + "+2*" + x + "+ 1 =" + y);
        System.out.println(" put your number please");
        multiplying= input.nextInt();
        System.out.println(" add the number of the table -->");
        table = input.nextInt();
        for (int j = 1; j <= multiplying ; j ++ ){
       product= table* j;
            System.out.println(+ table +" * " + j + " = " + product);
            
           
        }
       System.out.println("<<<Justin Vasconez>>>");
            System.out.println("===============Hasta la proxima=============="); 
            int number = 5;
        int fact = 0;
        fact = factorial(number);
        System.out.println("factorial of " + number + " is equal to -> " + fact);

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

public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * factorial(n - 1));
            }
        }
    }

}