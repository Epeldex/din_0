package model;

import interfaces.Model;
import java.util.ResourceBundle;

/**
 * Esta clase se encarga de gestionar la recoleccion del saludo desde un archivo
 * @author alexIrusta
 */
public class PropertyFileModelImplementation implements Model {
    @Override
    /**
     * Este método recoge el dato "GREETING" que se encuentra en el archivo de propiedades y lo devuelve en forma de String
     */
    public String getGreeting() {
        return  ResourceBundle.getBundle("resources.GreetingFile").getString("GREETING");
    }    
}
