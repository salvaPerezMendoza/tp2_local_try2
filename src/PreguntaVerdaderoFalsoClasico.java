import java.util.List;

public class PreguntaVerdaderoFalsoClasico extends Pregunta {
    public PreguntaVerdaderoFalsoClasico(String texto, String opcionCorrecta) {
        super(texto, List.of("Verdadero", "Falso"), List.of(opcionCorrecta));
    }

    @Override
    public void evaluar(List<String> respuestas, List<Jugador> jugadores) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (respuestas.get(i).equals(opcionesCorrectas.get(0))) {
                jugadores.get(i).agregarPuntaje(1);
            }
        }
    }
}
