/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pensionadoscol;

/**
 *
 * @author mdari
 */
public class Afiliado {
    private int id_afiliado;
    private String departamento;
    private String municipio;
    private char genero;
    private int cantidad;

    public Afiliado() {
    }
    
    

    public Afiliado(String departamento, String municipio, char genero, int cantidad) {
        this.departamento = departamento;
        this.municipio = municipio;
        this.genero = genero;
        this.cantidad = cantidad;
    }
    
    

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_afiliado() {
        return id_afiliado;
    }

    public void setId_afiliado(int id_afiliado) {
        this.id_afiliado = id_afiliado;
    }
    
    
    
    
    
    
}
