package Atv14;

import java.util.ArrayList;

public class TesteCompraVenda {

    public static double fluxoDeCaixa(ArrayList<Compra> compras, ArrayList<Venda> vendas) {
        double entrada = 0, saida = 0, valor = 0;
        for(Compra compra : compras)
            saida += compra.getProduto().getPrecoCompra() * compra.getQuantidade();
        for(Venda venda : vendas)
            entrada += venda.getProduto().getPrecoVenda() * venda.getQuantidade();

        valor = entrada - saida;
        return valor;
    }

    public static void main(String[] args) {
        ArrayList<Venda> vendas = new ArrayList<>();
        ArrayList<Compra> compras = new ArrayList<>();
        Departamento esporte = new Departamento("Esporte");
        Produto tesoura = new Produto("Tesoura", 10, 20, esporte);
        Cliente cli1 = new Cliente("Karla");
        Fornecedor for1 = new Fornecedor("Aka produções");

        compras.add(new Compra(tesoura, 100, cli1, for1));
        vendas.add(new Venda(tesoura, 55, cli1, for1));

        double valor = fluxoDeCaixa(compras, vendas);
        System.out.println(valor);


    }
}
