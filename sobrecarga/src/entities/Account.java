package entities;

public class Account {
    private final int accNumber;
    private String name;
    private double initialDeposit;
    private double balance;


    public Account(int accNumber, String name, double initialDeposit) {
        this.accNumber = accNumber;
        this.name = name;
        this.initialDeposit = initialDeposit;
        this.balance += initialDeposit;
    }

    public Account(int accNumber, String name) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        int rate = 5;
        double withdraw;
        if(balance <= amount || balance <= rate) {
            System.out.println("ATENÇÃO! Sua conta está com saldo negativo!");
            withdraw = amount + rate;
            balance -= withdraw;
        }
        withdraw = amount + rate;
        balance -= withdraw;
    }

    @Override
    public String toString() {
        return "Holder > " + getName() + 
        "\nAccount > " + getAccNumber() + 
        "\nBalance > " + String.format("%.2f", getBalance());
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return initialDeposit;
    }
    public void setDeposit(double deposit) {
        this.initialDeposit = deposit;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
