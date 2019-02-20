package lista3.Atv1;

public class Tabuada {


    public static  void multiplication(int mult, int num, int num2) {
        if (num > num2)
            System.out.println("Impossível executar a função");
        else
            for(int i = num; i < num2; i++)
                System.out.println(mult + "*" + i + "=" + mult*i);

    }

    public static void main(String[] args) {

        multiplication(4,2, 5);

    }
}
