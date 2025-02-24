/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.FeriaEmpresarial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase Empresa.
 */
public class EmpresaTest {

    /**
     * Prueba para verificar el método getNombre() de la clase Empresa.
     */
    @Test
    public void testGetNombre() {
        // Crear una instancia de Empresa con valores específicos
        Empresa empresa = new Empresa("TechCorp", "Tecnología", "info@techcorp.com");

        // Verificar que el método getNombre() devuelve el valor esperado
        assertEquals("TechCorp", empresa.getNombre());
    }

    /**
     * Prueba para verificar el método setNombre() de la clase Empresa.
     */
    @Test
    public void testSetNombre() {
        // Crear una instancia de Empresa con valores específicos
        Empresa empresa = new Empresa("TechCorp", "Tecnología", "info@techcorp.com");

        // Cambiar el nombre de la empresa usando setNombre()
        empresa.setNombre("Innovatech");

        // Verificar que el nombre se actualizó correctamente
        assertEquals("Innovatech", empresa.getNombre());
    }

    /**
     * Prueba para verificar el método getSector() de la clase Empresa.
     */
    @Test
    public void testGetSector() {
        // Crear una instancia de Empresa con valores específicos
        Empresa empresa = new Empresa("TechCorp", "Tecnología", "info@techcorp.com");

        // Verificar que el método getSector() devuelve el valor esperado
        assertEquals("Tecnología", empresa.getSector());
    }

    /**
     * Prueba para verificar el método setSector() de la clase Empresa.
     */
    @Test
    public void testSetSector() {
        // Crear una instancia de Empresa con valores específicos
        Empresa empresa = new Empresa("TechCorp", "Tecnología", "info@techcorp.com");

        // Cambiar el sector de la empresa usando setSector()
        empresa.setSector("Innovación");

        // Verificar que el sector se actualizó correctamente
        assertEquals("Innovación", empresa.getSector());
    }

    /**
     * Prueba para verificar el método getEmail() de la clase Empresa.
     */
    @Test
    public void testGetEmail() {
        // Crear una instancia de Empresa con valores específicos
        Empresa empresa = new Empresa("TechCorp", "Tecnología", "info@techcorp.com");

        // Verificar que el método getEmail() devuelve el valor esperado
        assertEquals("info@techcorp.com", empresa.getEmail());
    }

    /**
     * Prueba para verificar el método setEmail() de la clase Empresa.
     */
    @Test
    public void testSetEmail() {
        // Crear una instancia de Empresa con valores específicos
        Empresa empresa = new Empresa("TechCorp", "Tecnología", "info@techcorp.com");

        // Cambiar el email de la empresa usando setEmail()
        empresa.setEmail("contact@innovatech.com");

        // Verificar que el email se actualizó correctamente
        assertEquals("contact@innovatech.com", empresa.getEmail());
    }

    /**
     * Prueba para verificar el método toString() de la clase Empresa.
     */
    @Test
    public void testToString() {
        // Crear una instancia de Empresa con valores específicos
        Empresa empresa = new Empresa("TechCorp", "Tecnología", "info@techcorp.com");

        // Definir el valor esperado para el método toString()
        String expected = "Empresa: TechCorp | Sector: Tecnología | Contacto: info@techcorp.com";

        // Verificar que el método toString() devuelve el valor esperado
        assertEquals(expected, empresa.toString());
    }
}
