/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 * Esta interfaz define el método showGreeting() que va a ser llamado por
 * ConsoleImplementation y JavaFxImplentation
 *
 * @author alexIrusta
 */
public interface View {

    /**
     * Este método muestra un greeting que se le pasa como argumento
     *
     * @author alexIrusta
     * @param greeting String con el mensaje a mostrar
     * @throws Exception Excepcion si hay un error
     */
    public void showGreeting(String greeting) throws Exception;

    public void showError(String error);
}
