package Atv9;

public class Hora {
    private String segundos;
    private String minutos;

    Hora() {}

    Hora(String minutos, String segundos) {
        this.minutos = minutos;
        this.segundos = segundos;
    }

    Hora(String minutos) {
        this.minutos = minutos;
    }

    public String getSegundos() {
        return segundos;
    }

    public void setSegundos(String segundos) {
        this.segundos = segundos;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    public String toString() {
        String s = "";
        if (this.getMinutos() != null) {
            s += "Minutos:" + getMinutos();
        }
        if (this.getSegundos() != null) {
            s += "Segundos:" + getSegundos();
        }

        return s;
    }
}
