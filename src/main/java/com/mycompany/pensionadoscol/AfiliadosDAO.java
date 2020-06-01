/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pensionadoscol;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        Conexion dbconnect = new Conexion();
        try(Connection conexion = dbconnect.getConecction()){
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                String query = "SELECT * from afiliado";
                ps = conexion.prepareStatement(query);
                rs = ps.executeQuery();
                
                while(rs.next()){
                    System.out.println("ID: "+rs.getInt("idafiliado"));
                    System.out.println("Dpto: "+rs.getString("departamento"));
                    System.out.println("Municipio: "+rs.getString("municipio"));
                    System.out.println("Genero: "+rs.getCharacterStream("genero"));
                    System.out.println("Cantidad: "+rs.getInt("cantidad"));
                    System.out.println("");
                }
                
                
            }catch(SQLException ex){
                System.out.println("no se pudieron recuperar los afiliados");
                System.out.println(ex);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void updateAfiliadoDB(Afiliado afiliado){
        Conexion dbconnect = new Conexion();
        try(Connection conexion = dbconnect.getConecction()){
            PreparedStatement ps = null;
            try{
                String query = "UPDATE afiliado SET municipio = ? "
                        + "WHERE idafiliado = ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, afiliado.getMunicipio());
                ps.setInt(2, afiliado.getId_afiliado());
                ps.executeUpdate();
                System.out.println("El afiliado se actualizo correctamente");
                
            }catch(SQLException ex){
                System.out.println(ex);
                System.out.println("No se pudo actualizar el afiliado");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void deleteAfiliadoDB(int id_afiliado){
        Conexion dbconnect = new Conexion();
        try(Connection conexion = dbconnect.getConecction()){
            PreparedStatement ps = null;
            try{
                String query="DELETE FROM afiliado "
                        + "WHERE idafiliado = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_afiliado);
                ps.executeUpdate();
                System.out.println("El afiliado ha sido borrado");
            }catch(SQLException ex){
            System.out.println(ex);
        }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
