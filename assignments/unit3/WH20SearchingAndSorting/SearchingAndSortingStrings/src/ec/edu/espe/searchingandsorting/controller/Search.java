/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.searchingandsorting.controller;

/**
 *
 * @author Usuario
 */
public class Search {
     public static int findMovie(String[] movies, String searchMovie){
        for(int i= 0; i < 5; i++){
            if(searchMovie.equals(movies[i]) ){
                return 1;
            }
        }
        return -1;
    }
}

    
  
