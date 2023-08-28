package exercicio_04;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            double a, b, c; 
            
            System.out.println("Digite um valor para a > ");
            a = sc.nextDouble();
    
            System.out.println("Digite um valor para b > ");
            b = sc.nextDouble();
    
            System.out.println("Digite um valor para c > ");
            c = sc.nextDouble();
    
            System.out.println("ÁREA Triângulo: " + areaTriangulo(a, b, c));
            System.out.println("ÁREA Círculo: " + areaCirculo(c));
            System.out.println("ÁREA Trapézio: " + areaTrapezio(a, b, c));
            System.out.println("ÁREA Retângulo: " + areaRetangulo(a, b));
            System.out.println("ÁREA Quadrado: " + areaQuadrado(b));
        } catch(InputMismatchException e) {
            System.out.println("ERRO! Digite os valores double com ',' (vírgula).");
        } catch(Exception e) {
            System.out.println("ERRO DESCONHECIDO : " + e.getMessage());
        }
        sc.close();
    }

    public static double areaTriangulo(double a, double b, double c) {
        return (a * c) / 2;
    }

    public static double areaCirculo(double c) {
        return 3.14159 * Math.pow(c, 2);
    }

    public static double areaTrapezio(double a, double b, double c) {
        return ((a + b) / 2) * c;
    }

    public static double areaRetangulo(double a, double b) {
        return a * b;
    }

    public static double areaQuadrado(double b) {
        return Math.pow(b, 2);
    }
}
