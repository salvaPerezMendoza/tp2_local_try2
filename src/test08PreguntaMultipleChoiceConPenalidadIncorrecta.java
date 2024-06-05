import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class test08PreguntaMultipleChoiceConPenalidadIncorrecta {

    @Test
    public void testPreguntaMultipleChoiceConPenalidadIncorrecta() {
        // Crear jugadores
        Jugador jugador1 = new Jugador("Alice");
        Jugador jugador2 = new Jugador("Bob");
        List<Jugador> jugadores = Arrays.asList(jugador1, jugador2);

        // Crear lista de respuestas incorrectas
        List<String> respuestas = Arrays.asList("A,C", "B,C");

        // Crear la pregunta de Múltiple Choice con penalidad
        PreguntaMultipleChoiceConPenalidad pregunta = new PreguntaMultipleChoiceConPenalidad(
                "Seleccione las opciones correctas",
                Arrays.asList("A", "B", "C"),
                Arrays.asList("A", "B")
        );

        // Evaluar las respuestas
        pregunta.evaluar(respuestas, jugadores);

        // Verificar que los puntos se restaron correctamente
        assertEquals(-1, jugador1.getPuntaje());
        assertEquals(-1, jugador2.getPuntaje());
    }
}
