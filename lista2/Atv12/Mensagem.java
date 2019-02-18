package Atv12;

public class Mensagem {
    private String numero;
    private String mensagem;

    Mensagem() {}

    public Mensagem(String numero, String mensagem) {
        this.numero = numero;
        this.mensagem = mensagem;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String toString() {
        String s =
                "Número:  " + getNumero() + " \n" +
                "Mensagem: " + getMensagem() + " \n";
        return s;
    }
}
