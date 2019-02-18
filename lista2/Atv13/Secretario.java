package Atv13;

public class Secretario extends Funcionario {

    Secretario() {}

    public Secretario(String nome, String cargo, String id) {
        super(nome, cargo, id);
        this.setComissao(0);
        this.setSalario(1000);
    }
}
