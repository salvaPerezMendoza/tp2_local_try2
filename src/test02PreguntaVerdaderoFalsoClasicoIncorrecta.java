import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class test02PreguntaVerdaderoFalsoClasicoIncorrecta {

    @Test
    public void testPreguntaVerdaderoFalsoClasicoIncorrecta() {
        // Crear jugadores
        Jugador jugador1 = new Jugador("Alice");
        Jugador jugador2 = new Jugador("Bob");
        List<Jugador> jugadores = Arrays.asList(jugador1, jugador2);

        // Crear lista de respuestas incorrectas
        List<String> respuestas = Arrays.asList("Falso", "Falso");

        // Crear la pregunta de Verdadero/Falso clásico
        PreguntaVerdaderoFalsoClasico pregunta = new PreguntaVerdaderoFalsoClasico(
                "¿El cielo es azul?",
                Arrays.asList("Verdadero", "Falso"),
                Arrays.asList("Verdadero")
        );

        // Evaluar las respuestas
        pregunta.evaluar(respuestas, jugadores);

        // Verificar que los puntos no se asignaron
        assertEquals(0, jugador1.getPuntaje());
        assertEquals(0, jugador2.getPuntaje());
    }
}