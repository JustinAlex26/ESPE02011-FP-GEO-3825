/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh15.matrixoperation;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class WH15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Justin Vasconez c:
        Scanner scanner = new Scanner( System.in);
        int matrix1[][] = new int[10][10];  
        int matrix2[][] = new int[10][10];
        int res[][] = new int[10][10];
        int limit, i, j ; 
        System.out.println("Enter the size of the first matrix to add");
         limit= scanner.nextInt();
         System.out.println("Enter the elemts of the matrix");
         for(i=0;i<limit;i++){
          for( j=0;j<limit; j++){   
              System.out.println("Column" +(i+1)+ "row" +(j+1)+ "=");
              matrix1[i][j]= scanner.nextInt();
          }
    }
       System.out.println("Enter the elemts of the second matrix");
         for(i=0;i<limit;i++){
          for( j=0;j<limit; j++){   
              System.out.println("Column" +(i+1)+ "row" +(j+1)+ "=");
              matrix1[i][j]= scanner.nextInt();
          }
    }
        System.out.println("The add of the two Matrices");
        for(i=0; i<limit; i++){
        for(j=0; j<limit; j++){    
             res[i][j]=matrix1[i][j] + matrix2[i][j];
        }
    }        
    for(i=0;i<limit; i++){
        for(j=0;j<limit; j++){
            System.out.println("Column" + (i+1)+ "row" + (j+1)+ "=" + res[i][j]);
        }
    }  
    }
}
    
