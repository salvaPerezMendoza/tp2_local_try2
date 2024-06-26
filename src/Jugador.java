public class Jugador {
    private String nombre;
    private int puntaje;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void agregarPuntaje(int puntos) {
        this.puntaje += puntos;
    }

    public void restarPuntaje(int puntos) {
        this.puntaje -= puntos;
    }
}