/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_arrays;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Quiz_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int product = 0;
        String[]HardwareSoreProducts = {"hummer","handsaw", "paint", "nails", "cement"};
       float [] Prices = {1.2F, 1.47F, 3.5F, 0.33F, 12.5F};
       Scanner input  = new Scanner (System.in);
       int n;
        System.out.println("enter the name of the products ->");
        n= input.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("enter the number of the product"+ (i + 1) + " -> ");
              product[i] = input.nextInt();
        }

       for (int prices : product){
           System.out.println("products of the store" + prices);
       }
         for (int i = 0; i < n; i++) {
            System.out.println("products of the store" + (i + 1) + " -> " + product[i]);
        }
     for (String HardwareSoreProducts : HardwareSoreProducts) {
            System.out.println("name of the products -> " + HardwareSoreProducts);
        }

        for (int i = 0; i < weightsByproducts.length ; i++) {
            String[] weightsByproducts = null;
            System.out.println("weight of product " + (i + 1) + " -> " + weightsByproducts[i]);
        }
    }
    
    }
