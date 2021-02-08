/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh11.recursions;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Usuario
 */
public class WH11Recursions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double x1= 0;
        double x2= 0;
        double y1= 0;
        double y2= 0;
        double distance = 0;
        
        System.out.println(" to start insert a value for x1");
        x1 = input.nextInt();
        
        System.out.println(" insert the vaule of x2");
        x2 = input.nextInt();
        
        System.out.println(" Insert y1 ");
        y1 = input.nextInt();
        
        System.out.println("  Insert y2");
        y2 = input.nextInt();
        
        distance = showDistanceBetweenCountries (x1, x2, y1, y2);
        System.out.println(" The distance between two countries  " + distance);
        
        }
        
        
        public static double showDistanceBetweenCountries(double x1, double x2,double y1, double y2){
        double distance;
        double startingpoint;
        double arrivalpoint;
        startingpoint = Math.pow(x2 - x1,2);
        arrivalpoint = Math.pow(y2 - y1, 2);
        
        distance = (double) Math.sqrt(startingpoint + arrivalpoint);
        
        return (double) distance;
        }
}
        
        
   

    
    
