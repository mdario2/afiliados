/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pensionadoscol;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mdari
 */
public class Conexion {
    
    public Connection getConecction(){
        Connection conex = null;
        try {
            conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/platziblog","root","");
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conex;
    }
}
