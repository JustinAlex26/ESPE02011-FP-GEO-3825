/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07menus;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class WS07Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    boolean  mainLoop = true;
    int option;
   
    do {
        System.out.println("calculator");
        System.out.println("1. ->Division");
        System.out.println("2. ->addition");
        System.out.println("3. ->Multiplication");
        System.out.println("4. ->substraction");
        System.out.println("5. ->Exit");
        
        System.out.println("1. ->Enter your menu option -->");
        option = input.nextInt();
        switch(option) {
            case 1:
                int dividend ;
                int divisor;
                int quotient;
                System.out.println("enter dividend->");
                dividend=input.nextInt();
                System.out.println("enter divisor ->");
                divisor = input.nextInt();
                quotient= dividend/divisor;
               System.out.println("the quotient is --> " + quotient);
               break;
               
               case 2:
                int addend1;
                int addend2;
                int sum;
                System.out.println("enter addend 3->");
                addend1 =input.nextInt();
                System.out.println("enter addend 4 ->");
                addend2 = input.nextInt();
                sum = addend1 + addend2;
               System.out.println("the addition is --> " + sum);
               break;
               case 3:
                int multiplying;
                int multiplier;
                int product;
                System.out.println("enter multiplying->");
                multiplying =input.nextInt();
                System.out.println("enter multiplier ->");
                multiplier = input.nextInt();
                product = multiplying * multiplier;
               System.out.println("the product is --> " + product );
               break;
               
               case 4:
                int minuend;
                int substrahend;
                int difference;
                System.out.println("enter minuend->");
                minuend =input.nextInt();
                System.out.println("enter substrahend ->");
                substrahend = input.nextInt();
                difference = minuend - substrahend;
               System.out.println("the difference is --> " + difference );
               break;
               
               case 5:
       
                System.out.println("Good Bye My Friend->");
             System.exit(0);
                     break;
               default:
               System.out.println(" Invelid option \n\n\n ");
               break;
                
        }
       }while (option >5);
     
     }
}
