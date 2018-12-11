package lista1;


class Atv8 {
    
    boolean primo(int num){
        int ctrl = 0;
        for(int i = 1; i < num; i++) {
            if(num % i == 0) 
                ctrl++;
            if (ctrl > 1) 
               return false;   
        }
        return true;
    }
    
    public static void main(String[] args) {
        Atv8 atv8 = new Atv8();
        
        System.out.println(atv8.primo(997)); 
    }
}
