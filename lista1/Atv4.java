package lista1;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        int i;
        int j;
        Scanner scan = new Scanner(System.in);
        
        i = scan.nextInt();
        j = scan.nextInt();
        
        while(i <= j) {
            if(i % 2 == 0)
                System.out.println(i);
            i++;
        }
        
    }
}
