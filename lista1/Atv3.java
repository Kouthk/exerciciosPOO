package lista1;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        String name;
        int age;
        double pay;
        String gender;
        String maritalStatus;
        Scanner scan = new Scanner(System.in);
        
        // Name validation
        name = scan.next();
        if(name.length() < 3) {
            System.out.println("Name need at least 3 caracters");
        }
        
        // Age validation
        age = scan.nextInt();
        if(age < 0 || age > 200) {
            System.out.println("Age must be between 0 and 200");
        }
        
        //pay validation
        pay = scan.nextDouble();
        if(pay < 0) {
            System.out.println("Pay must to be greater than 0");
        }
        
        // Gender validation
        gender = scan.next();
        if(!gender.equals("masculino") && !gender.equals("feminino")) {
            System.out.println("Gender must be masculino or feminino");
        }
        
        
        // Marital Status validation
        maritalStatus = scan.next();
        if(!maritalStatus.equals("solteiro")  && !maritalStatus.equals("casado")  && !maritalStatus.equals("viuvo") && !maritalStatus.equals("divorciado")) {
            System.out.println("Marital Status is wrong. Please choose another");
        }
    }
}
