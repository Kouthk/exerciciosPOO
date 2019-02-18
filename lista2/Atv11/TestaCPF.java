package Atv11;

public class TestaCPF {

    public static boolean verificaCpf(String cpf) {
        if(cpf.length() > 14 || cpf.length() < 14)
            return false;


        char[] c = cpf.toCharArray();
        for(int i = 0; i < c.length; i++)
            if (Character.isAlphabetic(c[i]))
                return false;

        return true;
    }

    public static void validade(boolean check) {
        if(check)
            System.out.println("CPF válido");
        else
            System.out.println("CPF Inválido");
    }

    public static void main(String[] args) {
        String cpfValido = "500.551.440-20";
        String cpfInvalidoTamanho = "5001.551.440-20";
        String cpfInvalidoLetra = "5a0.5e1.4o0-2u";

        validade(verificaCpf(cpfValido));
        validade(verificaCpf(cpfInvalidoTamanho));
        validade(verificaCpf(cpfInvalidoLetra));

    }
}
