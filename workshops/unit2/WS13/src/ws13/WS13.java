/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class WS13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
        boolean mainLoop = true;
        int option;
        float area = 0.0F;

        do {
            System.out.println(" ~ Justin Vasconez ~");
            
            System.out.println(" -- Geometric figures area --");
            System.out.println("1. -> Area of A Trapeze");
            System.out.println("2. -> Area Of A Circule");
            System.out.println("3. -> Area of A Triangle");
            System.out.println("4. -> Work");
            System.out.println("5. -> Density");
            System.out.println("6. -> Speed");
            System.out.println("7. -> Exit");


            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    int B;
                    int b;
                    int h;
                    System.out.println("Enter the major base --> ");
                    B = input.nextInt();
                    System.out.println("Enter the minor base --> ");
                    b = input.nextInt();
                    System.out.println("Enter the height --> ");
                    h = input.nextInt();
                    area = AreaTrapeze(B, b, h);
                    System.out.println(" The area of trapeze is --> " + area);
                    break;
                case 2:
                    int r;
                    double π = 3.14;
                    System.out.println("Enter the radius -> ");
                    r = input.nextInt();
                    area = AreaCircule(r, π);
                    System.out.println(" The area of triangle --> " + area);
                    break;
                case 3:
                    int base;
                    int height;
                    System.out.println("enter base -> ");
                    base = input.nextInt();
                    System.out.println("enter height-> ");
                    height = input.nextInt();
                    area = AreaTriangle( base, height);
                    System.out.println(" The area of the triangle --> " + area);
                    break;     

                case 4:
                    float m = 0.0F;
                    int v;
                    float Ec = 0.0F;

                    System.out.println("Enter the mass in kg --> ");
                    m = input.nextInt();
                    System.out.println("Enter the speed in (m / s) --> ");
                    v = input.nextInt();
                    Ec = m * (v * v) / 2;
                    System.out.println(" The Kinetic energys is --> " + Ec);
                    break;

                case 5:
                    float k = 0.0F;
                    int x;
                    int Epe;
                    System.out.println("Elastic constant (N/m) -> ");
                    k = input.nextInt();
                    System.out.println("deformation (m -> ");
                    x = input.nextInt();
                    Epe = (int) (k * (x * x) / 2);
                    System.out.println("The elastic potential energy is --> " + Epe);
                    break;
                case 6:
                    int distance;
                    int time;
                    int Vm;
                    System.out.println("Enter the distance --> ");
                    distance = input.nextInt();
                    System.out.println("Enter the time --> ");
                    time = input.nextInt();
                    Vm = (int) Speed(distance, time);
                    System.out.println(" The Mechanical work --> " + Vm);
                    break;
                    
                case 7:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }
        } while (option != 4);
    }

    public static float AreaTrapeze(int B, int b, int h) {
        float area = 0.0F;

        area = ((B + b) * h) / 2;

        return area;
    }
    public static float AreaCircule(int r, double π) {
        float area = 0.0F;

        area = (float) (π * (r * r));

        return area;        
    }
    
    public static float AreaTriangle(int base, int height) {
        float area = 0.0F;

        area = base * height / 2;

        return area;     
    }
    public static float Speed(int distance, int time) {
        float Vm = 0.0F;

        Vm = distance / time; 

        return Vm;  
    }
      
    
}
   