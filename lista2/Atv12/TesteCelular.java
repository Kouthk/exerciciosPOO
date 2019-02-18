package Atv12;

public class TesteCelular {

    public static void main(String[] args) {
        Celular meuCelular = new Celular("Vivo","66975178250");

        meuCelular.adicionaContato(new Contato("Joao", "66921354687", "joao@gmail.com"));
        meuCelular.adicionaContato(new Contato("Maria", "65892102594", "maria@gmail.com"));
        meuCelular.adicionaContato(new Contato("Lucia", "21981275012", "lucia@gmail.com"));
        meuCelular.enviarMensagen(new Mensagem("65920245678","Puro Luxo"));
        meuCelular.enviarMensagen(new Mensagem("66901254012","ZOom zom zom zom zam zam bacon"));
        meuCelular.enviarMensagen(new Mensagem("61921345678","A batata frita subiu na montanha e andou"));
        meuCelular.realizarChamada("66981104500");
        meuCelular.realizarChamada("66921849501");
        meuCelular.realizarChamada("11920193094");

        meuCelular.consultarContatos();
        meuCelular.mostrarMensagensEnviadas();
        meuCelular.mostrarChamadasFeitas();
    }
}
