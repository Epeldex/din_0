/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import interfaces.View;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author alexa
 */
public class JavaFxImplementation extends javafx.application.Application implements View, Initializable {
    
    private static String greeting;
    
    @FXML
    private TextArea textArea;
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader =  new FXMLLoader(getClass().getResource("WelcomeView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        
        JavaFxImplementation controller = loader.getController();
        controller.textArea.setText(greeting);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */

    @Override
    public void showGreeting(String message) throws Exception {
        this.greeting = message;
        launch();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }
    
}
