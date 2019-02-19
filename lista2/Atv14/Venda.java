package Atv14;

public class Venda {
    private Produto produto;
    private int quantidade;
    private Cliente cliente;
    private Fornecedor fornecedor;

    Venda() {}

    public Venda(Produto produto, int quantidade, Cliente cliente, Fornecedor fornecedor) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.cliente = cliente;
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
