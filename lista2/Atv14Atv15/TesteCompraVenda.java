//preguiça de fazer menu de cadastro T_T

package Atv14Atv15;

import java.util.ArrayList;

public class TesteCompraVenda {

    public static double fluxoDeCaixa(ArrayList<Compra> compras, ArrayList<Venda> vendas, Gerente gerente, Recepcionista recepcionista) {
        double entrada = 0, saida = 0, valor = 0;
        for(Compra compra : compras)
            saida += compra.getProduto().getPrecoCompra() * compra.getQuantidade(); // valor total de compras
        for(Venda venda : vendas) {
            entrada += venda.getProduto().getPrecoVenda() * venda.getQuantidade(); // valor total de vendas
            valor -= gerente.getSalario()+ (venda.getProduto().getPrecoVenda() * venda.getQuantidade()) * 0.05; // adiciona a comissão e o salario do gerente ao balanco final
            valor -= venda.getVendedor().getSalario()+ (venda.getProduto().getPrecoVenda() * venda.getQuantidade()) * 0.02; // adiciona a comissão e o salario do vendedor ao balanco final

            // tem que fazer a parte de verificar o que e quanto cada vendedor vendeu e aplicar a comissão em cima. #preguiça

        }


        valor += entrada - saida;
        return valor;
    }


    public static void main(String[] args) {
        ArrayList<Venda> vendas = new ArrayList<>();
        ArrayList<Compra> compras = new ArrayList<>();
        Departamento esporte = new Departamento("Esporte");
        Produto tesoura = new Produto("Tesoura", 10, 20, esporte);
        Cliente cli1 = new Cliente("Karla");
        Fornecedor for1 = new Fornecedor("Aka produções");
        Vendedor vend1 = new Vendedor("Lucia", "Vendedor", 1500);

        Gerente gen1 = new Gerente("Ana", "Gerente", 2500);
        Recepcionista rec1= new Recepcionista("Carlos", "Recepcionista", 1000);



        compras.add(new Compra(tesoura, 200, cli1, for1));
        vendas.add(new Venda(tesoura, 500, cli1, for1,vend1));


        double valor = fluxoDeCaixa(compras, vendas, gen1, rec1);
        System.out.println(valor);


    }
}
