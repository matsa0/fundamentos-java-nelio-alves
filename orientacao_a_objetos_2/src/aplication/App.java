package aplication;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int qntAddProduct, qntRemoveProduct, answer;
        Product p1 = new Product("Fone Bluetooth Lenovo", 74.59, 5);
        Product p2 = new Product("Caixa de Som JBL T123-98", 299.99);
        System.out.println("Teste Sobrecarga > " + p2);
        System.out.println("Product Data > " + p1);
        
        System.out.println("\nDo you want do add more products on the stock? (1 - yes, 0 - no): ");
        answer = sc.nextInt();

        if(answer == 1) {
            System.out.println("\nEnter the number os itens to be added on the stock: ");
            qntAddProduct = sc.nextInt();
            p1.AddProduct(qntAddProduct);

            System.out.println("\nUpdate data > " + p1);
        }

        System.out.println("Do you want to remove products from the stock? (1 - yes, 0 - no):");
        answer = sc.nextInt();

        if(answer == 1) {
            System.out.println("\nEnter the number os itens to be removed from the stock: ");
            qntRemoveProduct = sc.nextInt();
            p1.RemoveProduct(qntRemoveProduct);
            System.out.println("\nUpdate data > " + p1);
        }

        System.out.println("Thank you!");

        sc.close();
    }
}
