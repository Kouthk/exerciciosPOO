package Atv7Atv8;


import java.util.ArrayList;

public class TesteDepartamento {

    public static void mostrarProdutos(ArrayList<Departamento> departamentos) {
        for(Departamento dep: departamentos) {
            System.out.println("-------");
            System.out.println(dep.getNome());
            for(Produto prod: dep.getProdutos()) {
                System.out.println(prod.getNome());
            }
        }
    }

    public static double[] valorProdutos(ArrayList<Departamento> departamentos) {
        int tamanho = departamentos.size();
        double[] total = new double[tamanho];
        int i = 0;
        for(Departamento dep : departamentos) {
            double parcial = 0;
            for(Produto prod : dep.getProdutos()) {
                parcial += prod.getPreco();
            }
            total[i] = parcial;
            i++;
        }
        return total;
    }

    public static void main(String[] args) {

        ArrayList<Departamento> departamentos = new ArrayList<>();
        double[] total = new double[departamentos.size()];

        Departamento esportes = new Departamento("Esportes", "Itens de esporte");
        Departamento natacao = new Departamento("Natacao", "Itens de natacao");
        Departamento banho = new Departamento("Banho", "Itens de banho");

        departamentos.add(esportes);
        departamentos.add(natacao);
        departamentos.add(banho);


        esportes.addProduto(new Produto("Bola", 20,esportes));
        esportes.addProduto(new Produto("Chuteira", 200, esportes));
        esportes.addProduto(new Produto("Luvas", 100, esportes));
        natacao.addProduto(new Produto("Oculos de natacao", 25,  natacao));
        natacao.addProduto(new Produto("Sunga", 250,  natacao));
        natacao.addProduto(new Produto("Boia", 500,  natacao));
        banho.addProduto(new Produto("Toalha", 1500,  banho));
        banho.addProduto(new Produto("Sabonete", 15,  banho));
        banho.addProduto(new Produto("Condicionador", 25,  banho));

        mostrarProdutos(departamentos);
        total = valorProdutos(departamentos);
        for(int i = 0; i < total.length; i++) {
            System.out.println(total[i]);
        }
    }
}
