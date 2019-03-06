package ar.edu.unahur.modelo;

import static org.junit.Assert.*;

import ar.edu.unahur.modelo.Presentador;
import org.junit.Test;

public class PresentadorTest
{
    @Test
    public void sabeSaludarAlMundo()
    {
        assertEquals("¡Hola Mundo!", new Presentador().saludoAlMundo());
    }

    @Test
    public void sabeSaludarAUnaPersona()
    {
        assertEquals("¡Hola Andrea!", new Presentador().saludoPara("Andrea"));
    }

}
