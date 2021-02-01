/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w08.factorialnumber;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class W08FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int factorial, numero,i;
   for(int j=0; j<=15; j++)
   {
    numero= Integer.parseInt(JOptionPane.showInputDialog("Ingresar Numero("+ j +"):"));
    i=0;
    factorial = 1;
    while(i<=numero)
    {
        i++;
        factorial=factorial*i;
        
    }
        System.out.println("El factoial es :" + factorial);
        
       } 
   }   
}