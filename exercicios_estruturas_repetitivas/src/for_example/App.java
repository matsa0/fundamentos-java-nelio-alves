package for_example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*Faça um programa que lê um valor inteiro N e depois N números inteiros. Ao final mostra a soma dos N números lidos;*/

        int n, soma = 0, num;  
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite a quantidade de números que você deseja somar: ");
            n = sc.nextInt();
    
            for(int i = 0; i < n; i++) {
                System.out.printf("Digite o %dº número inteiro: ", i+1);
                num = sc.nextInt();
                soma += num;
            }
            System.out.println("Soma > " + soma);
        } catch(InputMismatchException e) {
            System.out.println("ERRO! Digite um número válido.");
        } catch(Exception e) {
            System.out.println("ERRO Desconhecido: " + e.getMessage());
        }
        sc.close();
    }
}
