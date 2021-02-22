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
class weightsByproducts {

    static int length;
    
}
int totalOfProducts=0;
    String[] products;
    float[]prices;
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Please Enter the products->");
        totalOfProducts = scanner.nextInt();
        
        products = new String[totalOfProducts];
        prices = new float [totalOfProducts];
        
        for (int i=0 ; i< totalOfProducts; i++){
            scanner.nextLine();
            System.out.println("Please enter the name of the product #" + i+ "->");
        products[i] = scanner.nextLine();
            System.out.println("Please enter" + products[i]+ "prices->");
        prices[i] = scanner.nextFloat();
        }
        System.out.println(" product -> \t price ");
    for (int i=0; i< totalOfProducts; i++) {
        System.out.println (products[i] +" -> \t" + prices[i]);
    }
    }
    
    
}