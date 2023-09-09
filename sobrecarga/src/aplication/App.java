package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;
        int account;
        double initialDeposit = 0.0;
        String x;
        Account a1;

        System.out.println("*** Register a new account ***");
        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Type an account number: ");
        account = sc.nextInt();
        sc.nextLine();
        System.out.println("Do you want to make an intial deposit? (yes/no): ");
        x = sc.nextLine();

        if(x.equalsIgnoreCase("yes")) {
            System.out.println("Enter the deposit value: ");
            initialDeposit = sc.nextDouble();

            a1 = new Account(account, name, initialDeposit);
            System.out.println(a1);

            double withdraw = 50.65;
            a1.withdraw(withdraw);
            System.out.println("\nValue of withdraw with $5.00 rate > " + withdraw);
            System.out.println(a1);
        }
        else if(x.equalsIgnoreCase("no")) {
            a1 = new Account(account, name);
            System.out.println("\n" + a1);

            double deposit = 20;
            a1.deposit(deposit);
            System.out.println("\nValue of deposit > " + deposit);
            System.out.println(a1);
        }
        else {
            System.out.println("Digite um valor válido!");
        }



        sc.close();
    }
}
