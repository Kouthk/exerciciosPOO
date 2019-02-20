package Atv9;

public class Data {
    private String dia;
    private String mes;
    private String ano;

    Data() {}

    Data(String dia, String mes, String ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    Data(String mes, String ano) {
        this.mes = mes;
        this.ano = ano;
    }


    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String toString() {
        String s = "";
        if (this.getDia() != null) {
            s += "Dia:" + getDia();
        }
        if (this.getMes() != null) {
            s += "Mes:" + getDia();
        }
        if (this.getMes() != null) {
            s += "Mes:" + getAno();
        }

        return s;

    }
}
