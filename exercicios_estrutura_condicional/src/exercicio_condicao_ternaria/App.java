package exercicio_condicao_ternaria;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Operadira civra R$50.00 por um plano que dá direito a 100 minutos
        //Cada minuto que exceder a franquia de 100 minutos custa RS2.00
        Scanner sc = new Scanner(System.in);
        
        int minutos, pagar;
        System.out.println("Informe a quantidade de minutos consumidos: ");
        minutos = sc.nextInt();
        //(condição) ? valor_se_verdadeiro : valor_se_falso
        pagar = (minutos > 100) ? ((minutos - 100) * 2) + 50 : 50; 

        System.out.println("Quantidade a pagar > R$" + pagar);

        sc.close();
    }
}
