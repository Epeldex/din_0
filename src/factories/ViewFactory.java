/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import interfaces.View;

/**
 * Esta clase se encarga de instanciar el tipo de implementación para el modelo,
 * dependiendo del tipo elegido
 *
 * @author Alex
 */
public class ViewFactory {

    public static View getView(String type) {
        if (type.equals("JavaFx") || type.equals("Text")) {
            View view = null;
            switch (type) {
                case "JavaFx":
                    view = new view.JavaFxImplementation();
                    break;
                case "Text":
                    view = new view.TextViewImplementation();
                    break;
            }
            return view;
        } else {
            System.err.println("Invalid arguments");
            return null;
        }
    }
}
