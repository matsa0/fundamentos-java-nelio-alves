package exercicio_06;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*Ler um número inteiro N e calcular todos os seus divisores.*/

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcular os seus divisores: ");
        n = sc.nextInt();

        
        System.out.println("Divisores");
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
