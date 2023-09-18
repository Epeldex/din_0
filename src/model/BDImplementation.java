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
 *
 * @author alexa
 */
public class BDImplementation implements Model {
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    private final OpenCloseConnection connection = new OpenCloseConnection();
    
    
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
        }
        return greeting;
    }
    
}
