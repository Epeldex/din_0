/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de testeo de la implementación de base de datos
 * @author Jagoba
 */
public class BDImplementationTest {
    
    /**
     * Test para comprobar que una instancia de la implementacion de base de datos no sea nula
     */
    @Test
    public void BDImplementationTest() {
        BDImplementation bd = new BDImplementation();
        assertNotNull("Error", bd);
    }

    /**
     * Test de la clase getGreeting, comprobamos que el mensaje sea igual
     */
    @Test()
    public void testGetGreeting() throws Exception {
        BDImplementation bd = new BDImplementation();
        assertEquals("Error", "Hello World!", bd.getGreeting());
    }
}
