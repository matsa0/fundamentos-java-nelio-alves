package exercicio_switch_case;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        switch(num % 2) {
        case 0:
            System.out.println("O número "+ num + " é par!");
            break;
        case 1:
            System.out.println("O número "+ num + " é ímpar!");
            break;
        default:
            System.out.println("Valor inválido!");   
            break;
        }
        sc.close();
    }
}

