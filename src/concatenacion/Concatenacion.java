/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenacion;

import java.util.Scanner;


public class Concatenacion {
    
    public static Scanner ent = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        System.out.println("\t\tBIENVENIDO A LA APLICACIÓN\n\n");
        System.out.print("Introducir nombre de usuario: ");
        String Nombre = ent.nextLine();
        System.out.print("\n\nIntroducir el apellido del usuario: ");
        String Apellido = ent.nextLine();
        
        System.out.println("Hola, "+ Nombre.concat(Apellido)); 
        
    }
    
}
