/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cleancode4567;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sergi
 */
public class PersonaTest {
    
    Persona pruebamayor;
    Persona pruebamenor;
    Persona pruebacero;
    Persona pruebanegativo;
    
    
    @BeforeEach
    public void setUp() {
        pruebamayor = new Persona("11111111A", "Prueba1", "Prueba1", 19);
        pruebamenor = new Persona("11111112A", "Prueba2", "Prueba2", 9);
        pruebacero = new Persona("11111113A", "Prueba3", "Prueba3", 0);
        pruebanegativo = new Persona("11111114A", "Prueba4", "Prueba4", -4);
    }
    
    @AfterEach
    public void tearDown() {
        pruebamayor = new Persona();
        pruebamenor = new Persona();
        pruebacero = new Persona();
        pruebanegativo = new Persona();
    }

    @Test
    public void testVerificarMayoriaEdad() {
        assertAll(() -> {
            assertTrue(pruebamayor.verificarMayoriaEdad());
            assertFalse(pruebamenor.verificarMayoriaEdad());
            assertFalse(pruebacero.verificarMayoriaEdad());
            assertFalse(pruebanegativo.verificarMayoriaEdad());
        });
    }

   
    
}
