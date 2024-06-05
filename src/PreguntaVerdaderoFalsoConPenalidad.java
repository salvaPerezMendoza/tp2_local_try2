import java.util.List;

public class PreguntaVerdaderoFalsoConPenalidad extends Pregunta {
    public PreguntaVerdaderoFalsoConPenalidad(String texto, String opcionCorrecta) {
        super(texto, List.of("Verdadero", "Falso"), List.of(opcionCorrecta));
    }

    @Override
    public void evaluar(List<String> respuestas, List<Jugador> jugadores) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (respuestas.get(i).equals(opcionesCorrectas.get(0))) {
                jugadores.get(i).agregarPuntaje(1);
            } else {
                jugadores.get(i).restarPuntaje(1);
            }
        }
    }
}