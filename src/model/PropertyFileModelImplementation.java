package model;

import interfaces.Model;
import java.util.ResourceBundle;

/**
 * Esta clase se encarga de gestionar la recoleccion del saludo desde un archivo
 * @author alexa
 */
public class PropertyFileModelImplementation implements Model {
    @Override
    public String getGreeting() {
        return  ResourceBundle.getBundle("resources.GreetingFile").getString("GREETING");
    }
    
}
