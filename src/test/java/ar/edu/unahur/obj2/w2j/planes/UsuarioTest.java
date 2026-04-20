package ar.edu.unahur.obj2.w2j.planes;
import ar.edu.unahur.obj2.w2j.contenidos.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
public class UsuarioTest {
    @Test
    void  dadoUnUsuarioConPlanFamiliar_elCostoEsElDelPlan() {
        //given
        PlanFamiliar planFamiliar = new PlanFamiliar(5);
        Pelicula elCarive=new Pelicula("caribe", 10.0);
        Documental lasVersionesTerrorificas= new Documental("las Versiones Terrorificas", 5.0);
        List<Contenido> contenido= List.of(elCarive,lasVersionesTerrorificas);
        Usuario usuario = new Usuario(contenido, planFamiliar);
        //when
        double costo=usuario.costoDelPlan();

        //then
        assertEquals(5,costo);
        

    }

    @Test
    void testCanVistas() {

    }

    @Test
    void testCostoDelPlan() {

    }

    @Test
    void testExcedentesDelPlan() {

    }

    @Test
    void testGetContenidoVisto() {

    }

    @Test
    void testGetPlan() {

    }

    @Test
    void testSetPlan() {

    }

    @Test
    void testVaciarContenido() {

    }
}
