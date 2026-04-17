package ar.edu.unahur.obj2.w2j.contenidos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContenidoTest {
    @Test
    void dadoUnDocumental_seCalculaElCosto() { //heven_when_then
        Contenido docu= new Documental("la vida salvaje", 10.0);

        assertEquals(10.5,docu.costo());
    }

    @Test
    void testDoCosto() {

    }

    @Test
    void testGetCostoBase() {

    }

    @Test
    void testGetTitulo() {

    }

    @Test
    void testSetCostoBase() {

    }

    @Test
    void testSetTitulo() {

    }
}
