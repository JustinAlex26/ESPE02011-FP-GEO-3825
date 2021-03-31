/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.searchsorting.model;

/**
 *
 * @author Usuario
 */
public class Guitar {
     private String brand;
     private String Color;
      private int price;
     private String Chords;
     private String area;
     private boolean GuitarString;

    public Guitar(String brand, String Color, int price, String Chords, String area, boolean GuitarString) {
        this.brand = brand;
        this.Color = Color;
        this.price = price;
        this.Chords = Chords;
        this.area = area;
        this.GuitarString = GuitarString;
    }
     

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
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
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
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
     

   