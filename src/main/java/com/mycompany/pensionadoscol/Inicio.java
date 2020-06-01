/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pensionadoscol;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author mdari
 */
public class Inicio {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        int opcion =0;
        
        do {            
            System.out.println("-------------------------");
            System.out.println("App afiliados a fondos de pensiones");
            System.out.println("1. Create afiliado");
            System.out.println("2. Read afiliado");
            System.out.println("3. Update afiliado");
            System.out.println("4. Delete afiliado");
            System.out.println("5. Salir");
            //Leemos la opcion del teclado
            opcion = sc.nextInt();
              AfiliadoController ac = new AfiliadoController();
            switch (opcion) {
                case 1:
                    ac.createAfiliado();
                    break;
                case 2:
                    ac.readAfiliados();
                    break;
                case 3:
                    ac.updateAfiliado();
                    break;
                case 4:
                    ac.deleteAfiliado();
                    break;
                default:
                    break;
            }
            
            
            
        } while (opcion != 5);
        
      
        
               
        
        /*Conexion conexion = new Conexion();
        try (Connection cnx = conexion.getConecction()) {
           
        } catch (Exception e) {
            System.out.println(e);
        }*/
        
        
    }
}
