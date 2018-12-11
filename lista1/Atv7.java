package lista1;

import java.util.Scanner;
import java.util.ArrayList;

public class Atv7 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        double total = 0;
        ArrayList<String> productName = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        ArrayList<Integer> amount = new ArrayList<>();
        ArrayList<Double> discount = new ArrayList<>();
        
        n = scan.nextInt();
        
        for(int i = 0; i < n; i++) {
            productName.add(scan.next());
            price.add(scan.nextDouble());
            amount.add(scan.nextInt());
            discount.add(scan.nextDouble());
            total += price.get(i) * amount.get(i) - discount.get(i); 
        }
        
        for(int i = 0; i < n; i++ ) {
            System.out.println(productName.get(i));
            System.out.println(price.get(i));
            System.out.println(amount.get(i));
            System.out.println(discount.get(i));
        }
        System.out.println(total);
    }
    
}
