/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exceptions.MyException;
import interfaces.Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase se encarga de implementar la conexión con la base de datos, accediendo a ella y recogiendo el dato solicitado.
 * @author Jagoba  
 */
public class BDImplementation implements Model {
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    private final OpenCloseConnection connection = new OpenCloseConnection();
    
    /**
     * Este método abre la conexión con la base de datos, recoge todo el contenido de la tabla greeting, y lo guarda en un objeto String 
     * @return
     * @throws MyException 
     */
    @Override
    public String getGreeting() throws MyException {
        String greeting = new String();
        con = connection.openConnection();
        String query = "SELECT * from greeting";
        
        try {
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            rs.next();
            greeting = rs.getString("hello");              
            connection.closeConnection(stmt, con);
        } catch (SQLException ex) {
            String error = "Error connecting to the database"; // Define the error message.
            MyException er = new MyException(error); // Create a new exception with the error message.
            throw er; // Throw the exception.
        }
        return greeting;
    }
    
}
