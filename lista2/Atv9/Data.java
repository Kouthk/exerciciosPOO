package Atv9;

public class Data {
    private String dia;
    private String mes;
    private String ano;
    private int diaInt;
    private int mesInt;
    private int anoInt;

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

    Data(int diaInt, int mesInt, int anoInt) {
        this.dia = dia;
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

    public int getDiaInt() {
        return diaInt;
    }

    public void setDiaInt(int diaInt) {
        this.diaInt = diaInt;
    }

    public int getMesInt() {
        return mesInt;
    }

    public void setMesInt(int mesInt) {
        this.mesInt = mesInt;
    }

    public int getAnoInt() {
        return anoInt;
    }

    public void setAnoInt(int anoInt) {
        this.anoInt = anoInt;
    }
}
