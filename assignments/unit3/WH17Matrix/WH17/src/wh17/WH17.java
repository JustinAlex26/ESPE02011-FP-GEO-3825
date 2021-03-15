/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh17;

import java.util.Scanner;
import ec.edu.espe.matrix.BasicMatrix;
/**
 *
 * @author Usuario
 */
public class WH17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float[][] a;
        float[][] b;
        float[][] c;
        int m = 0;
        int n = 0;

        System.out.println("Enter the matrix dimesions");

        System.out.println("m : ");
        m = input.nextInt();

        System.out.println("n :");
        n = input.nextInt();

        a = new float[m][n];
        b = new float[m][n];
        c = new float[m][n];
        
        System.out.println("Please enter the elements of the matrix");
        a = BasicMatrix.readMatrixElements(m, n, "A", input);
        b = BasicMatrix.readMatrixElements(m, n, "B", input);
        for (int tab = 0; tab <= n / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println(" A");

        BasicMatrix.prettyPrintMatrix(m, n, a);
        System.out.println("");

        System.out.println(" B ");
        BasicMatrix.prettyPrintMatrix(m, n, b);

        System.out.println("The product of matrices is--");
        
        System.out.println("ADDITION");
        c = BasicMatrix.sumtTwoMatrices(m, n, a, b);
        BasicMatrix.prettyPrintMatrix(m, n, c);
        System.out.println("SUBTRACTION");
        c = BasicMatrix.subtracTwoMatrices(m, n, a, b);
        BasicMatrix.prettyPrintMatrix(m, n, c);
        System.out.println("PRODUCT");
        c = BasicMatrix.productTwoMatrices(m, n, a, b);
        BasicMatrix.prettyPrintMatrix(m, n, c);
      
    }
    
    }
    

