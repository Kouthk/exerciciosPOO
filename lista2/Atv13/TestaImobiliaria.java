package Atv13;

import java.util.ArrayList;

public class TestaImobiliaria {

    public static double calculaSalario(double salarioBase, Double vendasTotal, double comissao) {
        double salario = salarioBase + (vendasTotal*comissao);
        return salario;
    }


    public static void main(String[] args) {
        ArrayList<Imovel> imoveis = new ArrayList<>();
        double total = 0;
        imoveis.add(new Imovel("Rua 2", 1000));
        imoveis.add(new Imovel("Rua Joao Pereira", 1000));
        imoveis.add(new Imovel("Rua K", 1000));
        Socio socio1 = new Socio("Fernanda", "Socio", "01");
        Corretor corretor1 = new Corretor("Luciano", "Corretor", "01");
        Gerente gerente1 = new Gerente("Jessica", "Gerente", "01");
        Secretario secretario1 = new Secretario("Leandro", "Secretario", "01");
        ServicosGerais servicos1 = new ServicosGerais ("Lizzandra", "Serviços gerais", "01");

        for(Imovel imo : imoveis)
            total += imo.getValor();

        socio1.setSalario(calculaSalario(socio1.getSalario(), total, socio1.getComissao()));
        corretor1.setSalario(calculaSalario(corretor1.getSalario(), total, corretor1.getComissao()));
        gerente1.setSalario(calculaSalario(gerente1.getSalario(), total, gerente1.getComissao()));
        secretario1.setSalario(calculaSalario(secretario1.getSalario(), total, secretario1.getComissao()));
        servicos1.setSalario(calculaSalario(servicos1.getSalario(), total, servicos1.getComissao()));
        System.out.println(socio1.getSalario());
        System.out.println(corretor1.getSalario());
        System.out.println(gerente1.getSalario());
        System.out.println(secretario1.getSalario());
        System.out.println(servicos1.getSalario());

    }
}
