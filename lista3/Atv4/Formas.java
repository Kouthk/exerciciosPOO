// Se fosse python dava pra multiplicar string, ia ser bem mais ez saporra T_T
package lista3.Atv4;

import java.util.Scanner;

public class Formas {

    public static void A(int val) {
        int n = 1; // começa em 1 por eu querer que aumente o número de # que eu printo conforme as iterações acontecerem
        while(n <= val){ // itera até o valor do parâmetro
            // verifica se a variável de controle i é igual ou menor que o iterador n, caso seja positivo ele printa, senão pula uma linha;
            for(int i = 1; i <= n; i++)
                System.out.print("# ");
            System.out.println();
            n++;
        }
    }

    public static void B(int val) {
        int n = val; // começa com o valor total por eu querer que diminua o número de # que eu printo conforme as iterações acontecerem
        while(n >= 1){
            for(int i = 1; i <= n; i++)
                System.out.print(" #");
            System.out.println();
            n--;
        }
    }

    public static void C(int val) {
        // fica mais fácil manipular se eu começar com o valor total aqui,
        // nos próximos passos eu posso usar uma condição pra
        // diminuir ou aumentar o número de # que eu printo
        int n = val;
        // Eu preciso de 1 variável pra fazer a condição do que eu quero printar,
        // ela precisa ser fixa a cada iteração do próximo laço
        for(int c = 1; c <= val; c++){
            for(int i = 1; i <= val; i++) {
                // Usei a variável de controle do for externo para saber em que posição eu devo printar o #
                // Como a iteração do laço é positiva (esquerda pra direita) eu preciso saber apenas
                // qual a posição de c e seguir o padrão proposto pelo exer
                if (c <= i)
                    System.out.print("#");
                else
                    System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // idem ao exer anterior, apenas muda a direção de início do laço externo
    public static void D(int val) {
        int n = val;
        for(int c = val; c >= 1; c--){
            for(int i = 1; i <= val; i++) {
                if (c >= i)
                    System.out.print("#");
                else
                    System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void E(int val) {
        for(int i = 1; i <= val; i++) {
            // Como o padrão mostra a primeira e última linha preenchidas eu posso apenas verificar,
            // se a iteração está sendo feita nessa posição e preencher conforme o padrão
            if(i == 1 || i == val) { // preenche a primeira e ultima linha com #
                int n = 1;
                while(n <= val){
                    System.out.print("# ");
                    n++;
                }
                System.out.println();
            } else {
                int n = 1;
                System.out.print("#");
                // aqui ta o pulo do gato, se você usar apenas o valor de elementos vai dar ruim por faltar espaço dentro
                // da forma. Na linha 71 eu adicionei 1 #+espaço pra ficar mais bonito, se você olhar para o padrão
                // vai perceber que se não for a primeira ou a ultima coluna, tem 1 # no começo e no fim da linha;
                // no centro da figura sempre vai ter o dobro de caracteres por eu ter usado (#+espaço) para desenhar
                // o início e o fim da figura, mas se eu descontar apenas 2 do valor total de iteração, a figura se tornara
                // levemente assimétrica por causa daquele espaço que sobra (espaço da linha 71).
                while(n <= val*2-3){
                    System.out.print(" ");
                    n++;
                }
                System.out.print("#");
                System.out.println();
            }
        }
    }

    public static void F(int val) {
        for(int i = 1; i <= val; i++) {
            // Como o padrão mostra a primeira e última linha preenchidas eu posso apenas verificar,
            // se a iteração está sendo feita nessa posição e preencher conforme o padrão
            if (i == 1 || i == val) { // preenche a primeira e ultima linha com #
                int n = 1;
                while (n <= val) {
                    System.out.print("# ");
                    n++;
                }
                System.out.println();
            } else {
                int n = 1;
                while(n <= val){
                    if(n == i)
                        System.out.print("#");
                    n++;
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int val = scan.nextInt();
        F(val);

    }
}
