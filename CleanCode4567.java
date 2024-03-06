/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cleancode4567;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class CleanCode4567 {

    public static void main(String[] args) {
        ArrayList<Persona> arrayPersonas=new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String dni;
        String nombre;
        String apellido;
        int edad;
        try{
        System.out.println("Introduce DNI de la primera persona");
            dni = teclado.nextLine();
        System.out.println("Introduce nombre de la primera persona");
            nombre = teclado.nextLine();
        System.out.println("Introduce apellido de la primera persona");
            apellido = teclado.nextLine();
        System.out.println("Introduce edad de la primera persona");
            edad = teclado.nextInt();
        Persona pepe = new Persona(dni, nombre, apellido, edad);
        
            System.out.println();
        System.out.println("Introduce DNI de la segunda persona");
            dni = teclado.nextLine();
        System.out.println("Introduce nombre de la segunda persona");
            nombre = teclado.nextLine();
        System.out.println("Introduce apellido de la segunda persona");
            apellido = teclado.nextLine();
        System.out.println("Introduce edad de la segunda persona");
            edad = teclado.nextInt();
        Persona juan = new Persona(dni, nombre, apellido, edad);
        
        System.out.println();
        System.out.println("Introduce DNI de la tercera persona");
            dni = teclado.nextLine();
        System.out.println("Introduce nombre de la tercera persona");
            nombre = teclado.nextLine();
        System.out.println("Introduce apellido de la tercera persona");
            apellido = teclado.nextLine();
        System.out.println("Introduce edad de la tercera persona");
            edad = teclado.nextInt();
        Persona luis = new Persona(dni, nombre, apellido, edad);
        
        arrayPersonas.add(pepe);
        arrayPersonas.add(juan);
        arrayPersonas.add(luis);
        for (Persona i:arrayPersonas){
            if (i.verificarMayoriaEdad()){
                System.out.println(i.getNombre() + " es mayor de edad");
            }else{
                System.out.println(i.getNombre() + " no es mayor de edad");
            }
        }
        } catch (InputMismatchException ex) {
            System.out.println();
            System.out.println("Has introducido algun dato incorrecto");
        }
        
    }
}
