/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.searchsorting.controller;

import ec.edu.espe.searchsorting.model.Guitar;
import utils.FileManager;

/**
 *
 * @author Usuario
 */
public class GuitarController {
    public void save(Guitar guitar){
    String data = guitar.getBrand()+ "," + guitar.getColor()+"," + guitar.getPrice() +"," + guitar.getArea()+","+ guitar.getChords()+","+ guitar.isGuitarString();
FileManager.save(data, "guitar");
}
}