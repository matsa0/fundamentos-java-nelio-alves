import java.util.InputMismatchException;
import java.util.Scanner;

import account.Account;
import exception.BusinessException;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            Account acc;
    
            System.out.println("Holder: ");
            String holder = sc.nextLine();
    
            System.out.println("Number: ");
            int number = sc.nextInt();
    
            System.out.println("Initial balance: ");
            double balance = sc.nextDouble();
    
            System.out.println("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            acc = new Account(holder, number, balance, withdrawLimit);

            System.out.println("Enter the amount to withdraw: ");
            double amount = sc.nextDouble();

            acc.withdraw(amount);


            System.out.println(acc);
            sc.close();
        }
        catch(InputMismatchException e) {
            System.out.println("Error! Invalid input: " + e.getMessage());
        }
        catch(BusinessException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error! Unknown exception caught: " + e.getMessage());
        }


    }
}
