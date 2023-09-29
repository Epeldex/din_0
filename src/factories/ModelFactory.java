/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import interfaces.Model;

/**
 * Esta clase se encarga de instanciar el tipo de implementación para el modelo,
 * dependiendo del tipo elegido
 *
 * @author Jagoba
 */
public class ModelFactory {

    public static Model getModel(String type) {

        if (type.equals("File") || type.equals("BD")) {
            Model model = null;
            switch (type) {
                case "File":
                    model = new model.PropertyFileModelImplementation();
                    break;
                case "BD":
                    model = new model.BDImplementation();
                    break;
            }
            return model;
        } else {
            System.err.println("Invalid arguments");
            return null;
        }
    }
}
