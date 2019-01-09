package Atv7;

public class Departamento {
    private String nome;
    private String descricao;
    private Produto produtos;
    
    public Departamento(String nome, String descricao, Produto produtos) {
        this.nome = nome;
        this.descricao = descricao;
        this.produtos = produtos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }
}
