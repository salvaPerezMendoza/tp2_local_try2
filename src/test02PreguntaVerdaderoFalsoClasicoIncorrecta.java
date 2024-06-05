import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class test02PreguntaVerdaderoFalsoClasicoIncorrecta {

    @Test
    public void testPreguntaVerdaderoFalsoClasicoIncorrecta() {
        //Arrange
        // Crear jugadores
        Jugador jugador1 = new Jugador("Alice");
        Jugador jugador2 = new Jugador("Bob");
        List<Jugador> jugadores = Arrays.asList(jugador1, jugador2);

        // Crear lista de respuestas incorrectas
        List<String> respuestas = Arrays.asList("Falso", "Falso");

        // Crear la pregunta de Verdadero/Falso clásico
        PreguntaVerdaderoFalsoClasico pregunta = new PreguntaVerdaderoFalsoClasico(
                "¿El cielo es azul?",
                "Verdadero"
        );

        //Act
        pregunta.evaluar(respuestas, jugadores);

        //Assert
        assertEquals(0, jugador1.getPuntaje());
        assertEquals(0, jugador2.getPuntaje());
    }
}