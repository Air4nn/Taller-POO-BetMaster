public class EventoDeportivo {
    private String codigo;
    private String descripcion;
    private double coutaLocal;
    private double coutaVisitante;
    private double coutaEmpate;

    public EventoDeportivo(String codigo,String descripcion,double coutaLocal,double coutaVisitante,double coutaEmpate) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.coutaLocal = coutaLocal;
        this.coutaEmpate = coutaEmpate;
        this.coutaVisitante = coutaVisitante;
    }

    public double getcoutaLocal(){
        return coutaLocal;
    }
    public double getcoutaEmpate(){
        return coutaEmpate;
    }
    public double getcoutaVisitante(){
        return coutaVisitante;
    }

}