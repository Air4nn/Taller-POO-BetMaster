import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CasaDeApuestas casa = new CasaDeApuestas("BetMaster");

        int opcion = -1;

        while (opcion != 0) {

            try {
                System.out.println("\n1. Registrar jugador");
                System.out.println("2. Registrar evento");
                System.out.println("3. Crear ticket simple");
                System.out.println("4. Ver tickets");
                System.out.println("0. Salir");

                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {

                    case 1:
                        System.out.println("Nombre:");
                        String nombre = sc.nextLine();

                        System.out.println("ID:");
                        String id = sc.nextLine();

                        System.out.println("Saldo:");
                        double saldo = sc.nextDouble();
                        sc.nextLine();

                        casa.agregarJugador(new Jugador(nombre, id, saldo));
                        System.out.println("Jugador registrado");
                        break;

                    case 2:
                        System.out.println("Codigo:");
                        String codigo = sc.nextLine();

                        System.out.println("Descripcion:");
                        String desc = sc.nextLine();

                        System.out.println("Cuota local (Digite los numeros decimales con , para evitar errores) ");
                        double cl = sc.nextDouble();

                        System.out.println("Cuota empate (Digite los numeros decimales con , para evitar errores) ");
                        double ce = sc.nextDouble();

                        System.out.println("Cuota visitante (Digite los numeros decimales con , para evitar errores) ");
                        double cv = sc.nextDouble();
                        sc.nextLine();

                        casa.agregarEvento(new EventoDeportivo(codigo, desc, cl, ce, cv));
                        System.out.println("Evento registrado");
                        break;

                    case 3:
                        // Buscar jugador
                        System.out.println("ID del jugador:");
                        String idBuscar = sc.nextLine();

                        Jugador jugador = null;

                        for (Jugador j : casa.getJugadores()) {
                            if (j.getIdentificador().equals(idBuscar)) {
                                jugador = j;
                                break;
                            }
                        }

                        if (jugador == null) {
                            System.out.println("Jugador no encontrado");
                            break;
                        }

                        // Cantidad que se va a apostar
                        System.out.println("Monto a apostar:");
                        double monto = sc.nextDouble();
                        sc.nextLine();

                        if (jugador.getSaldo() < monto) {
                            System.out.println("Saldo insuficiente");
                            break;
                        }

                        // Seleccionar el evento
                        if (casa.getEventos().isEmpty()) {
                            System.out.println("No hay eventos registrados");
                            break;
                        }

                        System.out.println("Eventos disponibles:");
                        for (int i = 0; i < casa.getEventos().size(); i++) {
                            System.out.println(i + ". Evento");
                        }

                        int index = sc.nextInt();
                        sc.nextLine();

                        EventoDeportivo evento = casa.getEventos().get(index);

                        // decision de pronostico
                        System.out.println("1. Local  2. Empate  3. Visitante");
                        int op = sc.nextInt();
                        sc.nextLine();

                        TipoPronostico pronostico;

                        if (op == 1) pronostico = TipoPronostico.LOCAL;
                        else if (op == 2) pronostico = TipoPronostico.EMPATE;
                        else pronostico = TipoPronostico.VISITANTE;

                        // crear linea
                        LineaApuesta linea = new LineaApuesta(evento, pronostico);

                        // crear ticket
                        TicketApuesta ticket = new TicketApuesta("T" + (casa.getTickets().size() + 1), jugador, monto);
                        ticket.agregarLinea(linea);

                        casa.agregarTicket(ticket);

                        // descontar saldo
                        jugador.setSaldo(jugador.getSaldo() - monto);

                        System.out.println("Ticket creado con éxito");
                        break;

                    case 4:
                        if (casa.getTickets().isEmpty()) {
                            System.out.println("No hay tickets");
                        } else {
                            for (TicketApuesta t : casa.getTickets()) {
                                System.out.println("Ticket: " + t.getMontoTotal()
                                        + " | Jugador: " + t.getJugador().getNombre());
                            }
                        }
                        break;

                    case 0:
                        System.out.println("Saliendo del prgrama");
                        break;

                    default:
                        System.out.println("Opción inválida");
                }

            } catch (Exception e) {
                System.out.println("Error intenta de nuevo ");
                sc.nextLine(); // limpiar
            }
        }

        sc.close();
    }
}
