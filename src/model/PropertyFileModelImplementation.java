package model;

import interfaces.Model;
import java.util.ResourceBundle;

/**
 * Esta clase se encarga de gestionar la recoleccion del saludo desde un archivo
 * @author alexa
 */
public class PropertyFileModelImplementation implements Model {
    
    private ResourceBundle configFile; // Resource bundle for storing the greeting
    private String greeting; // The greeting

    @Override
    public String getGreeting() {
        
        configFile = ResourceBundle.getBundle("resources.GreetingFile"); // Load the configuration file
        greeting = configFile.getString("GREETING"); // Gets the greeting from the config file
        
        return greeting;
    }
    
}
