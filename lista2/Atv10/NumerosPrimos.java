package Atv10;

import java.util.ArrayList;

public class NumerosPrimos {
    private int numero1;
    private int numero2;
    private ArrayList<Integer> primos = new ArrayList<>();

    public NumerosPrimos(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public ArrayList<Integer> retornaNumerosPrimos() {
        if(numero1 < numero2){
            for(int i = numero1; i <= numero2; i++) {
                for(int j = 2; j <= i; j++){
                    if(i % j == 0)
                        break;
                    else {
                        primos.add(i);
                        break;
                    }
                }

            }

        } else {
            for(int i = numero2; i <= numero1; i++)
                for(int j = 2; j <= i; j++){
                    if(i % j == 0)
                        break;
                    else {
                        primos.add(i);
                        break;
                    }

                }
            }
        return primos;
    }


}
