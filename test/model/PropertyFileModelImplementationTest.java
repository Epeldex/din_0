/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase para testear que la implementación de fichero funciona correctamente
 * @author alexIrusta
 */
public class PropertyFileModelImplementationTest {
    
    /**
     * Test para comprobar que una instancia de la implementacion de base de datos no sea nula
     * @author alexIrusta
     */
    @Test
    public void PropertyFileModelImplementationTest() {
        PropertyFileModelImplementation pi = new PropertyFileModelImplementation();
        assertNotNull("Error", pi);
    }

    /**
     * Test del método getGreeting, comprobamos que el mensaje sea igual
     * @author alexIrusta
     */
    @Test
    public void testGetGreeting() {
        PropertyFileModelImplementation po = new PropertyFileModelImplementation();

        assertEquals("Error", "Hello World!", po.getGreeting());
    }

}
