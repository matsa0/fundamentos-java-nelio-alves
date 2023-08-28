package exercicio_01;
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        /*
        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
        mensagem explicativa, conforme exemplos.
        */
        Scanner sc = new Scanner(System.in);
        int a, b, result;

        try{
            System.out.println("Digite o primeiro número > ");
            a = sc.nextInt();
    
            System.out.println("Digite o segundo número > ");
            b = sc.nextInt();
    
            result = a + b;
            System.out.println("Resultado > "  + result);
        }catch(InputMismatchException e){
            System.out.println("ERRO! Digite um número inteiro.");
        }


        sc.close();
    }
}
