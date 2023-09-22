package account;

import exception.BusinessException;

public class Account {
    private String holder;
    private int number;
    private double balance;
    private double withdrawLimit;

    public Account(String holder, int number, double balance, double withdrawLimit) {
        this.holder = holder;
        this.number = number;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount > withdrawLimit) {
            throw new BusinessException("Withdraw Error! The amount exceeds the withdraw limit!");
        }
        else if(amount > balance) {
            throw new BusinessException("Withdraw Error! Not enough balance!");
        }
        else if(amount > balance && amount > withdrawLimit) {
            throw new BusinessException("Withdraw Error! Not enough balance and exceeds the withdraw limit");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return holder + " - " + number + " - R$" + String.format("%.2f", balance);
    }

    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
