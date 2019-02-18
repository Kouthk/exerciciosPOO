package Atv13;

public class Corretor extends Funcionario {

    Corretor() {}

    public Corretor(String nome, String cargo, String id) {
        super(nome, cargo, id);
        this.setComissao(0.05);
        this.setSalario(2500);
    }
}
