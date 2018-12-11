package lista1;

public class Atv11 {
    
    double sum(double num, double num2) {
        return num + num2;
    }
    
    double multiplication(double num, double num2) {
        return num * num2;
    }
    
    double division(double num, double num2) {
        if(num == 0)
            System.out.println("Impossible");
        return num/num2;
    }
    
    double subtraction(double num, double num2) {
        return num - num2;
    }
    
    double power(double num, double num2) {
        return Math.pow(num, num2);
    }
    
    public static void main(String[] args) {
        Atv11 atv11 = new Atv11();
        
        System.out.println(atv11.subtraction(5, 10));
        System.out.println(atv11.sum(10, 10));
        System.out.println(atv11.division(10, 2));
        System.out.println(atv11.multiplication(10, 2));
        System.out.println(atv11.power(2, 4));
    }
}
