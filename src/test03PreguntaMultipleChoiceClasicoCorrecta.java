import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class test03PreguntaMultipleChoiceClasicoCorrecta {

    @Test
    public void testPreguntaMultipleChoiceClasicoCorrecta() {
        //Arrange
        // Crear jugadores
        Jugador jugador1 = new Jugador("Alice");
        Jugador jugador2 = new Jugador("Bob");
        List<Jugador> jugadores = Arrays.asList(jugador1, jugador2);

        // Crear lista de respuestas correctas, lo que respondio Alice y lo que respondio Bob
        List<String> respuestas = Arrays.asList("A,B", "A,B");

        // Crear la pregunta de Múltiple Choice clásico
        PreguntaMultipleChoiceClasico pregunta = new PreguntaMultipleChoiceClasico(
                "Seleccione las opciones correctas",
                Arrays.asList("A", "B", "C"),
                Arrays.asList("A", "B")
        );

        // Act
        pregunta.evaluar(respuestas, jugadores);

        // Assert
        assertEquals(1, jugador1.getPuntaje());
        assertEquals(1, jugador2.getPuntaje());
    }
}
