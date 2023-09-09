import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int negativeNumbers = 0;
        
        System.out.println("Enter the size of the matrix: ");
        int n = sc.nextInt();

        int mat[][] = new int [n][n];
        int diagonal[] = new int[n];

        System.out.printf("Enter numberers for the %dx%d matrix: \n", n, n);
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) { 
                /*mat[i].length, porque cada linha é um vetor, pois uma matriz é vetor de vetor. Então fazendo mat[i].lenght, você está 
                pegando os elementos daquela linha, equivalente aos elementos das colunas dessa linha*/
                int number = sc.nextInt();
                mat[i][j] = number;   

                if(number < 0) {
                    negativeNumbers++;
                }

                if(i == j) {
                    diagonal[i] = number;
                }
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<mat[i].length; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("Negative numbers > " + negativeNumbers);
        System.out.print("Main diagonal > ");
        for(int i=0; i<diagonal.length; i++) {
            System.out.print("[" + diagonal[i] + "]");
        }
        sc.close();
    }
}
