import java.util.List;

public abstract class Pregunta {
    protected String texto;
    protected List<String> opciones;
    protected List<String> opcionesCorrectas;

    public Pregunta(String texto, List<String> opciones, List<String> opcionesCorrectas) {
        this.texto = texto;
        this.opciones = opciones;
        this.opcionesCorrectas = opcionesCorrectas;
    }

    public abstract void evaluar(List<String> respuestas, List<Jugador> jugadores);
}
