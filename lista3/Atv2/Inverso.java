package lista3.Atv2;

import java.util.Scanner;

public class Inverso {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];

        for(int i = 9; i >=0; i--)
            numeros[i] = scan.nextInt();

        for(int numero: numeros)
            System.out.println(numero);

    }
}
