/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.FeriaEmpresarial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VisitanteTest {

    @Test
    public void testGetNombre() {
        Visitante visitante = new Visitante("Juan Perez", "123456", "juan@example.com");
        assertEquals("Juan Perez", visitante.getNombre());
    }

    @Test
    public void testSetNombre() {
        Visitante visitante = new Visitante("Juan Perez", "123456", "juan@example.com");
        visitante.setNombre("Maria Lopez");
        assertEquals("Maria Lopez", visitante.getNombre());
    }

    @Test
    public void testGetIdentificacion() {
        Visitante visitante = new Visitante("Juan Perez", "123456", "juan@example.com");
        assertEquals("123456", visitante.getIdentificacion());
    }

    @Test
    public void testSetIdentificacion() {
        Visitante visitante = new Visitante("Juan Perez", "123456", "juan@example.com");
        visitante.setIdentificacion("654321");
        assertEquals("654321", visitante.getIdentificacion());
    }

    @Test
    public void testGetEmail() {
        Visitante visitante = new Visitante("Juan Perez", "123456", "juan@example.com");
        assertEquals("juan@example.com", visitante.getEmail());
    }

    @Test
    public void testSetEmail() {
        Visitante visitante = new Visitante("Juan Perez", "123456", "juan@example.com");
        visitante.setEmail("maria@example.com");
        assertEquals("maria@example.com", visitante.getEmail());
    }

    @Test
    public void testToString() {
        Visitante visitante = new Visitante("Juan Perez", "123456", "juan@example.com");
        String expected = "Visitante: Juan Perez | ID: 123456 | Contacto: juan@example.com";
        assertEquals(expected, visitante.toString());
    }
}
