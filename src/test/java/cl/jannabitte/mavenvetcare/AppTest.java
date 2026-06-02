package cl.jannabitte.mavenvetcare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testObtenerMensajeInicio() {
        String mensajeEsperado = "Sistema MavenVetCare iniciado correctamente. Proyecto Java administrado con Maven.";

        String mensajeObtenido = App.obtenerMensajeInicio();

        assertEquals(mensajeEsperado, mensajeObtenido);
    }
}
