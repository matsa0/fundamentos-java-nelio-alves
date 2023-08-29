package exercicio_01;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
            incorreta informada, escrever a mensagem "Senha Inválida". Quando a senha for informada corretamente deve ser 
            impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
        */
        int senha = 0;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Digite a sua senha: ");
            senha = sc.nextInt();

            if(senha != 2002) {
                System.out.println("Senha incorreta!");
            }
            else {
                System.out.println("Acesso permitido!");
            }
        }
        while(senha != 2002);

        sc.close();
    }
}
