import java.util.List;

public class PreguntaMultipleChoiceConPenalidad extends Pregunta {
    public PreguntaMultipleChoiceConPenalidad(String texto, List<String> opciones, List<String> opcionesCorrectas) {
        super(texto, opciones, opcionesCorrectas);
    }

    @Override
    public void evaluar(List<String> respuestas, List<Jugador> jugadores) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (respuestas.get(i).equals(String.join(",", opcionesCorrectas))) {
                jugadores.get(i).agregarPuntaje(1);
            } else {
                jugadores.get(i).restarPuntaje(1);
            }
        }
    }
}
