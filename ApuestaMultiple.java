import java.util.List;
import java.util.ArrayList;

public class ApuestaMultiple extends Apuesta {

    private List<LineaApuesta> lineas;

    public ApuestaMultiple(double monto, Jugador jugador) {
        super(monto, jugador);
        this.lineas = new ArrayList<>();
    }

    public void agregarLinea(LineaApuesta linea) {
        lineas.add(linea);
    }

    @Override
    public double calcularGananciaPotencial(double monto) {
        double producto = 1;

        for (LineaApuesta linea : lineas) {
            producto *= linea.getCuotaSeleccionada();
        }

        return monto * producto;
    }
}