/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh03;

/**
 *
 * @author Usuario
 */
public class WH03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   System.out.println("1.-USE \"WHILE\" WITH A NUMBER LIST");
        int i ;
        i= 0;
        System.out.println("This is a while loop from 1 to 46");
        
        while  (i <46) {
            System.out.println("i-->" +(i+1));
            i+=1;
        }
        
        System.out.println("2.-USE \"FOR\" IN MULTIPLICATION "
                + "TABLE WITH A NUMBER LIST");
        System.out.println("Multiplication tables :46 ");
        
        int stop=12;
        int product=0;
        int table = 46;
        for(int v=1 ; v<=stop ; v++){
            product = table * v;
            System.out.println("46 * " + v + " = " + product);
        }
    
    i=0;
        System.out.println("====loop with numbers 0 to 7====");
       while(i<7){
        System.out.println("i->" +i);
        
       }
    }
}
