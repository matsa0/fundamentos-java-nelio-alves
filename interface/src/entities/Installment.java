package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Installment {
    private LocalDate dueDate;
    private double amount;
    private static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Installment(LocalDate dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return dueDate.format(dateFormat) + " - " + String.format("%.2f", amount);
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
