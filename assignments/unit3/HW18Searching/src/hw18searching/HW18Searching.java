/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18searching;

/**
 *
 * @author Usuario
 */
import java.util.*;
public class HW18Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vector []={4, 7, 8, 0, 2, 12, 5, 9, 6, 4, 0, 23};
        int aux=0;
        System.out.println("Sequential search");
        System.out.println("Enter the data ");
        for(int i=0; i< vector.length; i++)
        {
            System.out.println(vector[i]+ ",");
            
            
        }
        System.out.println("search for a value:");
        int valor= input.nextInt();
        for(int i=0; i< vector.length; i++)
        {
        if (valor == vector[i]){
                System.out.println("The value" + valor + "position" + i );
                aux++;
    }
    
}
if(aux==0)
            System.out.println("not found");
    }
}
String[] number = new String[6];
       number[0] = "1";
       number[1] = "21";
       number[2] = "15";
       number[3] = "43";
       number[4] = "2";
       number[5] = "11";
       for(int i=0; i< number.length; i++)
        {
            System.out.println(number[i]);
            
            
    }
    
        System.out.println("search for a value:");
        int valor = 0;
        int aux = 0;
       
        for(int i=0; i< number.length; i++)
        {
        if (valor == number[i]){
            System.out.println("The value" + valor + "position" + i );
            aux++;
         }
    
}
if(aux==0)
            System.out.println("not found");
    }
}
