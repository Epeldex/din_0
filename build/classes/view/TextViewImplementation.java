/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import interfaces.View;

/**
 * Esta clase se encarga de recoger el saludo y mostrarlo por terminal
 *
 * @author Alex E
 */
public class TextViewImplementation implements View {

    @Override
    public void showGreeting(String greeting) throws Exception {
        System.out.println(greeting);
    }

    @Override
    public void showError(String error) {
        System.out.println(error);
    }

}
