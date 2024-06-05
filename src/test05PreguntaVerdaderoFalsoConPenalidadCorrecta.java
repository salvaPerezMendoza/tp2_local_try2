import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class test05PreguntaVerdaderoFalsoConPenalidadCorrecta {

    @Test
    public void testPreguntaVerdaderoFalsoConPenalidadCorrecta() {
        // Arrange
        // Crear jugadores
        Jugador jugador1 = new Jugador("Alice");
        Jugador jugador2 = new Jugador("Bob");
        List<Jugador> jugadores = Arrays.asList(jugador1, jugador2);

        // Crear lista de respuestas correctas
        List<String> respuestas = Arrays.asList("Verdadero", "Verdadero");

        // Crear la pregunta de Verdadero/Falso con penalidad
        PreguntaVerdaderoFalsoConPenalidad pregunta = new PreguntaVerdaderoFalsoConPenalidad(
                "¿El cielo es azul?",
                "Verdadero"
        );

        // Act
        pregunta.evaluar(respuestas, jugadores);

        // Assert
        assertEquals(1, jugador1.getPuntaje());
        assertEquals(1, jugador2.getPuntaje());
    }
}
