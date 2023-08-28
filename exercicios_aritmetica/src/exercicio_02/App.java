package exercicio_02;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
        casas decimais conforme exemplos. 
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159
        */

        Scanner sc = new Scanner(System.in);
        double raio, pi = 3.14, area;



        System.out.println("Digite o valor do raio do círculo > ");
        raio = sc.nextDouble();
        
        area = pi * Math.pow(raio, 2);
        System.out.println("ÁREA DO CÍRUCLO : " + area);

        sc.close();

    }

}
