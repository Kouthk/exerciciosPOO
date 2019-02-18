package Atv12;

import java.util.ArrayList;

public class Celular {
    private String operadora;
    private String numero;
    private ArrayList<String> numerosChamados = new ArrayList<>();
    private ArrayList<Contato> contatos = new ArrayList<>();
    private ArrayList<Mensagem> mensagens = new ArrayList<>();

    Celular() {}

    public Celular(String operadora, String numero) {
        this.operadora = operadora;
        this.numero = numero;
    }

    public void realizarChamada(String numeroChamada) {
        numerosChamados.add(numeroChamada);
        if(numeroChamada.length() > 11 || numeroChamada.length() < 11)
            System.out.println("Número de dígitos inválido. Digite uma numeração válida");
        else
            System.out.println("Chamada feita com sucesso");
    }

    public void enviarMensagen(Mensagem msg) {
        mensagens.add(msg);
        if(msg.getNumero().length() > 11 || msg.getNumero().length() < 11)
            System.out.println("Número de dígitos inválido. Digite uma numeração válida");
        else
            System.out.println("Mensagem enviada com sucesso");
    }

    public void mostrarMensagensEnviadas() {
        System.out.println("As mensagens enviadas foram: ");
        for(Mensagem mensagem : this.getMensagens())
            System.out.println(mensagem);
    }
    public void mostrarChamadasFeitas() {
        System.out.println("As chamadas feitas foram: ");
        for(String chamadasFeitas : this.getNumerosChamados())
            System.out.println(chamadasFeitas);
    }

    public void consultarContatos() {
        System.out.println("****** Lista de contatos ******");
        for(Contato contato : this.getContatos())
            System.out.println(contato);
    }

    public void adicionaContato(Contato contato) {
        contatos.add(contato);
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<String> getNumerosChamados() {
        return numerosChamados;
    }

    public void setNumerosChamados(ArrayList<String> numerosChamados) {
        this.numerosChamados = numerosChamados;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public ArrayList<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(ArrayList<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }
}
