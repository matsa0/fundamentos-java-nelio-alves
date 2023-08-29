package do_while;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um programa que leia números e quando for digitado o 0 ele para e soma os números lidos
        Scanner sc = new Scanner(System.in);
        double num = 0, soma = 0;
        do {
            System.out.println("Digite um número: ");
            num = sc.nextDouble();

            soma += num;
        }
        while(num != 0);

        System.out.println("Soma dos números > " + soma);

        sc.close();
    }
}
