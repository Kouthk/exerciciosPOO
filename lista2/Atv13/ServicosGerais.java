package Atv13;

public class ServicosGerais extends Funcionario {

    ServicosGerais() {}

    public ServicosGerais(String nome, String cargo, String id) {
        super(nome, cargo, id);
        this.setComissao(0);
        this.setSalario(900);
    }


}
