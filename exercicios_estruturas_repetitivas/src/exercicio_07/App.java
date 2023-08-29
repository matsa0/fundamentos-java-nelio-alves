package exercicio_07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
        começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
        exemplo.*/

        int n;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um número inteiro: ");
            n = sc.nextInt();   
            System.out.println();
    
            for(int i = 1; i <= n; i++) {
                System.out.print(i);
                System.out.print("\t" + Math.pow(i, 2));
                System.out.println("\t" + Math.pow(i, 3));
            }
        } catch(InputMismatchException e) {
            System.out.println("ERRO! Digite um valor válido para n.");
        }

        sc.close();
    }
}
