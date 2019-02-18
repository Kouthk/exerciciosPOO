package Atv10;

public class TesteNumerosPrimos {
    public static void main(String[] args) {
        NumerosPrimos primo = new NumerosPrimos(20, 2);

        for(int num : primo.retornaNumerosPrimos()){
            System.out.println(num);
        }
    }
}
