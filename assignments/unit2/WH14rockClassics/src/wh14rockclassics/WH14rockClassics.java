/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh14rockclassics;

/**
 *
 * @author Usuario
 */
public class WH14rockClassics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       String[]  rockClassics ={"Nirvana", "Led Zeppeling", "The Smiths", "Joy Division" };
       String[] alternativeRock = { "Green Day",  "The Strokes","Panic at the disco","White Stripes"};
       
        System.out.println("rockClassics");
        for (String rock : rockClassics){
            System.out.println("name of the rockclasssics" + rock);
        }
        
        System.out.println("alternativeRock");
        for (String rock : alternativeRock){
            System.out.println("name of alternativeRock" + rock);
        }
    }
    
}
