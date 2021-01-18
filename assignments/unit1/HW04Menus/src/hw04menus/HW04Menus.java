/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class HW04Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
         Scanner input = new Scanner(System.in);
    boolean  mainLoop = true;
    int option;
        
    
    do{
   
        System.out.println("calculator");
        System.out.println("1. -> trapezium area ");
        System.out.println("2. ->addition");
        System.out.println("3. -> Cylinder volume ");
        System.out.println("4. -> Cylinder area ");
        System.out.println("5. ->Exit");
        
        System.out.println("1. ->Enter your menu option -->");
        option = input.nextInt();
        switch(option){
                
            case 1:      
      
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
    break;
            case 2:
                int addend1;
                int addend2;
                int sum;
                System.out.println("enter addend 1->");
                addend1 =input.nextInt();
                System.out.println("enter addend 2 ->");
                addend2 = input.nextInt();
                sum = addend1 + addend2;
               System.out.println("the addition is --> " + sum);
               break;
           
            case 3:
                
      int r;
      int H;
      int vcili;
      
        System.out.println("ingrese el radio del cilindro : ");
         r = input.nextInt();
        System.out.println("Ingrese la altura del cilindro");
        H = input.nextInt();
        vcili = (int) ((3.1416) * (r *r) * (H));
        System.out.println("El volumen de un cilindro -> " + vcili + "cms3");
        break;
            case 4:   
       int r1;
        int H1;
        int atotal;
        System.out.println("ingrese el radio del cilindro : ");
      r1 = input.nextInt();
        System.out.println("Ingrese la altura del cilindro");
        H1 = input.nextInt();
        atotal = (int) (((2)* (3.1416) * (r1)) * (H1 +r1));
        System.out.println("El area de un cilindro -> " + atotal + "cms2");
        break;
        
            case 5 :
         default:
               System.out.println(" Invelid option \n\n\n ");
               break;
              
        }
       }while (option >5);
    }
}

        


        
