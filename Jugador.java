public class Jugador extends Persona{

    private String id;
    private double saldo;

    public Jugador(String nombre, String id, double saldo) {
        super(nombre);
        this.id = id;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String getIdentificador() {
        return id;
    }
}