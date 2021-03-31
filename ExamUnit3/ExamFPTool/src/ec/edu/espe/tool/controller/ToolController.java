/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tool.controller;

import ec.edu.espe.tool.model.Tool;

/**
 *
 * @author Usuario
 */
public class ToolController {
    public void save(Tool tool){
        String data = tool.getName()+"," + tool.getBrand()+ "," + tool.getColor() + "," + tool.getPrice()+ "," + tool.isIsSafe();
    }
    
        
    }
    
