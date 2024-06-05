import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class test06PreguntaVerdaderoFalsoConPenalidadIncorrecta {

    @Test
    public void testPreguntaVerdaderoFalsoConPenalidadIncorrecta() {
        // Crear jugadores
        Jugador jugador1 = new Jugador("Alice");
        Jugador jugador2 = new Jugador("Bob");
        List<Jugador> jugadores = Arrays.asList(jugador1, jugador2);

        // Crear lista de respuestas incorrectas
        List<String> respuestas = Arrays.asList("Falso", "Falso");

        // Crear la pregunta de Verdadero/Falso con penalidad
        PreguntaVerdaderoFalsoConPenalidad pregunta = new PreguntaVerdaderoFalsoConPenalidad(
                "¿El cielo es azul?",
                Arrays.asList("Verdadero", "Falso"),
                Arrays.asList("Verdadero")
        );

        // Evaluar las respuestas
        pregunta.evaluar(respuestas, jugadores);

        // Verificar que los puntos se restaron correctamente
        assertEquals(-1, jugador1.getPuntaje());
        assertEquals(-1, jugador2.getPuntaje());
    }
}
