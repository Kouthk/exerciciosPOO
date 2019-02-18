package Atv13;

public class Gerente extends Funcionario {

    Gerente() {}

    public Gerente(String nome, String cargo, String id) {
        super(nome, cargo, id);
        this.setComissao(0.02);
        this.setSalario(1200);
    }
}
