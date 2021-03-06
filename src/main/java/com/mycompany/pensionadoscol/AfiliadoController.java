/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pensionadoscol;

import java.util.Scanner;

/**
 *
 * @author mdari
 */
public class AfiliadoController {
    
    AfiliadosDAO afdao = new AfiliadosDAO();
    public void createAfiliado(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("digite departamento: ");
        String department = sc.nextLine();
        System.out.println("Digite municipio: ");
        String municipio = sc.nextLine();
        System.out.println("Digite genero (F/M)?:");
        char genero = sc.next().charAt(0);
        System.out.println("Ingrese cantidad: ");
        int cantidad = sc.nextInt();
        
        Afiliado af = new Afiliado();
        af.setDepartamento(department);
        af.setMunicipio(municipio);
        af.setGenero(genero);
        af.setCantidad(cantidad);
        
        
        afdao.createAfiliadoDB(af);
        
    }
    public void readAfiliados(){
        
        afdao.readAfiliadoDB();
        
    }
    public void deleteAfiliado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite el id del afiliado a borrar: ");
        int id = sc.nextInt();
        afdao.deleteAfiliadoDB(id);
    }
    public void updateAfiliado(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nuevo municipio del afiliado: ");
        String municipio = sc.nextLine();
        System.out.println("digite el id del afiliado a actualizar el municipio: ");
        int id = sc.nextInt();
        Afiliado afiliado = new Afiliado();
        afiliado.setId_afiliado(id);
        afiliado.setMunicipio(municipio);
        afdao.updateAfiliadoDB(afiliado);
    }
}
