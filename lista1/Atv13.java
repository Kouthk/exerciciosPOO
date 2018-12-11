package lista1;

import java.util.Scanner;

public class Atv13 {
    
    
    public static void main(String[] args) {
        int ctrl = 1, choose;
        double total = 0;
        String products = "";
        Scanner scan = new Scanner(System.in);
        while(ctrl != 0){
            System.out.println("Código -- Produto -- Preço");
            System.out.println("100 -- Bauru -- R$ 2.00");
            System.out.println("101 -- Cachorro Quente -- R$ 5.00");
            System.out.println("102 -- Refrigerante -- R$ 4.00");
            System.out.println("103 -- Cheeseburger -- R$ 5.00");
            
            choose = scan.nextInt();
            if(choose == 0) break;
            
            switch(choose) {
                case 100: total += 2.00; products += "Bauru \n"; break;
                case 101: total += 5.00; products += "Cachorro Quente \n";break;
                case 102: total += 4.00; products += "Refrigerante \n";break;
                case 103: total += 5.00; products += "Cheeseburguer \n";break;
                default: System.out.println("O código não existe");
            }
        }
        
        System.out.println(products);

    }
 }
