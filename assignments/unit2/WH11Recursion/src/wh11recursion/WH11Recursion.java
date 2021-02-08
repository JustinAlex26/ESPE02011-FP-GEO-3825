/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh11recursion;

/**
 *
 * @author Usuario
 */
import javax.swing.JOptionPane;

public class WH11Recursion {

    /**
     * @param args the command line arguments
     */
    private static int  option = 0; 
    private static String menu; 
    public static void mostrarMenu() {
        // TODO code application logic here
       menu = "";
       menu += "******************************" + "\n";
       menu +=" *       MAPA DEL ECUADOR       *" + "\n";
       menu += "******************************" + "\n";
       menu += "CALCULAR LA DISTANCIA DE UNA PROVINCIA DESDE UN PUNTO DE ORIGEN " + "\n";
       menu += "******************************" + "\n";
       menu += "1.Crear un punto (x ,y " + "\n";
       menu += "2.Calcular la Distancia" + "\n";
       menu += "3. Salir" +  "\n" + "\n";
       menu += "Seleccione una opcion" + "\n";
    }
   public static void main(String[] args) {
       int x = 0;
       int y =0;
       String x2 = " ",  y2  =" ";
       PuntoXY p1 = new PuntoXY(x, y);
       PuntoXY p2 = new PuntoXY(x, y);
       
       do {
           mostrarMenu();
           try { 
               option = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (option){
                   case 1:
                       x2 = JOptionPane.showInputDialog("Introduzca la coordenada X: ");
                       x =Integer.parseInt(x2);
                       y2 = JOptionPane.showInputDialog("Introduzca la coordenada X: ");
                       y =Integer.parseInt(y2);
                       p2.setX(x);
                       p2.setY(y);
                       System.out.println("\n"+ "El punto se Encuentra :" + p2.getX() + ","+ p2.getY() + "\n") ;
                       break; 
                   case 2 : 
                       System.out.println("\n" + "La distancia va desde "+ p2.getX() + ","+ p2.getY() + " al origen  es : " + p1);
                       break;
                }
           }catch (NumberFormatException e) {
               System.out.println("¡¡¡¡¡¡¡¡¡¡.....Caracter valido..!!!!!");
               
           }
       } while (option !=3);
   }
}

