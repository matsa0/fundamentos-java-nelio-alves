package exercicio_03;

import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B 
        pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        */
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[4];

        for(int i=0; i<valores.length; i++) {
            System.out.printf("Digite o %dº valor inteiro: ", i+1);
            valores[i] = sc.nextInt();
        }

        int result = diferencaInteiros(valores);
        System.out.println("Resultado > " + result);

        sc.close();
    }

    public static int diferencaInteiros(int[] vetor) {
        return (vetor[0] * vetor[1]) - (vetor[2] * vetor[3]);
    }
}
