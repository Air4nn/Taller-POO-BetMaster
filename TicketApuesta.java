import java.util.List;
import java.util.ArrayList;

public class TicketApuesta {

    private String codigo;
    private Jugador jugador;
    private List<LineaApuesta> lineas;
    private double montoTotal;

    public TicketApuesta(String codigo, Jugador jugador, double montoTotal) {
        this.codigo = codigo;
        this.jugador = jugador;
        this.montoTotal = montoTotal;
        this.lineas = new ArrayList<>();
    }

    public void agregarLinea(LineaApuesta linea) {
        lineas.add(linea);
    }

    public List<LineaApuesta> getLineas() {
        return lineas;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public Jugador getJugador() {
        return jugador;
    }
}