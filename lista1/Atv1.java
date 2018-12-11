package lista1;

public class Atv1 {
    double maiorNum(double num1, double num2) {
        return (num1 > num2 ) ? num1 : num2;
    }
    
    
    public static void main(String[] args) {
        Atv1 atividade = new Atv1();
        System.out.println(atividade.maiorNum(15, 25));
    }

}

