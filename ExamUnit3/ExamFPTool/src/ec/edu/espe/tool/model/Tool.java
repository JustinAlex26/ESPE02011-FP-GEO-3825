/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tool.model;

/**
 *
 * @author Usuario
 */
public class Tool {
    private String Name;
    private int Price;
    private String Brand;
    private String Color;
    private boolean IsSafe;

    public Tool(String Name, int Price, String Brand, String Color, boolean IsSafe) {
        this.Name = Name;
        this.Price = Price;
        this.Brand = Brand;
        this.Color = Color;
        this.IsSafe = IsSafe;
    }
    

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Price
     */
    public int getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(int Price) {
        this.Price = Price;
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
     * @return the IsSafe
     */
    public boolean isIsSafe() {
        return IsSafe;
    }

    /**
     * @param IsSafe the IsSafe to set
     */
    public void setIsSafe(boolean IsSafe) {
        this.IsSafe = IsSafe;
    }
    
    
}
