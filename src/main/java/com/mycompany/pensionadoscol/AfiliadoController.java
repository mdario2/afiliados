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
        
        Afiliado af = new Afiliado(department, municipio, genero, cantidad);
    }
    public void readAfiliados(){
        
    }
    public void deleteAfiliado(){
        
    }
    public void updateAfiliado(){
        
    }
}
