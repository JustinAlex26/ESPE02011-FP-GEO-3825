/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws05iterations;

/**
 *
 * @author Usuario
 */
public class WS05Iterations {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
    
    int i;
    i=0;
            System.out.println("====This is a whileloop from 1to 10====");
            while(i<10){
                System.out.println("i-->" + i);
                i=i+1;
            }
            System.out.println("====This is a whileloop from 1to 10====");
            while(i<10){
                System.out.println("i-->" + (i +1));
                //i+=1;
                i++;
                //i=i +1;
            }
                System.out.println("frist even numbers");
                i=2;
                while (i<10);{
                System.out.println( i+"--> even");
                i +=2;
            }
                System.out.println("First 5 odd numbers");
                for(int j=1; j<10;j+=2){
                System.out.println("odd number-->" + j);
            }
                System.out.println("Multipication Tables :7");
                int top=12;
                int product=0;
                int table =7;
                for (int j =1 ;j<=top ; j++){
                    product = table*j;
                    System.out.println("7 *" + j + "=" + product);
                    
                }
    }
}
