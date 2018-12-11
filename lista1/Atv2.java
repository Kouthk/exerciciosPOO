package lista1;


public class Atv2 {
    String sucessMessage = "Everything is alright";
    String faultMessage = "User and password must be different";
    String userPassword(String user, String password) {
        return (!user.equals(password)) ? sucessMessage : faultMessage;
    }
    
    public static void main(String[] args) {
        Atv2 atividade2 = new Atv2();
        System.out.println(atividade2.userPassword("kayke", "kayke"));
    }
}
