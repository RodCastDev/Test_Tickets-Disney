package models;

public class model_DataTicket {
    String fecha;
    String dias;
    String adultos;
    String ninos;

    public model_DataTicket(String fecha, String dias, String adultos, String ninos) {
        this.fecha = fecha;
        this.dias = dias;
        this.adultos = adultos;
        this.ninos = ninos;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDias() {
        return dias;
    }

    public String getAdultos() {
        return adultos;
    }

    public String getNinos() {
        return ninos;
    }

}
