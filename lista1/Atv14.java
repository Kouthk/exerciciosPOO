package lista1;

import java.util.Scanner;
import java.util.ArrayList;

public class Atv14 {
    int cod;
    String produto;
    double preco;
    
    public Atv14(int cod, String produto, double preco){
        this.cod = cod;
        this.produto = produto;
        this.preco = preco;
    }
    public Atv14(){};
    
    public int getCod() {
        return this.cod;
    }
    
    public String toString() {
        String s = this.cod + " - " + this.produto + " - " + this.preco + "\n"; 
        return s;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ctrl = 1, choose, codigo;
        String nome;
        double preco;
        Atv14 atv14 = new Atv14();
        ArrayList<Atv14> prod = new ArrayList<>();
        
        while(ctrl != 0) {
            System.out.println("Insira o código do produto");
            codigo = scan.nextInt();
            System.out.println("Insira o nome do produto");
            nome = scan.next();
            System.out.println("Insira o preco do ");
            preco = scan.nextDouble();
            
            
            prod.add(new Atv14(codigo, nome, preco));
            for(Atv14 p : prod){
                System.out.println(p);
            }
            System.out.println("Deseja continuar?");
            choose = scan.nextInt();
            if(choose == 0) break;
        }
        
        
        double total = 0;
        ArrayList<Atv14> products = new ArrayList<>();
        while(ctrl != 0){
            System.out.println("Faça sua compra");
            for(Atv14 p : prod){
                System.out.println(p);
            }
            
            choose = scan.nextInt();
            if(choose == 0) break;
            for(Atv14 p : prod){
                if(choose == p.getCod()) {
                    products.add(p);
                } else {
                    System.out.println("Digite outro código, por favor");
                }
            } 
            
        }
        
        System.out.println(products);

    }
 }
