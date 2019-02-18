package Atv14;

public class Empresa {
    private double entrada;
    private double saida;
    private double caixa;

    Empresa() {}

    public Empresa(double entrada, double saida, double caixa) {
        this.entrada = entrada;
        this.saida = saida;
        this.caixa = caixa;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public double getSaida() {
        return saida;
    }

    public void setSaida(double saida) {
        this.saida = saida;
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }
}
