package exercicio_08;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um número inteiro: ");
            num = sc.nextInt();

            verificaNum(num);
        } catch(InputMismatchException e) {
            System.out.println("ERRO! Digite um número válido.");
        }

        sc.close();
    }   

    public static void verificaNum(double num) throws InputMismatchException{
        if(num > 0) {
            System.out.println("Número positivo!");
        }
        else if(num < 0) {
            System.out.println("Número negativo!");
        }
        else {
            System.out.println("Número neutro.");
        }
    }   
}