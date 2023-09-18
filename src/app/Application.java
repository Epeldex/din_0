/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.Controller;
import factories.ModelFactory;
import factories.ViewFactory;
import interfaces.Model;
import interfaces.View;

/**
 *
 * @author alexa
 */
public class Application {
   
    public static void main(String[] args){
        
       View view =  ViewFactory.getView("Text");
       Model model = ModelFactory.getModel("BD");
       
       new Controller().run(view, model);

    }
    
}
