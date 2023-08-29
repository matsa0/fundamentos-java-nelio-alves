package exercicio_03;

import java.util.Scanner;

public class App {
    private static int alcool = 0;
    private static int diesel = 0;
    private static int gasolina = 0;

    public static void main(String[] args) {
        int tipoCombustivel = 0;
        Scanner sc = new Scanner(System.in);

        while (tipoCombustivel != 4) {
            tipoCombustivel = getCombustivel(sc);

            if (tipoCombustivel != 4) {
                if (validaCombustivel(tipoCombustivel)) {
                    preferencia(tipoCombustivel);
                } else {
                    System.out.println("Digite uma opção válida de combustível");
                }
            }
        }

        sc.close();
        imprimirPreferencia();
    }

    public static boolean validaCombustivel(int tipoCombustivel) {
        return tipoCombustivel >= 1 && tipoCombustivel <= 3;
    }

    public static int getCombustivel(Scanner sc) {
        System.out.println("***COMBUSTÍVEIS***\n1 - Álcool\n2 - Gasolina\n3 - Diesel\n4 - FIM\n");
        System.out.println("Digite o tipo de combustível que deseja abastecer: ");
        int tipoCombustivel = sc.nextInt();
        return tipoCombustivel;
    }

    public static void preferencia(int tipoCombustivel) {
        if (tipoCombustivel == 1) {
            alcool++;
        } else if (tipoCombustivel == 2) {
            gasolina++;
        } else if (tipoCombustivel == 3) {
            diesel++;
        }
    }

    public static void imprimirPreferencia() {
        System.out.println("***Preferência dos clientes***");
        System.out.println("Álcool > " + alcool);
        System.out.println("Gasolina > " + gasolina);
        System.out.println("Diesel > " + diesel);
    }
}
