import java.util.List;
import java.util.ArrayList;

public class CasaDeApuestas {

    private String nombre;
    private List<Jugador> jugadores;
    private List<EventoDeportivo> eventos;
    private List<TicketApuesta> tickets;

    public CasaDeApuestas(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.eventos = new ArrayList<>();
        this.tickets = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void agregarEvento(EventoDeportivo evento) {
        eventos.add(evento);
    }

    public void agregarTicket(TicketApuesta ticket) {
        tickets.add(ticket);
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public List<EventoDeportivo> getEventos() {
        return eventos;
    }

    public List<TicketApuesta> getTickets() {
        return tickets;
    }
}