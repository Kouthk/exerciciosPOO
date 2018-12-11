/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

/**
 *
 * @author mathe
 */
public class Atv9 {
    
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
        
        void printPrimo(int i, int j) {
            while(i <= j) {
                if(primo(i))
                    System.out.println(i);
                i++;
            } 
        }
        
        
    public static void main(String[] args) {
        Atv9 atv9 = new Atv9();
        
        atv9.printPrimo(1, 10); 
    }
    
}
