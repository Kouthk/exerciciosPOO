package lista1;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        int n, m, greater = 0, lesser = 0, anterior;
        double average = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            m = scan.nextInt();
            
            if(i == 0) {
                greater = m;
                lesser = m;
            }
            
            if(greater < m) 
                greater = m;
            
            if(lesser > m)
                lesser = m;
            
            average += m;
            
            if(i == 0)
                anterior = m;
           // else if(i >= 1) {
           //     if(m > anterior)
            //}
                        
        }
        
        average /= n;
        
        System.out.println("Greater: " + greater);
        System.out.println("Lesses: " + lesser );
        System.out.println("Average: " + average);
    } 
}
