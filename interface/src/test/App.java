package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PayPalService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the contract data:");
        System.out.println("Number: ");
        int number = sc.nextInt();

        System.out.println("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dateFormat);

        System.out.println("Contract value: ");
        double value = sc.nextDouble();

        Contract contract = new Contract(number, date, value);

        System.out.println("Enter the number of installments: ");
        int installments = sc.nextInt();

        ContractService contractService = new ContractService(new PayPalService());
        contractService.processContract(contract, installments);

        System.out.println("Installments");
        for(Installment istm : contract.getInstallments()) {
            System.out.println(istm);
        }
        sc.close();
    }
}
