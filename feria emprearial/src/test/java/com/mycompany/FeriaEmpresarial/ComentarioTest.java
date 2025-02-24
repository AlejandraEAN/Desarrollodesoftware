/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.FeriaEmpresarial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComentarioTest {

    @Test
    public void testGetCalificacion() {
        Comentario comentario = new Comentario("Visitante1", 4, "Muy buen stand");
        assertEquals(4, comentario.getCalificacion());
    }

    @Test
    public void testToString() {
        Comentario comentario = new Comentario("Visitante1", 4, "Muy buen stand");
        String expected = "Comentario de Visitante1 | Calificación: 4 | Mensaje: Muy buen stand";
        assertEquals(expected, comentario.toString());
    }
}
