/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import interfaces.Model;
import interfaces.View;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase se encarga de la lógica del programa
 *
 * @author Alex E
 */
public class Controller {
    /**
     *Este metodo se encarge de recoger el mensaje del modelo y pasarselo a la vista 
     * 
     * @param view
     * @param model 
     */
    public void run(View view, Model model){
        try {
            view.showGreeting(model.getGreeting());
        } catch (Exception ex) {
            
        }
    }
    
}
