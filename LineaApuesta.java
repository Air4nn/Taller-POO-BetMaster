public class LineaApuesta {
    private EventoDeportivo evento;
    private TipoPronostico pronostico;
    private double coutaSelecccionada;

    public LineaApuesta(EventoDeportivo evento, TipoPronostico pronostico){
            this.evento = evento;
            this.pronostico = pronostico;
            this.coutaSelecccionada = calcularCouta();
    }

    private double calcularCouta(){
        switch(pronostico){
            case LOCAL:
                return evento.getcoutaLocal();
            case EMPATE:
                return evento.getcoutaEmpate();
            case VISITANTE:
                return evento.getcoutaVisitante();
            default:
                return 1;
        }
    }

    public double getCuotaSeleccionada() {
        return coutaSelecccionada;
    }
}