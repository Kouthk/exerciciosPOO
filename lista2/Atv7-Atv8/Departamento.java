package Atv7-Atv8;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private String descricao;
    private ArrayList<Produto> produtos =  new ArrayList<>();
    
    public Departamento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    void addProduto (Produto produto){
        this.produtos.add(produto);
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

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
