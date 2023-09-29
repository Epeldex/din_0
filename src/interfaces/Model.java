/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 * Esta es la interfaz que define el metodo getGreeting(), que se utiliza en las clases DBImplementation y TextFileImplementation y es llamado por el Controller
 * @author Jagoba
 */
public interface Model {
    /**
 * Este método recoge el greeting de la implementación
 * @author Jagoba
 * @return devuelve un dato String
 * @throws Exception si hay un error
 */
    public String getGreeting() throws Exception;
}
