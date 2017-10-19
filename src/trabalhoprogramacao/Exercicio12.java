
package trabalhoprogramacao;

import java.util.Scanner;

public class Exercicio12 {
   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float n1, n2, n3;
        
        System.out.println("Digite o primeiro numero: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite o segundo numero: ");
        n2 = entrada.nextFloat();
        System.out.println("Digite o terceito numero: ");
        n3 = entrada.nextFloat();
        
        if((n1 == n2) & (n1 == n3) & (n2 == n3))
            System.out.println("Trinangulo equilatero");
        else if 
                (((n1==n2)&(n1!= n3)) || ((n1==n3)&(n1!=n2))|| ((n2=n3)&(n2!=n1)));
                
       
    }
}
