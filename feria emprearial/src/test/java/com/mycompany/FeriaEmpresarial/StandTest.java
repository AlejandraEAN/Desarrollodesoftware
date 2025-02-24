/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.FeriaEmpresarial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase Stand.
 */
public class StandTest {

    /**
     * Prueba para verificar el método getNumero() de la clase Stand.
     */
    @Test
    public void testGetNumero() {
        // Crear una instancia de Stand con valores específicos
        Stand stand = new Stand(1, "Pabellón A", "Grande");

        // Verificar que el método getNumero() devuelve el valor esperado
        assertEquals(1, stand.getNumero());
    }

    /**
     * Prueba para verificar el método asignarEmpresa() de la clase Stand.
     */
    @Test
    public void testAsignarEmpresa() {
        // Crear una instancia de Stand con valores específicos
        Stand stand = new Stand(1, "Pabellón A", "Grande");

        // Crear una instancia de Empresa
        Empresa empresa = new Empresa("TechCorp", "Tecnología", "info@techcorp.com");

        // Asignar la empresa al stand
        stand.asignarEmpresa(empresa);

        // Verificar que el stand ya no está disponible
        assertFalse(stand.estaDisponible());
    }

    /**
     * Prueba para verificar el método estaDisponible() de la clase Stand.
     */
    @Test
    public void testEstaDisponible() {
        // Crear una instancia de Stand con valores específicos
        Stand stand = new Stand(1, "Pabellón A", "Grande");

        // Verificar que el stand está disponible inicialmente
        assertTrue(stand.estaDisponible());
    }

    /**
     * Prueba para verificar el método agregarComentario() de la clase Stand.
     */
    @Test
    public void testAgregarComentario() {
        // Crear una instancia de Stand con valores específicos
        Stand stand = new Stand(1, "Pabellón A", "Grande");

        // Crear una instancia de Comentario
        Comentario comentario = new Comentario("Visitante1", 4, "Muy buen stand");

        // Agregar el comentario al stand
        stand.agregarComentario(comentario);

        // Verificar que la calificación promedio es la esperada
        assertEquals(4.0, stand.obtenerCalificacionPromedio(), 0.01);
    }

    /**
     * Prueba para verificar el método obtenerCalificacionPromedio() de la clase Stand.
     */
    @Test
    public void testObtenerCalificacionPromedio() {
        // Crear una instancia de Stand con valores específicos
        Stand stand = new Stand(1, "Pabellón A", "Grande");

        // Agregar dos comentarios al stand
        stand.agregarComentario(new Comentario("Visitante1", 4, "Muy buen stand"));
        stand.agregarComentario(new Comentario("Visitante2", 5, "Excelente experiencia"));

        // Verificar que la calificación promedio es la esperada
        assertEquals(4.5, stand.obtenerCalificacionPromedio(), 0.01);
    }

    /**
     * Prueba para verificar el método toString() de la clase Stand.
     */
    @Test
    public void testToString() {
        // Crear una instancia de Stand con valores específicos
        Stand stand = new Stand(1, "Pabellón A", "Grande");

        // Definir el valor esperado para el método toString()
        String expected = "Stand: 1 | Ubicación: Pabellón A | Tamaño: Grande | Sin empresa asignada | Calificación promedio: 0.0";

        // Verificar que el método toString() devuelve el valor esperado
        assertEquals(expected, stand.toString());
    }
}