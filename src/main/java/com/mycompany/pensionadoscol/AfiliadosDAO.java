/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pensionadoscol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mdari
 */
public class AfiliadosDAO {
    //CRUD
    public void createAfiliadoDB(Afiliado afiliado) {
        Conexion dbconnect = new Conexion();
        try (Connection conexion = dbconnect.getConecction()) {

            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO afiliado (departamento, municipio, genero, cantidad) VALUES (?,?,?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1,afiliado.getDepartamento());
                ps.setString(2, afiliado.getMunicipio());
                ps.setString(3, String.valueOf(afiliado.getGenero()));
                ps.setInt(4, afiliado.getCantidad());
                ps.executeUpdate();
                System.out.println("Afiliado creado");
            } catch (SQLException ex) {
                System.out.println(ex);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void readAfiliadoDB(){
        
    }
    
    public void updateAfiliadoDB(Afiliado afiliado){
        
    }
    
    public void deleteAfiliadoDB(int id_afiliado){
        
    }
}
