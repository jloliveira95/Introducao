
package introducao;

import java.util.Scanner;


public class EntradaSaida {
    
    public static void main(String[] args) {
        // variáveis
        float temperatura;
        String nome;
        float fahrenheint;
        
        //pedir/inserir nome e temperatura
        Scanner leia = new Scanner (System.in);
        
        //Entrada de     dados
        System.out.println("Digite seu nome:");
        nome = leia.nextLine();
        
        System.out.println("Temperatura");
        temperatura = leia.nextFloat();
        
        //processamento
        fahrenheint = temperatura * 1.8f + 32;
        
        //saída
        System.out.println("Bom dia! " + nome);
        System.out.printf("A temperatura em fahrenheint é: %2.2f F°",fahrenheint);
        
        
    }
}
