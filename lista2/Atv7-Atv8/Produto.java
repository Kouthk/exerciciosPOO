package Atv7Atv8;

public class Produto {
    private String nome;
    private double preco;
    private Departamento departamento;

    public Produto(String nome, double preco, Departamento departamento) {
        this.nome = nome;
        this.preco = preco;
        this.departamento = departamento;
    }

    public Produto() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) { this.preco = preco; }


    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
