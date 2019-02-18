package Atv13;

public class Socio extends Funcionario {

    Socio() {}

    public Socio(String nome, String cargo, String id) {
        super(nome, cargo, id);
        this.setComissao(0.1);
        this.setSalario(5000);
    }
}
