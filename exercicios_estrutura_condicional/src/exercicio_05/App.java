package exercicio_05;

import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A  seguir, 
        calcule e mostre o valor da conta a pagar.
         * 1 - Cachorro Quente - R$4.00
         * 2 - X-Salada - R$4.50
         * 3 - X-Bacon - R$5.00
         * 4 - Torrada Simples - R$2.00
         * 5 - Refrigerante = R$1.50
        */
        boolean comer = true;
        int adicionar;
        int codigo , qnt;
        double total = 0.0;
        try (Scanner sc = new Scanner(System.in)) {
            while(comer) {
                System.out.println("Digite o código do item que deseja consumir: ");
                codigo = sc.nextInt();
                sc.nextLine();

                System.out.println("Digite a quantidade que deseja consumir: ");
                qnt = sc.nextInt();
                sc.nextLine();

                double conta = calculaConta(codigo, qnt, total);
                total = conta;

                System.out.println("Deseja adicionar mais um item? (1 - sim || 0 - nao): ");
                adicionar = sc.nextInt();

                if(adicionar == 1) {
                    comer = true;
                }
                if(adicionar == 0) {
                    comer = false;
                }
                System.out.println();
                System.out.println("Valor total da conta > " + conta);
                System.out.println();
            }
            sc.close();
        }
    }

    public static double calculaConta(int codigo, int qnt, double total) {
        switch(codigo) {
        case 1:
            int cQuente = qnt * 4;
            total = total + cQuente;
            break;
        case 2:
            double xSalada = qnt * 4.5;
            total = total + xSalada;
            break;
        case 3:
            int xBacon = qnt * 5;
            total = total + xBacon;
            break;
        case 4:
            int torrada = qnt * 2;
            total = total + torrada;
            break;
        case 5:
            double refrigente = qnt * 1.5;
            total = total + refrigente;
            break;
        default:
            System.out.println("Código inválido!");
            break;
        }
        return total;
    }
}
