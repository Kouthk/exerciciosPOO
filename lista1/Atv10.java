package lista1;

import java.util.Scanner;

public class Atv10 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ctrl;
        
        ctrl = scan.nextInt();
        
        switch(ctrl) {
            case 1: System.out.println("Azul"); break;
            case 2: System.out.println("Verde"); break;
            case 3: System.out.println("Amarelo"); break;
            case 4: System.out.println("Preto"); break;
            case 5: System.out.println("Vermelho"); break;
            case 6: System.out.println("Marrom"); break;
            default: System.out.println("Cor não encontrada");
        }
        
    }
}
