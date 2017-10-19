
package trabalhoprogramacao;

import java.util.Scanner;

public class Exercicio6 {
    
    public static void main(String[] args) {
    
    //Exercicio 06
        Scanner digitarNumero = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = digitarNumero.nextInt();
        
        if(num%2 == 0)
            System.out.println("Par");
        else
            System.out.println("Impar");
    
}
}
