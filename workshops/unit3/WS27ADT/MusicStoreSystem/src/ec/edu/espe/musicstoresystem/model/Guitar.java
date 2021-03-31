/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.musicstoresystem.model;

/**
 *
 * @author Usuario
 */
public class Guitar {
    private String Brand;
    private String color;
    private int price;
    private String sound;
    private String Chords;
    private boolean GuitarString;

    public Guitar(String Brand, String color, int price, String sound, String Chords, boolean GuitarString) {
        this.Brand = Brand;
        this.color = color;
      
        this.price = price;
        this.sound = sound;
        this.Chords = Chords;
        this.GuitarString = GuitarString;
    }
    

    /**
     * @return the Brand
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * @param Brand the Brand to set
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

  
    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the sound
     */
    public String getSound() {
        return sound;
    }

    /**
     * @param sound the sound to set
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * @return the Chords
     */
    public String getChords() {
        return Chords;
    }

    /**
     * @param Chords the Chords to set
     */
    public void setChords(String Chords) {
        this.Chords = Chords;
    }

    /**
     * @return the GuitarString
     */
    public boolean isGuitarString() {
        return GuitarString;
    }

    /**
     * @param GuitarString the GuitarString to set
     */
    public void setGuitarString(boolean GuitarString) {
        this.GuitarString = GuitarString;
    }
    
     
    
}
